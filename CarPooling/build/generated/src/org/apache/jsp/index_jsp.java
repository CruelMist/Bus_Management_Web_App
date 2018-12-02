package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\n");
      out.write("\t\t<meta name=\"author\" content=\"\">\n");
      out.write("\t\t<link rel=\"icon\" href=\"favicon.ico\">\n");
      out.write("\t\t<title>Carpooling - made by Vishwas Anand</title>\n");
      out.write("                \n");
      out.write("                <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("\t\t\n");
      out.write("\t\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("\t\t\n");
      out.write("\t\t<link href=\"css/jquery.bxslider.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("                <style>\n");
      out.write("                    .dropdown .dropdown-menu a {\n");
      out.write("    color: #8c8c8c;\n");
      out.write("    text-decoration: none;\n");
      out.write("    text-decoration-line: none;\n");
      out.write("    text-decoration-style: initial;\n");
      out.write("    text-decoration-color: initial;\n");
      out.write("}\n");
      out.write(".dropdown-menu .dropdown-item {\n");
      out.write("    display: inline-block;\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px 5px;\n");
      out.write("}\n");
      out.write(".dropdown-item {\n");
      out.write("    display: block;\n");
      out.write("    width: 100%;\n");
      out.write("    padding: .25rem 1.5rem;\n");
      out.write("    clear: both;\n");
      out.write("    font-weight: 400;\n");
      out.write("    color: #212529;\n");
      out.write("    text-align: inherit;\n");
      out.write("    white-space: nowrap;\n");
      out.write("    background-color: transparent;\n");
      out.write("    border: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-menu {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 100%;\n");
      out.write("    left: 0;\n");
      out.write("    z-index: 1000;\n");
      out.write("    display: none;\n");
      out.write("    float: left;\n");
      out.write("    min-width: 160px;\n");
      out.write("    padding: 5px 0;\n");
      out.write("    margin: 2px 0 0;\n");
      out.write("    font-size: 14px;\n");
      out.write("    text-align: left;\n");
      out.write("    list-style: none;\n");
      out.write("    background-color: #262626;\n");
      out.write("    -webkit-background-clip: padding-box;\n");
      out.write("    background-clip: padding-box;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border: 1px solid rgba(0,0,0,.15);\n");
      out.write("    border-radius: 4px;\n");
      out.write("    -webkit-box-shadow: 0 6px 12px rgba(0,0,0,.175);\n");
      out.write("    box-shadow: 0 6px 12px rgba(0,0,0,.175);\n");
      out.write("}\n");
      out.write(".container .dropdown .dropdown-menu a:hover\n");
      out.write("{\n");
      out.write("  color: #666666;\n");
      out.write("  background-color: #666666;\n");
      out.write("  border-color: #666666;\n");
      out.write("}\n");
      out.write("                </style>\n");

                        Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/carpool?useSSL=false","root","devil114");
            String user=(String)session.getAttribute("user");
            String query1="select * from userlog where email=?";
            PreparedStatement pstmt=conn.prepareStatement(query1);
            pstmt.setString(1,user);
            String query11="select * from hosting where host_mail=?";
            PreparedStatement pstmt11=conn.prepareStatement(query11);
            pstmt11.setString(1,user);
            ResultSet rs=pstmt.executeQuery();
            
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-inverse navbar-fixed-top  navbar-dark\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Carpool</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"navbar-item active\">\n");
      out.write("                        <a href=\"index.jsp\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");

                        
            if(rs.last()==true)
            {
            
      out.write("\n");
      out.write("                    <li class=\"navbar-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"profile.jsp\">Profile</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Pooling\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"host.jsp\">Host Trip</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"ride.jsp\">Ride Trips </a>\n");
      out.write("          \n");
      out.write("          ");

                ResultSet rs11=pstmt.executeQuery();        
            if(rs11.last()==true)
            {
            
      out.write("\n");
      out.write("          <a class=\"dropdown-item\" href=\"end.jsp\">End Trip </a>\n");
      out.write("          ");
}
      out.write("\n");
      out.write("        </li>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </ul>\n");
      out.write("                    ");

                        
            if(rs.last()==true)
            {
            
      out.write("\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"logout.jsp\" name=\"logout\" ><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("            ");
}
             else
                { 
      out.write("\n");
      out.write("            \n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("                    <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    <!--<nav class=\"navbar navbar-expand-lg navbar-inverse navbar-fixed-top \">\n");
      out.write("        \n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Carpool</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"navbar-item active\">\n");
      out.write("                        <a href=\"index.html\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"navbar-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#about\">Lifestyle</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"navbar-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#pooling\">Pooling</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("                    <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                </ul> \n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("    </nav>-->\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t<header>\n");
      out.write("\t\t\t<a href=\"index.jsp\"><h1>Carpooling</h1><br><h2>by: Vishwas Anand</h2></a>\n");
      out.write("\t\t</header>\n");
      out.write("\t\t<section class=\"main-slider\">\n");
      out.write("\t\t\t<ul class=\"bxslider\">\n");
      out.write("\t\t\t\t<li><div class=\"slider-item\"><img src=\"images/10.jpg\" title=\"Funky roots\" /><h2><a href=\"post.html\" title=\"Vintage-Inspired Finds for Your Home\">Vintage-Inspired Finds for Your Home</a></h2></div></li>\n");
      out.write("\t\t\t\t<li><div class=\"slider-item\"><img src=\"images/11.jpg\" title=\"Funky roots\" /><h2><a href=\"post.html\" title=\"Vintage-Inspired Finds for Your Home\">Vintage-Inspired Finds for Your Home</a></h2></div></li>\n");
      out.write("\t\t\t\t<li><div class=\"slider-item\"><img src=\"images/pool3.jpg\" title=\"Funky roots\" /><h2><a href=\"post.html\" title=\"Vintage-Inspired Finds for Your Home\">Vintage-Inspired Finds for Your Home</a></h2></div></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t<section>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t<article class=\"blog-post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-post-image\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"post.html\"><img src=\"images/pool5.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-post-body\">\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"post.html\">We serve everyone in home with complete care</a></h2>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"post-meta\"><span>by <a href=\"#\">Vishwas Anand</a></span>/<span><i class=\"fa fa-clock-o\"></i>November 21, 2018</span>/<span><i class=\"fa fa-comment-o\"></i> <a href=\"#\">343</a></span></div>\n");
      out.write("\t\t\t\t\t\t\t<p>Carpooling saves money and reduces congestion on our roads and highways. It also gives you the opportunity to develop new friendships with co-workers or other commuters. There are a number of benefits when two or more people share a ride in one vehicle.<div class=\"read-more\"><a href=\"#\">Continue Reading</a></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<article class=\"blog-post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-post-image\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"post.html\"><img src=\"images/pool3.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-post-body\">\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"post.html\">Some of the mentioned benefits of car pooling</a></h2>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"post-meta\"><span>by <a href=\"#\">Vishwas Anand</a></span>/<span><i class=\"fa fa-clock-o\"></i>November 21, 2018</span>/<span><i class=\"fa fa-comment-o\"></i> <a href=\"#\">343</a></span></div>\n");
      out.write("\t\t\t\t\t\t\t<p>Driving takes a big bite out of your budget and your time. Because the average household in the region travels approximately 39 miles each day, when gas is $3.00 per gallon the average household is paying $5.32 each day for gasoline alone. Additionally, the average commuter spends an extra 39 hours per year on the road due to gridlock.<div class=\"read-more\"><a href=\"#\">Continue Reading</a></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t<!-- article -->\n");
      out.write("\t\t\t\t\t<article class=\"blog-post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-post-image\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"post.html\"><img src=\"images/pool10.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-post-body\">\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"post.html\">What is car pooling and why is is soo modern these days in our country?</a></h2>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"post-meta\"><span>by <a href=\"#\">Vishwas Anand</a></span>/<span><i class=\"fa fa-clock-o\"></i>November 21, 2018</span>/<span><i class=\"fa fa-comment-o\"></i> <a href=\"#\">343</a></span></div>\n");
      out.write("\t\t\t\t\t\t\t<p>Carpooling is when several people travel together by car and share the cost of the journey. You probably already carpool very often with family and friends: every time you take the car together you share the cost of a journey with them. In much the same way, BlaBlaCar connects car owners and co-travellers to share city-to-city journeys, so that they can share a long distance trip together, and both save money.<div class=\"read-more\"><a href=\"#\">Continue Reading</a></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 sidebar-gutter\">\n");
      out.write("\t\t\t\t\t<aside>\n");
      out.write("\t\t\t\t\t<!-- sidebar-widget -->\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-widget\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"sidebar-title\">About Me</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-container widget-about\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"post.html\"><img src=\"images/pool2.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t<h4>Vishwas Anand</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"author-title\">Designer</div>\n");
      out.write("\t\t\t\t\t\t\t<p>While everyone’s eyes are glued to the runway, it’s hard to ignore that there are major fashion moments on the front row too.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- sidebar-widget -->\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-widget\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"sidebar-title\">Featured Posts</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-container\">\n");
      out.write("\t\t\t\t\t\t\t<article class=\"widget-post\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-image\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"post.html\"><img src=\"images/pool5.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2><a href=\"post.html\">New development in car pooling</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"post-meta\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><i class=\"fa fa-clock-o\"></i> 21. November 2018</span> <span><a href=\"post.html\"><i class=\"fa fa-comment-o\"></i> 23</a></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\t<article class=\"widget-post\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-image\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"post.html\"><img src=\"images/pool6.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2><a href=\"post.html\">Why we need private vehicles when pooling is cheaper?</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"post-meta\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><i class=\"fa fa-clock-o\"></i> 21. November 2018</span> <span><a href=\"post.html\"><i class=\"fa fa-comment-o\"></i> 23</a></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\t<article class=\"widget-post\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-image\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"post.html\"><img src=\"images/pool8.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2><a href=\"post.html\">Current scenario after hike in fuel</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"post-meta\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><i class=\"fa fa-clock-o\"></i> 21. November 2018</span> <span><a href=\"post.html\"><i class=\"fa fa-comment-o\"></i> 23</a></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\t<article class=\"widget-post\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-image\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"post.html\"><img src=\"images/pool.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2><a href=\"post.html\">Vintage-Inspired Finds for Your Home</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"post-meta\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><i class=\"fa fa-clock-o\"></i> 21. November 2018</span> <span><a href=\"post.html\"><i class=\"fa fa-comment-o\"></i> 23</a></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\t<article class=\"widget-post\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-image\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"post.html\"><img src=\"images/pool11.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2><a href=\"post.html\">New vehicles for better comfort</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"post-meta\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><i class=\"fa fa-clock-o\"></i> 21. November 2018</span> <span><a href=\"post.html\"><i class=\"fa fa-comment-o\"></i> 23</a></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- sidebar-widget -->\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-widget\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"sidebar-title\">Socials</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-container\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget-socials\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-reddit\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- sidebar-widget -->\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-widget\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"sidebar-title\">Categories</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-container\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Nearby</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Inter-City</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Inter-State</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Pool-XL</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Premium</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Uncategorized</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</aside>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t</div><!-- /.container -->\n");
      out.write("\n");
      out.write("\t\t<footer class=\"footer\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"footer-socials\">\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-reddit\"></i></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.bxslider.js\"></script>\n");
      out.write("\t\t<script src=\"js/mooz.scripts.min.js\"></script>\n");
      out.write("\t</body>\n");
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
