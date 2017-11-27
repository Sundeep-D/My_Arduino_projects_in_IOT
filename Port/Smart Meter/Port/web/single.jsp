<%-- 
    Document   : single
    Created on : 24 Oct, 2017, 1:29:31 PM
    Author     : Kiruthigha
--%>

<%@page import="java.sql.ResultSet"%>
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
        <h1>WASTE MANAGEMENT SYSTEM</h1>
        
        <table style="margin-left: 400px;width: 500px">
            <!--<tr><td><strong>S no</strong></td><td><strong>Distance</strong></td></tr>-->
            
            <%response.setIntHeader("Refresh", 1);
            String k="";
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                        Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/port","root","root");
                        PreparedStatement ps=con.prepareStatement("select * from single");
                        ResultSet rs=ps.executeQuery();
                        int i=1;
                        while(rs.next())
                        {
                            k=rs.getString("distance");
                            %>
                            <!--<tr><td><%=i%></td><td><%=rs.getString("distance")%></td></tr>-->
            <%
                            i++;
                        }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            %>
            <tr><td><strong>Distance</strong></td><td><strong><input type="text" value="<%=k%>"></strong></td></tr>
        </table>
    </body>
</html>
