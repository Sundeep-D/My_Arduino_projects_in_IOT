import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.management.timer.Timer;
import javax.swing.JFrame;
import javax.swing.JSlider;

import com.fazecast.jSerialComm.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class sensor1 {

public static void main(String[] args) throws IOException {


SerialPort[] ports = SerialPort.getCommPorts();
System.out.println("Select a port:");
int i = 1;
for(SerialPort port : ports)
System.out.println(i++ + ": " + port.getSystemPortName());
Scanner s = new Scanner(System.in);
int chosenPort = s.nextInt();

SerialPort serialPort = ports[chosenPort - 1];
if(serialPort.openPort())
System.out.println("Port opened successfully.");
else {
System.out.println("Unable to open the port.");
return;
}

serialPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);

Scanner data = new Scanner(serialPort.getInputStream());
String value;
//FileWriter fw = new FileWriter("F:\\port.txt", true);
//BufferedWriter bw= new BufferedWriter(fw);
//PrintWriter out=new PrintWriter(bw);
while(data.hasNext()){
    

value = data.nextLine();
//System.out.println((String)data.nextLine());
//System.out.println((String)data.nextLine());

//String a[]=data.nextLine().split(",");
//String a[]=value.split(",");
//String temp=a[0];
//JOptionPane.showMessageDialog(null, temp);
//   String gas=a[1];
//JOptionPane.showMessageDialog(null, gas);
   XLSXReaderWriter r=new XLSXReaderWriter();
//   r.port(temp, gas);
   



try{
                        
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/port","root","root");
                        PreparedStatement ps=con.prepareStatement("insert into single(distance)values(?)");
                        ps.setString(1,value);
//                         ps.setString(2,gas);
//                          ps.setString(2,(String)data.nextLine());
                        
                        System.out.println(value);
//                        url u1=new url();
//                        u1.sendGet(temp,gas);
                        int x=ps.executeUpdate();
                        if(x!=0){
                            
                          
                        }
                       
//			try{value = Integer.parseInt(data.nextLine());}catch(Exception e){}
//			slider.setValue(value);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
    
}

//out.close();
data.close();
System.out.println("Done.");
}

} 

