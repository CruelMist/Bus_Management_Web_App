package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.RecruiterDAO;
import Model.Recruiter;
import java.util.List;

public final class compInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");

    String use=(String)session.getAttribute("email");
    RecruiterDAO uAccess=new RecruiterDAO();
    List<Recruiter> uL=uAccess.getRecruiter(use);
    
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"addCompInfo\" method=\"POST\">\n");
      out.write("            <table>\n");
      out.write("                ");
 for (Recruiter u: uL){
      out.write("\n");
      out.write("                <tr><th>Email</th><td>");
      out.print(u.getEmail());
      out.write("</td></tr>\n");
      out.write("                <tr><th>Username</th><td>");
      out.print(u.getUsername());
      out.write("</td></tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                <tr><th>Company Name</th><td><input type=\"text\" name=\"cname\" placeholder=\"Company Name\"></td></tr>\n");
      out.write("                <tr><th>Address</th><td><input type=\"text\" name=\"address\" placeholder=\"Address\"></td></tr>\n");
      out.write("                <tr><th>City</th><td><input type=\"text\" name=\"city\" placeholder=\"City\"></td></tr>\n");
      out.write("                <tr><th>State</th><td><input type=\"text\" name=\"state\" placeholder=\"State\"></td></tr>\n");
      out.write("                <tr><th>About the Company</th>\n");
      out.write("                    <td><textarea name=\"about\" maxlength=\"255\" rows=\"5\" cols=\"35\" placeholder=\"Discription Here (Not more than 255 characters)\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"2\"><button type=\"submit\">Submit</button></td></tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("        </form>\n");
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
