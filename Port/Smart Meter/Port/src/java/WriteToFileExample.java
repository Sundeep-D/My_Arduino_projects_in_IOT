 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ARUN
 */


//import com.dropbox.client2.exception.DropboxException;
//import com.dropbox.core.DbxEntry;
//import com.dropbox.core.DbxWriteMode;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class WriteToFileExample {
	public static void main(String[] args) {
	
	}

//    private static DbxEntry.File uploadFile(String magnumopustxt, DbxWriteMode add, long length, FileInputStream inputStream) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    void cdagen(String pname, String pid, String dob, String gender, String addmit, String blood, String proname, String reson, String smok, String docname, String docid, String gen, String hos, String spl, String pblm, String lab, String imm, String hosname, String hadd,String clindate,String diago,String history,String clidate,String diagon,String procedur,String labro,String cldate,String hismedi,String proced,String labroa) throws DropboxException, Throwable { 
        void cdagen(String data1) throws  Throwable {
    	try {
                    
          String port="Patient Name                   :"+data1;
   
          
          ArrayList a=new ArrayList();
          
          a.add(port);
		

          
			File file = new File("D:\\"+port+".txt");
                                         
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());                        
			BufferedWriter bw = new BufferedWriter(fw);
                        
                        for(int j=0;j<a.size();j++)
                        {
                            bw.write((String)a.get(j));
			    bw.newLine();
                        }
			bw.close();
             
         

		} catch (Exception e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null, e);
                        
		}    
    }

    void cdagen(boolean data1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
