package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public final class SMARTSHOP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>WASTE MANAGEMENT</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>IOT BASED SMART SHOPPING SYSTEM</h1>\n");
      out.write("        \n");
      out.write("        <table style=\"margin-left: 400px;width: 500px\">\n");
      out.write("            <tr><td><strong>S no</strong></td><td><strong>product</strong></td><td><strong>price</strong></td></tr>\n");
      out.write("            \n");
      out.write("            ");
response.setIntHeader("Refresh", 1);
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
                            
      out.write("\n");
      out.write("                            <tr><td>");
      out.print(i);
      out.write("</td><td>");
      out.print(rs.getString("distance"));
      out.write("</td><td>");
      out.print(price);
      out.write("</td></tr>\n");
      out.write("            ");

                            i++;
                        }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
      out.write("\n");
      out.write("            <!--<tr><td><strong>Distance</strong></td><td><strong><input type=\"text\" value=\"");
      out.print();
      out.write("\"></strong></td></tr>-->\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
