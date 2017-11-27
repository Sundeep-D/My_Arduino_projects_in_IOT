import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JSlider;
import com.fazecast.jSerialComm.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

	public static void main(String[] args) throws Throwable {
//		JFrame window = new JFrame();
//		JSlider slider = new JSlider();
//		slider.setMaximum(1023);
//		window.add(slider);
//		window.pack();
//		window.setVisible(true);

		SerialPort[] ports = SerialPort.getCommPorts();
		System.out.println("Select a port:");
		int i = 1;
		for(SerialPort port : ports)
			System.out.println(i++ +  ": " + port.getSystemPortName());
		Scanner s = new Scanner(System.in);
		int chosenPort = s.nextInt();

		SerialPort serialPort = ports[chosenPort - 1];
		if(serialPort.openPort())
			             System.out.println("Port opened successfully.");
		else {
			                 System.out.println("Unable to open the port.");
			return;
		}
		//serialPort.setComPortParameters(9600, 8, 1, SerialPort.NO_PARITY);
		serialPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING, 0, 0);

		Scanner data = new Scanner(serialPort.getInputStream());

		while(data.hasNextLine()){
                  
//                        System.out.println(data.nextLine());
//                         String che=Integer.toString(i);
                       
                    try{
                         XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("port");
        FileOutputStream outputStream = new FileOutputStream("F:\\port.xlsx"+data.nextLine());
                        workbook.write(outputStream);
                        
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/port","root","root");
                        PreparedStatement ps=con.prepareStatement("insert into por(gas) values(?)");
//                        ps.setString(1,(String)data.nextLine());
//                         ps.setString(2,(String)data.nextLine());
                        
                        int x=ps.executeUpdate();
                        if(x!=0){
//                            FileWriter fw = new FileWriter(f.getAbsoluteFile());                        
//			    BufferedWriter bw = new BufferedWriter(fw);
//                            bw.write((String)data.nextLine());
//                            bw.newLine();
//                            bw.close();
                        }
                       
//			try{value = Integer.parseInt(data.nextLine());}catch(Exception e){}
//			slider.setValue(value);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
		}
//		System.out.println("Done.");
	}

}