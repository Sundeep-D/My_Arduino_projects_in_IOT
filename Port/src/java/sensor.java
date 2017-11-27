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
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class sensor {

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
String a[]=value.split(" ");
String unit=a[0];
//JOptionPane.showMessageDialog(null, temp);
String electricity_status=a[2];
   String cost=a[1];
   
   int t = Integer.parseInt(electricity_status);
//JOptionPane.showMessageDialog(null, gas);
   XLSXReaderWriter r=new XLSXReaderWriter();
//   r.port(temp, gas);
   



try
{
                       //String e="a"; 
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/meter","root","root");
                        PreparedStatement ps=con.prepareStatement("insert into sm(u,c,e)values(?,?,?)");
                        ps.setString(1,unit);
                         ps.setString(2,cost);
                          ps.setString(3,electricity_status);
                        
                          
                          if(t==1){
                          System.out.println("UNIT  : "+unit+"    "+"COST : "+cost);
                        url u1=new url();
                        u1.sendGet(unit);
                         url1 u11=new url1();
                        u11.sendGet(cost);
                        int x=ps.executeUpdate();
                          }
                          else
                          {
                              System.out.println("UNIT  : "+unit+"    "+"No Electricity in Home");
                          }
                      
                        
                        
                        
                       
                       
//			try{value = Integer.parseInt(data.nextLine());}catch(Exception e){}
//			slider.setValue(value);
                        



//                              sun edit
}  
                        
                      
                         catch(Exception g)
 {
     
 }
                        
                        
                        
                        
                        
                        
                        
                        
                 }

//out.close();
data.close();
System.out.println("Done.");
}
}






