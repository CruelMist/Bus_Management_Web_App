package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Profile</title>\n");
      out.write("        \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("\t\t\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("                <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\n");
      out.write("                 <style>\n");
      out.write("\t\t\t\tbody{\n");
      out.write("                        background: -webkit-linear-gradient(left, #3931af, #00c6ff);\n");
      out.write("                    }\n");
      out.write("                    .emp-profile{\n");
      out.write("                        padding: 3%;\n");
      out.write("                        margin-top: 3%;\n");
      out.write("                        margin-bottom: 3%;\n");
      out.write("                        border-radius: 0.5rem;\n");
      out.write("                        background: #fff;\n");
      out.write("                    }\n");
      out.write("                    .profile-img{\n");
      out.write("                        text-align: center;\n");
      out.write("                    }\n");
      out.write("                    .profile-img img{\n");
      out.write("                        width: 70%;\n");
      out.write("                        height: 100%;\n");
      out.write("                    }\n");
      out.write("                    .profile-img .file {\n");
      out.write("                        position: relative;\n");
      out.write("                        overflow: hidden;\n");
      out.write("                        margin-top: -20%;\n");
      out.write("                        width: 70%;\n");
      out.write("                        border: none;\n");
      out.write("                        border-radius: 0;\n");
      out.write("                        font-size: 15px;\n");
      out.write("                        background: #212529b8;\n");
      out.write("                    }\n");
      out.write("                    .profile-img .file input {\n");
      out.write("                        position: absolute;\n");
      out.write("                        opacity: 0;\n");
      out.write("                        right: 0;\n");
      out.write("                        top: 0;\n");
      out.write("                    }\n");
      out.write("                    .profile-head h5{\n");
      out.write("                        color: #333;\n");
      out.write("                    }\n");
      out.write("                    .profile-head h6{\n");
      out.write("                        color: #0062cc;\n");
      out.write("                    }\n");
      out.write("                    .profile-edit-btn{\n");
      out.write("                        border: none;\n");
      out.write("                        border-radius: 1.5rem;\n");
      out.write("                        width: 70%;\n");
      out.write("                        padding: 2%;\n");
      out.write("                        font-weight: 600;\n");
      out.write("                        color: #6c757d;\n");
      out.write("                        cursor: pointer;\n");
      out.write("                    }\n");
      out.write("                    .proile-rating{\n");
      out.write("                        font-size: 12px;\n");
      out.write("                        color: #818182;\n");
      out.write("                        margin-top: 5%;\n");
      out.write("                    }\n");
      out.write("                    .proile-rating span{\n");
      out.write("                        color: #495057;\n");
      out.write("                        font-size: 15px;\n");
      out.write("                        font-weight: 600;\n");
      out.write("                    }\n");
      out.write("                    .profile-head .nav-tabs{\n");
      out.write("                        margin-bottom:5%;\n");
      out.write("                    }\n");
      out.write("                    .profile-head .nav-tabs .nav-link{\n");
      out.write("                        font-weight:600;\n");
      out.write("                        border: none;\n");
      out.write("                    }\n");
      out.write("                    .profile-head .nav-tabs .nav-link.active{\n");
      out.write("                        border: none;\n");
      out.write("                        border-bottom:2px solid #0062cc;\n");
      out.write("                    }\n");
      out.write("                    .profile-work{\n");
      out.write("                        padding: 14%;\n");
      out.write("                        margin-top: -15%;\n");
      out.write("                    }\n");
      out.write("                    .profile-work p{\n");
      out.write("                        font-size: 12px;\n");
      out.write("                        color: #818182;\n");
      out.write("                        font-weight: 600;\n");
      out.write("                        margin-top: 10%;\n");
      out.write("                    }\n");
      out.write("                    .profile-work a{\n");
      out.write("                        text-decoration: none;\n");
      out.write("                        color: #495057;\n");
      out.write("                        font-weight: 600;\n");
      out.write("                        font-size: 14px;\n");
      out.write("                    }\n");
      out.write("                    .profile-work ul{\n");
      out.write("                        list-style: none;\n");
      out.write("                    }\n");
      out.write("                    .profile-tab label{\n");
      out.write("                        font-weight: 600;\n");
      out.write("                    }\n");
      out.write("                    .profile-tab p{\n");
      out.write("                        font-weight: 600;\n");
      out.write("                        color: #0062cc;\n");
      out.write("                    }\n");
      out.write("                    </style>\n");
      out.write("        \n");
      out.write("                   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/carpool?useSSL=false","root","devil114");
            String user=(String)session.getAttribute("user");
            String query1="select * from userprof where email=?";
            PreparedStatement pstmt=conn.prepareStatement(query1);
            pstmt.setString(1,user);
            ResultSet rs=pstmt.executeQuery();
            
      out.write("\n");
      out.write("        <div class=\"container emp-profile\">\n");
      out.write("            <form action=\"Profile\" method=\"post\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <div class=\"profile-img\">\n");
      out.write("                                        <img src=\"images/user.png\" alt=\"\"/>\n");
      out.write("                                        <div class=\"file btn btn-lg btn-primary\">\n");
      out.write("                                            Change Photo\n");
      out.write("                                            <input type=\"file\" name=\"file\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");
 while(rs.next())
                                {
      out.write("\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"profile-head\">\n");
      out.write("                                                <h5>\n");
      out.write("                                                    ");
      out.print(rs.getString(1)+" "+rs.getString(2));
      out.write("\n");
      out.write("                                                </h5>\n");
      out.write("                                                \n");
      out.write("                                                <p class=\"proile-rating\">RATING : <span>4.2/5</span></p>\n");
      out.write("                                        <ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\">\n");
      out.write("                                            <li class=\"nav-item\">\n");
      out.write("                                                <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\" aria-controls=\"home\" aria-selected=\"true\">About</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"nav-item\">\n");
      out.write("                                                <a class=\"nav-link\" id=\"profile-tab\" data-toggle=\"tab\" href=\"#profile\" role=\"tab\" aria-controls=\"profile\" aria-selected=\"false\">Edit Profile</a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <button class=\"profile-edit-btn\"  name=\"btnAddMore\" ><a href=\"index.jsp\" class=\"profile-edit-btn\">Go Back</a></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <div class=\"profile-work\">\n");
      out.write("                                        <p>RECENT TRIPS</p>\n");
      out.write("                                        <a href=\"\">Trip 1</a><br/>\n");
      out.write("                                        <a href=\"\">Trip 2</a><br/>\n");
      out.write("                                        <a href=\"\">Trip 3</a>\n");
      out.write("                                        <p>RATINGS</p>\n");
      out.write("                                        <a href=\"\">3/5</a><br/>\n");
      out.write("                                        <a href=\"\">4/5</a><br/>\n");
      out.write("                                        <a href=\"\">2/5</a><br/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <div class=\"tab-content profile-tab\" id=\"myTabContent\">\n");
      out.write("                                        <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <label>First Name</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <p>");
      out.print(rs.getString(1));
      out.write("</p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <label>Last Name</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <p>");
      out.print(rs.getString(2));
      out.write("</p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <label>Email</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <p>");
      out.print(rs.getString(3));
      out.write("</p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <label>Phone</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            ");
 if(rs.getString(4)==null)
                                                            {
      out.write("\n");
      out.write("                                                            <p>No Number Provided</p>\n");
      out.write("                                                            ");
}
                                                            else
                                                             {
      out.write("\n");
      out.write("                                                             <p>");
      out.print(rs.getString(4));
      out.write("</p>\n");
      out.write("                                                             ");
}
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <label>Address</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            ");
 if(rs.getString(5)==null)
                                                            {
      out.write("\n");
      out.write("                                                            <p>No Address Provided</p>\n");
      out.write("                                                            ");
}
                                                            else
                                                             {
      out.write("\n");
      out.write("                                                             <p>");
      out.print(rs.getString(5));
      out.write("</p>\n");
      out.write("                                                             ");
}
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"tab-pane fade\" id=\"profile\" role=\"tabpanel\" aria-labelledby=\"profile-tab\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <label>First Name</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <input id=\"name\" name=\"fname\" placeholder=\"");
      out.print(rs.getString(1));
      out.write("\" class=\"form-control here\" type=\"text\" disabled>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <label>Last Name</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <input id=\"name\" name=\"lname\" placeholder=\"");
      out.print(rs.getString(2));
      out.write("\" class=\"form-control here\" type=\"text\" disabled>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <label>Email</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <input id=\"email\" name=\"email\" placeholder=\"");
      out.print(rs.getString(3));
      out.write("\" class=\"form-control here\" required=\"required\" type=\"text\" disabled>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <label>Phone</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            ");
 if(rs.getString(4)==null)
                                                            {
      out.write("\n");
      out.write("                                                            <input id=\"phone\" name=\"phno\" placeholder=\"Phone Number\" class=\"form-control here\" required=\"required\" type=\"number\">\n");
      out.write("                                                            ");
}
                                                            else
                                                             {
      out.write("\n");
      out.write("                                                             <input id=\"phone\" name=\"phno\" placeholder=\"");
      out.print(rs.getString(4));
      out.write("\" class=\"form-control here\" required=\"required\" type=\"number\">\n");
      out.write("                                                             ");
}
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <label>Address</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            ");
 if(rs.getString(5)==null)
                                                            {
      out.write("\n");
      out.write("                                                            <input id=\"address\" name=\"add\" placeholder=\"Address\" class=\"form-control here\" required=\"required\" type=\"text\">\n");
      out.write("                                                            ");
}
                                                            else
                                                             {
      out.write("\n");
      out.write("                                                             <input id=\"address\" name=\"add\" placeholder=\"");
      out.print(rs.getString(5));
      out.write("\" class=\"form-control here\" required=\"required\" type=\"text\">\n");
      out.write("                                                             ");
}
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <input type=\"submit\" class=\"profile-edit-btn\" name=\"btnAddMore\" value=\"Save Changes\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>           \n");
      out.write("                    </div>\n");
      out.write("                                                        ");
}
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
