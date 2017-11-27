<%-- 
    Document   : newjspdf
    Created on : 8 Nov, 2017, 6:29:36 PM
    Author     : Kiruthigha
--%>

<<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WASTE MANAGEMENT</title>
    </head>
    <body>
        <h1>IOT BASED SMART SHOPPING SYSTEM</h1>
        
        <table style="margin-left: 400px;width: 500px">
            <tr><td><strong>S no</strong></td><td><strong>product</strong></td><td><strong>price</strong></td></tr>
            
            <%
            String product="";
            String price="";
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                        Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/port","root","root");
                        PreparedStatement ps=con.prepareStatement("select * from single");
                        ResultSet rs=ps.executeQuery();
                        int i=1;
                        while(rs.next())
                        {
                            product=rs.getString("distance");
                            if(product.equals("PEPSI"))
                            {
                                price="35";
                            }
                            else
                            {
                                price="40";
                            }
                            %>
                            <tr><td><%=i%></td><td><%=rs.getString("distance")%></td><td><%=price%></td></tr>
            <%
                            i++;
                        }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            %>
             </table>
    </body>
</html>
