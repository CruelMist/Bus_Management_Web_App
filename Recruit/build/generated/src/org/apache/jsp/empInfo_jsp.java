package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Candidate;
import Model.CandidateDAO;
import java.util.List;
import Model.User;
import Model.UserDAO;

public final class empInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");

    String use=(String)session.getAttribute("email");
    CandidateDAO uAccess=new CandidateDAO();
    List<Candidate> uL=uAccess.getCandidate(use);
    
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>EmployeeInfo</title>\n");
      out.write("        \n");
      out.write("           <link rel=\"stylesheet\" href=\"myCss.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"newCss.css\" type=\"text/css\">\n");
      out.write("        <script src=\"WEB-INF/assets/code.jquery.com_jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"https://use.fontawesome.com/releases/v5.0.6/css/all.css\" rel=\"stylesheet\">\n");
      out.write("  <style>\n");
      out.write("      .sect\n");
      out.write("      {\n");
      out.write("          height:auto;\n");
      out.write("          background-position: center;\n");
      out.write("          background-attachment: local;\n");
      out.write("      }\n");
      out.write("      .clear-filter2 {\n");
      out.write("\n");
      out.write("    background: -webkit-linear-gradient(left, transparent 0%,#fff 50%,transparent 100%);\n");
      out.write("    background: linear-gradient(to top, rgba(255,0,0,0), rgba(255,0,0,1));\n");
      out.write("    background: rgba(255,0 ,0, .2);\n");
      out.write("    background: linear-gradient(rgba(26, 188, 156,.7),rgba(241, 196, 15,.7));\n");
      out.write("    -webkit-background-size: cover;\n");
      out.write("    background-size: cover;\n");
      out.write("    background-attachment: fixed;\n");
      out.write("    text-align: center;\n");
      out.write("    color:white;\n");
      out.write("    /* height: 100vh; */\n");
      out.write("    z-index: -1;\n");
      out.write("}\n");
      out.write(".table{\n");
      out.write("    padding:5%;\n");
      out.write("    margin :0 auto;\n");
      out.write("    padding-top:40px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".form{\n");
      out.write("    margin :0 auto;\n");
      out.write("    padding-top:80px;}\n");
      out.write(".form table > tr > td > input{\n");
      out.write("     border: 0;\n");
      out.write("    outline: none;\n");
      out.write("    height: 40px;\n");
      out.write("    \n");
      out.write("}/*\n");
      out.write("input:hover{opacity:1;}\n");
      out.write("  input, textarea, select {\n");
      out.write("    width : 150px;\n");
      out.write("    margin: 0;\n");
      out.write("  \n");
      out.write("    -webkit-box-sizing: border-box;  For legacy WebKit based browsers \n");
      out.write("       -moz-box-sizing: border-box;  For legacy (Firefox <29) Gecko based browsers \n");
      out.write("            box-sizing: border-box;\n");
      out.write("  }*/\n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"sect\"  >\n");
      out.write("    \n");
      out.write("    <div  class=\" clear-filter2\" style=\" background: linear-gradient(rgba(250,128,114 ,.7),rgba(1,1,1,.7)),url(https://i.pinimg.com/originals/eb/2a/33/eb2a33ef67815e219f838d69e642aaf2.jpg);\">\n");
      out.write("      <nav id=\"navi\" class=\"navbar navbar-expand-lg bg-primary fixed-top navbar-transparent \" color-on-scroll=\"400\">\n");
      out.write("      <span class=\"open-slide\">\n");
      out.write("          <a href=\"#\" onclick=\"openSlideMenu()\">\n");
      out.write("            <svg width=\"30\" height=\"30\">\n");
      out.write("                <path d=\"M0,5 30,5\" stroke=\"#fff\" stroke-width=\"1.5\"/>\n");
      out.write("                <path d=\"M0,14 30,14\" stroke=\"#fff\" stroke-width=\"1.5\"/>\n");
      out.write("                <path d=\"M0,23 30,23\" stroke=\"#fff\" stroke-width=\"1.5\"/>\n");
      out.write("            </svg>\n");
      out.write("          </a>\n");
      out.write("        </span>\n");
      out.write("        <div id=\"side-menu\" class=\"side-nav nav-item\">\n");
      out.write("          <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\n");
      out.write("          <a href=\"./myproject/my.html\">Home</a>\n");
      out.write("          <a href=\"./myproject/about.html\">About</a>\n");
      out.write("          <a href=\"./myproject/services.html\">Services</a>\n");
      out.write("          <a href=\"./myproject/contact.html#\">Contact</a>\n");
      out.write("        </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"navbar-translate\">\n");
      out.write("       \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <button class=\"navbar-toggler navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-bar top-bar\"></span>\n");
      out.write("          <span class=\"navbar-toggler-bar middle-bar\"></span>\n");
      out.write("          <span class=\"navbar-toggler-bar bottom-bar\"></span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"collapse navbar-collapse justify-content-end\" id=\"navigation\" data-nav-image=\"./assets/img/blurred-image-1.jpg\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"javascript:void(0)\"  onclick=\"scrollToSign()\" >\n");
      out.write("        \n");
      out.write("              <p>Logout</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("         \n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" rel=\"tooltip\" title=\"Follow us on Twitter\" data-placement=\"bottom\" href=\"https://twitter.com\" target=\"_blank\">\n");
      out.write("              <i class=\"fab fa-twitter\"></i>\n");
      out.write("              <p class=\"d-lg-none d-xl-none\">Twitter</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" rel=\"tooltip\" title=\"Like us on Facebook\" data-placement=\"bottom\" href=\"https://www.facebook.com\" target=\"_blank\">\n");
      out.write("              <i class=\"fab fa-facebook-square\"></i>\n");
      out.write("              <p class=\"d-lg-none d-xl-none\">Facebook</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" rel=\"tooltip\" title=\"Follow us on Instagram\" data-placement=\"bottom\" href=\"https://www.instagram.com/kapoortania00\" target=\"_blank\">\n");
      out.write("              <i class=\"fab fa-instagram\"></i>\n");
      out.write("              <p class=\"d-lg-none d-xl-none\">Instagram</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("        <!--nav ends-->\n");
      out.write("               \n");
      out.write("          <div id=\"side-menu\" class=\"side-nav\">\n");
      out.write("       \n");
      out.write("        <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\n");
      out.write("        <a href=\"./myproject/my.html\">Home</a>\n");
      out.write("        <a href=\"./myproject/about.html\">About</a>\n");
      out.write("        <a href=\"./myproject/services.html\">Services</a>\n");
      out.write("        <a href=\"./myproject/contact.html\">Contact</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("        <form action=\"addEmpInfo\" method=\"POST\">\n");
      out.write("            <table class=\"table\">\n");
      out.write("                ");
 for (Candidate u: uL){
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
      out.write("                <tr><th>First Name</th><td><input class=\"text_field\" type=\"text\" name=\"fname\" placeholder=\"First Name\"></td></tr>\n");
      out.write("                <tr><th>Last Name</th><td><input class=\"text_field\" type=\"text\" name=\"lname\" placeholder=\"Last Name\"></td></tr>\n");
      out.write("                <tr><th>Phone Number</th>\n");
      out.write("                    <td><input class=\"text_field\" type=\"number\" name=\"phone\" min=\"1000000000\" max=\"9999999999\" placeholder=\"Phone Number\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><th>Address</th><td><input class=\"text_field\" type=\"text\" name=\"address\" placeholder=\"Address\"></td></tr>\n");
      out.write("                <tr><th>City</th><td><input class=\"text_field\" type=\"text\" name=\"city\" placeholder=\"City\"></td></tr>\n");
      out.write("                <tr><th>State</th><td><input class=\"text_field\" type=\"text\" name=\"state\" placeholder=\"State\"></td></tr>\n");
      out.write("                <tr><th>Marks in 10th</th><td><input class=\"text_field\" type=\"text\" name=\"marks10\" placeholder=\"Marks\" step=\".1\"></td></tr>\n");
      out.write("                <tr><th>Marks in 12th</th><td><input class=\"text_field\" type=\"text\" name=\"marks12\" placeholder=\"Marks (in %)\" step=\".01\"></td></tr>\n");
      out.write("                <tr><th>CGPA in College</th><td><input class=\"text_field\" type=\"text\" name=\"cgpa\" placeholder=\"CGPA\" step=\".1\"></td></tr>\n");
      out.write("                <tr><th>School in 10th</th><td><input class=\"text_field\" type=\"text\" name=\"school10\" placeholder=\"School in 10th\"></td></tr>\n");
      out.write("                <tr><th>School in 12th</th><td><input class=\"text_field\" type=\"text\" name=\"school12\" placeholder=\"School in 12th\"></td></tr>\n");
      out.write("                <tr><th>College</th><td><input class=\"text_field\" type=\"text\" name=\"college\" placeholder=\"College\"></td></tr>\n");
      out.write("                <tr><th>About Me</th>\n");
      out.write("                    <td><textarea name=\"about\" maxlength=\"255\" rows=\"5\" cols=\"35\" placeholder=\"Discription Here (Not more than 255 characters)\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"2\"><button class=\"btn\" type=\"submit\">Submit</button></td></tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("      function closeSlideMenu(){\n");
      out.write("      document.getElementById('side-menu').style.width = '0px';\n");
      out.write("      \n");
      out.write("    }\n");
      out.write("    function openSlideMenu(){\n");
      out.write("      document.getElementById('side-menu').style.width = '200px';\n");
      out.write("     /* document.getElementById('main').style.marginLeft = '200px';*/\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    $(function () {\n");
      out.write("  $(document).scroll(function () {\n");
      out.write("    var $nav = $(\"#navi\");\n");
      out.write("    $nav.toggleClass('scrolled', $(this).scrollTop() > $nav.height());\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script> \n");
      out.write("  <script type=\"text/javascript\" src=\"particles.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"app.js\"></script>\n");
      out.write("    \n");
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
