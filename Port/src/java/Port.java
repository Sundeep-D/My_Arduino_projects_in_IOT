/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.fazecast.jSerialComm.SerialPort;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ARUN
 */
public class Port extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
                String por=request.getParameter("port");
            
            
                SerialPort[] ports = SerialPort.getCommPorts();
		System.out.println("Select a port:");
		int i = 1;
		for(SerialPort port : ports)
			System.out.println(i++ +  ": " + port.getSystemPortName());
		Scanner s = new Scanner(System.in);
		int chosenPort = s.nextInt();

		SerialPort serialPort = ports[chosenPort - 1];
		if(serialPort.openPort())
			JOptionPane.showMessageDialog(null,"Port opened successfully.");
		else {
			JOptionPane.showMessageDialog(null,"Unable to open the port.");
			return;
		}
		//serialPort.setComPortParameters(9600, 8, 1, SerialPort.NO_PARITY);
		serialPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING, 0, 0);
                Scanner data = new Scanner(serialPort.getInputStream());
             
//		int value = 0;
		while(data.hasNextLine()){
                  
//                        System.out.println(data.nextLine());
                    try{
                        
//                       SimpleExcelWriterExample xl=new SimpleExcelWriterExample();
                        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("port");
        FileOutputStream outputStream = new FileOutputStream("D:\\JavaBooks.xlsx");
                        workbook.write(outputStream);
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/port","root","root");
                        PreparedStatement ps=con.prepareStatement("insert into por(temperature,gas)values(?,?)");
                        ps.setString(1,(String)data.nextLine());
                        ps.setString(2,(String)data.nextLine());
                        
                        int x=ps.executeUpdate();
                        if(x!=0){
                            JOptionPane.showMessageDialog(null, "success");
                        }
                        else{
                             JOptionPane.showMessageDialog(null, "Failed");
                        }
                    
//			try{value = Integer.parseInt(data.nextLine());}catch(Exception e){}
//			slider.setValue(value);
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
        }
    }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
