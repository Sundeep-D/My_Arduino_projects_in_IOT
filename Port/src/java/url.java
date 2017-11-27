/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kiruthigha
 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.net.ssl.HttpsURLConnection;

public class url {

	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {

		url http = new url();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();

//		System.out.println("\nTesting 2 - Send Http POST request");
//		http.sendPost();

	}

	// HTTP GET request
        private void sendGet() throws Exception {
        
        }
	public void sendGet(String s) throws Exception {
            
            
                      
                        int c = Integer.parseInt(s);
                        int b=99;
                        if(c==b)
                        {
      
                                  final String mailid="tamilnaduelectricityboard007@gmail.com ";
    
                                     final String password="123123123123";
                                         String to="sundeep0412@gmail.com";
                                                     String sub="Alert from TNEB";
                                        String msg="Hello Mr.AAA ,you have consumed 100 KWh units of free Electricity issued by TamilNadu Electricity Board(TNEB). Save Electricity for future generation!";
                                                          Properties prop=new Properties();
                                                 prop.put("mail.smtp.ssl.trust","smtp.gmail.com");
                                         prop.put("mail.smtp.auth",true);
                                                              prop.put("mail.smtp.starttls.enable",true);
                                                 prop.put("mail.smtp.host","smtp.gmail.com");
                                                         prop.put("mail.smtp.port","587");
          
                                                         Session session= Session.getInstance(prop,new javax.mail.Authenticator() 

                  
          {
                        protected javax.mail.PasswordAuthentication getPasswordAuthentication()
                     
             {
                         return new javax.mail.PasswordAuthentication(mailid, password);
                 
             }
          });
          try
          {
           Message message=new MimeMessage(session);   
           message.setFrom(new InternetAddress("PEEDNUS"));
          message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
          message.setSubject(sub);
          message.setText(msg);
          Transport.send(message);
          System.out.println("mail sent");
          }
          catch(Exception h)
          {
              System.out.println("Unable to send--Network Error!");
          }
       
                        


}

		String url = "https://api.thingspeak.com/update?api_key=7FWYYPBGEKR59PK2&field1="+s.trim();

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());

	}

	// HTTP POST request
//	private void sendPost() throws Exception {
//
//		String url = "https://selfsolve.apple.com/wcResults.do";
//		URL obj = new URL(url);
//		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
//
//		//add reuqest header
//		con.setRequestMethod("POST");
//		con.setRequestProperty("User-Agent", USER_AGENT);
//		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
//
//		String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
//
//		// Send post request
//		con.setDoOutput(true);
//		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//		wr.writeBytes(urlParameters);
//		wr.flush();
//		wr.close();
//
//		int responseCode = con.getResponseCode();
//		System.out.println("\nSending 'POST' request to URL : " + url);
//		System.out.println("Post parameters : " + urlParameters);
//		System.out.println("Response Code : " + responseCode);
//
//		BufferedReader in = new BufferedReader(
//		        new InputStreamReader(con.getInputStream()));
//		String inputLine;
//		StringBuffer response = new StringBuffer();
//
//		while ((inputLine = in.readLine()) != null) {
//			response.append(inputLine);
//		}
//		in.close();
//
//		//print result
//		System.out.println(response.toString());
//
//	}

}
