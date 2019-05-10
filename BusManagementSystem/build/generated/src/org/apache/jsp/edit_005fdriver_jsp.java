package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_005fdriver_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\"> -->\n");
      out.write("        <script src=\"jquery-3.3.1.js\"></script>\n");
      out.write("        <!-- <script type=\"text/javascript\" src=\"iconwc.js\"></script> -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"animate.css\">\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"styles1.css\"> -->\n");
      out.write("        <style media=\"screen\">\n");
      out.write("            body{\n");
      out.write("                margin:0;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                background: rgb(170, 24, 24);\n");
      out.write("            }\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                /* width:250vh; */\n");
      out.write("                height:95vh;\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                background-size: cover;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                /* display:none; */\n");
      out.write("            }\n");
      out.write("            form\n");
      out.write("            {\n");
      out.write("                width:100%;\n");
      out.write("                display:\"flex\";\n");
      out.write("                flex-wrap: \"wrap\";\n");
      out.write("                flex-direction: column;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                padding:10px;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                width:50%;\n");
      out.write("                padding:10px;\n");
      out.write("                display: block;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 5%;\n");
      out.write("                color:white;\n");
      out.write("                margin: 15% auto 10% auto;\n");
      out.write("                background-color: rgb(170, 33, 33);\n");
      out.write("            }\n");
      out.write("            button:hover\n");
      out.write("            {\n");
      out.write("                background-color: rgb(216, 8, 8);\n");
      out.write("            }\n");
      out.write("            .footer\n");
      out.write("            {\n");
      out.write("                bottom:0px;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                font-size: 2.8vh;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                position: absolute;\n");
      out.write("                height:5%;\n");
      out.write("                width:100%;\n");
      out.write("                color: white;\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("            .header\n");
      out.write("            {\n");
      out.write("                top:0px;\n");
      out.write("                position: absolute;\n");
      out.write("                height:5%;\n");
      out.write("                width:100%;\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("            .form-box\n");
      out.write("            {\n");
      out.write("                width:20%;\n");
      out.write("                /* height:50%; */\n");
      out.write("                display:flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                flex-direction: column;\n");
      out.write("                align-items: center;\n");
      out.write("                background-color: black;\n");
      out.write("                padding:10px;\n");
      out.write("                border-radius: 4%;\n");
      out.write("            }\n");
      out.write("            .bus,.driver,.route,.date{\n");
      out.write("                display: block;\n");
      out.write("                width:70%;\n");
      out.write("                padding:10px;\n");
      out.write("                display: block;\n");
      out.write("                background-color:rgb(177, 170, 170);\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4%;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration:none;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <!-- <img class=\"logo\" src=\"cu_logo3.png\"> -->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"form-box\">\n");
      out.write("                <form name=\"edit_schedule\" action=\"AddDriver\" method=\"POST\">\n");
      out.write("                    <p>Driver Name:</p>\n");
      out.write("                    <input type=\"text\" name=\"driverName\">\n");
      out.write("                    <p>Contact Number:</p>\n");
      out.write("                    <input type=\"text\" name=\"driverContact\">\n");
      out.write("                    <button type=\"submit\"><a href=\"driver.jsp\">Submit</a></button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            Copyright © Chitkara University 2019\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function validateForm() {\n");
      out.write("            var x = document.forms[\"myForm\"][\"bus\"].value;\n");
      out.write("            if (x == \"\") {\n");
      out.write("            alert(\"Name must be filled out\");\n");
      out.write("            return false;\n");
      out.write("            }\n");
      out.write("            var y=document.forms[\"myForm\"][\"bus\"].value;\n");
      out.write("            if(x){}\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
