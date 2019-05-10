package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Model.User;
import Model.UserDAO;

public final class task_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");

            UserDAO uAccess=new UserDAO();
            User u=new User();
            
            String mail=(String)session.getAttribute("email");
            List<User> ul=uAccess.getUser(mail);
        
      out.write("\n");
      out.write("        <title>Task</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"myCss.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"newCss.css\" type=\"text/css\">\n");
      out.write("        <script src=\"WEB-INF/assets/code.jquery.com_jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"https://use.fontawesome.com/releases/v5.0.6/css/all.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"sect\">\n");
      out.write("    <div class=\" clear-filter\" style=\"background-attachment: fixed;\">\n");
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
      out.write("          <a href=\"index.html\">Home</a>\n");
      out.write("          <a href=\"about.html\">About</a>\n");
      out.write("          <a href=\"services.html\">Services</a>\n");
      out.write("          <a href=\"contact.html#\">Contact</a>\n");
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
      out.write("            <a class=\"nav-link\" href=\"logout.jsp\"  >\n");
      out.write("        \n");
      out.write("               <p>Logout</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("<!--          <li class=\"nav-item dropdown\">\n");
      out.write("            <a href=\"#\" class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink1\" data-toggle=\"dropdown\">\n");
      out.write("            \n");
      out.write("              <p>Routes</p>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink1\">\n");
      out.write("              <a class=\"dropdown-item\" target=\"_top\" href=\"./myproject/mohali.html\">\n");
      out.write("                <i class=\"now-ui-icons design_bullet-list-67\"></i> Mohali\n");
      out.write("              </a>\n");
      out.write("              <a class=\"dropdown-item\" target=\"_top\" href=\"./myproject/pkl.html\">\n");
      out.write("                <i class=\"now-ui-icons design_bullet-list-67\"></i> Punchkula\n");
      out.write("              </a>\n");
      out.write("              <a class=\"dropdown-item\" target=\"_blank\" href=\"./myproject/chd.html\" >\n");
      out.write("                <i class=\"now-ui-icons design_bullet-list-67\"></i> Chandigarh\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </li>-->\n");
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
      out.write("                <div class=\"video-container\">\n");
      out.write("            <div class=\"color-overlay\"></div>\n");
      out.write("            <video width=\"1400\"  autoplay loop muted >\n");
      out.write("                <source src=\"Coffee Shop tablet.mp4\" type=\"video/mp4\">\n");
      out.write("            </video>\n");
      out.write("        </div>\n");
      out.write("          <div id=\"side-menu\" class=\"side-nav\">\n");
      out.write("       \n");
      out.write("        <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\n");
      out.write("        <a href=\"./myproject/my.html\">Home</a>\n");
      out.write("        <a href=\"./myproject/about.html\">About</a>\n");
      out.write("        <a href=\"./myproject/services.html\">Services</a>\n");
      out.write("        <a href=\"./myproject/contact.html\">Contact</a>\n");
      out.write("      </div>\n");
      out.write("<!--        \n");
      out.write("        -->\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            ");
for (User use:ul)
            { if(!(use.getType().equals("admin")))
            {
    
      out.write("\n");
      out.write("            \n");
      out.write("          <div class=\"cube-wrapper\">\n");
      out.write("            <div class=\"cube\">\n");
      out.write("                <div class=\"cube-top\" style=\"background: linear-gradient(rgba(1, 1, 1,.7),rgba(241, 196, 15,.7)),url(data:image/png;base64,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) #fff no-repeat center;\">\n");
      out.write("                    <ul>\n");
      out.write("                        ");
if(use.getType().equals("candidate"))
                        {
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"empInfoView.jsp\">View Profile</a><!--applicant-->\n");
      out.write("                        </li>\n");
      out.write("                        ");
}
                            if(use.getType().equals("recruiter"))
                        {
      out.write("\n");
      out.write("                         <li>\n");
      out.write("                            <a href=\"compInfoView.jsp\">View Profile</a><!--company-->\n");
      out.write("                        </li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cube-front\">\n");
      out.write("                <div class=\"cube-front\">\n");
      out.write("                <div class=\"txt\"><h2>Profile</h2><p></div> \n");
      out.write("                    <div style=\"top:65%; height:88px;background: #FFFF00; overflow: hidden;position: relative;\">    \n");
      out.write("                </div></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         ");
}
      out.write("   \n");
      out.write("         ");
if(!(use.getType().equals("candidate")))
            {
    
      out.write("\n");
      out.write("        <div class=\"cube-wrapper\">\n");
      out.write("            <div class=\"cube\">\n");
      out.write("                <div class=\"cube-top\" style=\"background: linear-gradient(rgba(1, 1, 1,.7),rgba(241, 196, 15,.7)),url(data:image/png;base64,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) #fff no-repeat center;\">\n");
      out.write("                    <ul>\n");
      out.write("                        ");

                            if(use.getType().equals("admin"))
                        {
      out.write("\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"displayRecruiter.jsp\">View Applicants</a><!--admin-->\n");
      out.write("                        </li>\n");
      out.write("                        ");
}
                            if(use.getType().equals("admin"))
                        {
      out.write("\n");
      out.write("\n");
      out.write("                         <li>\n");
      out.write("                             <a href=\"displayCandidate.jsp\">View Companies</a><!--admin-->\n");
      out.write("                        </li>\n");
      out.write("                        ");
}
                            if(use.getType().equals("recruiter"))
                        {
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"displayApplication.jsp\">View Applications</a><!--company-->\n");
      out.write("                        </li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cube-front\">\n");
      out.write("                <div class=\"cube-front\">\n");
      out.write("                <div class=\"txt\"><h2>View</h2><p></div> \n");
      out.write("                    <div style=\"top:65%; height:88px;background: #FFFF00; overflow: hidden;position: relative;\">    \n");
      out.write("                </div></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");
if(!(use.getType().equals("admin")))
            {
    
      out.write("\n");
      out.write("        <div class=\"cube-wrapper\">\n");
      out.write("            <div class=\"cube\">\n");
      out.write("                <div class=\"cube-top\"> \n");
      out.write("                     <ul>\n");
      out.write("                         ");

                            if(use.getType().equals("recruiter"))
                        {
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"addJob.html\">Add Job</a><!--company-->\n");
      out.write("                        </li>\n");
      out.write("                        ");
}
                            if(use.getType().equals("candidate"))
                        {
      out.write("\n");
      out.write("                         <li>\n");
      out.write("                            <a href=\"addProject.html\">Add Project</a><!--applicant-->\n");
      out.write("                        </li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cube-front\">\n");
      out.write("                    <div class=\"txt\"><h2>Add</h2></div> \n");
      out.write("                    <div style=\"top:65%; height:88px;background: #FFD700; overflow: hidden;position: relative;\">    \n");
      out.write("                </div></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");
if((use.getType().equals("admin")))
            {
    
      out.write("\n");
      out.write("             <div class=\"cube-wrapper\">\n");
      out.write("            <div class=\"cube\">\n");
      out.write("                <div class=\"cube-top\" style=\"background: linear-gradient(rgba(1, 1, 1,.7),rgba(241, 196, 15,.7)),url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkhQ5m4_eXEtfRpuNthsgaXzomhQP6tBK9U8abe_u9an17bfqk) #fff no-repeat center;\n");
      out.write("                     \" >\n");
      out.write("                     <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Remove Applicants</a><!--admin-->\n");
      out.write("                        </li>\n");
      out.write("                         <li>\n");
      out.write("                            <a href=\"#\">Remove Companies</a><!--admin-->\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cube-front\">\n");
      out.write("                <div class=\"cube-front\">\n");
      out.write("                    <div class=\"txt\"><h2>Remove</h2></div>\n");
      out.write("                    <div style=\"top:65%; height:88px;background: #FFA500; overflow: hidden;position: relative;\">    \n");
      out.write("                </div></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("             ");
}
      out.write("\n");
      out.write("             ");
if((use.getType().equals("candidate")))
            {
    
      out.write("\n");
      out.write("             <div class=\"cube-wrapper\">\n");
      out.write("            <div class=\"cube\">\n");
      out.write("                <div class=\"cube-top\" style=\"background: linear-gradient(rgba(1, 1, 1,.7),rgba(241, 196, 15,.7)),url(data:image/png;base64,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) #fff no-repeat center;\n");
      out.write("\">              \n");
      out.write("                     <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"apply.jsp\">  Apply for companies</a><!--applicant-->\n");
      out.write("                        </li>\n");
      out.write("<!--                         <li>\n");
      out.write("                            <a href=\"#\">View Companies</a>admin,applicant\n");
      out.write("                        </li>-->\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cube-front\">\n");
      out.write("                <div class=\"cube-front\">\n");
      out.write("                    <div class=\"txt\"><h2>Apply</h2></div> \n");
      out.write("                <div style=\"top:65%; height:88px;background: #FF8C00; overflow: hidden;position: relative;\">    \n");
      out.write("                </div></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("             ");
} }
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>    \n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("\n");
      out.write("<!--<div class=\"sect\"></div>\n");
      out.write("<div class=\"subsect\"></div>\n");
      out.write("<div class=\"sect\"></div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
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
      out.write("    </body>\n");
      out.write("    \n");
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
