package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Schedule;
import Model.ScheduleDAO;
import Model.Route;
import Model.RouteDAO;
import Model.RouteDAO;
import Model.Driver;
import java.util.List;
import Model.DriverDAO;
import Model.Bus;
import Model.BusDAO;

public final class edit_005fschedule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
 
    BusDAO busAccess=new BusDAO();
    List <Bus> blist=busAccess.getBus();
    DriverDAO driveAccess=new DriverDAO();
    List <Driver> dlist=driveAccess.getDriver();
    RouteDAO routeAccess=new RouteDAO();
    List <Route> rlist=routeAccess.getRoute();
    ScheduleDAO schAccess=new ScheduleDAO();
    List <Schedule> slist=schAccess.getSch();
    int flag=99;
    int countb=0,countr=0,countd=0;

      out.write("\r\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\"> -->\r\n");
      out.write("        <script src=\"jquery-3.3.1.js\"></script>\r\n");
      out.write("        <!-- <script type=\"text/javascript\" src=\"iconwc.js\"></script> -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"animate.css\">\r\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"styles1.css\"> -->\r\n");
      out.write("        <style media=\"screen\">\r\n");
      out.write("            body{\r\n");
      out.write("                margin:0;\r\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("                background: rgb(170, 24, 24);\r\n");
      out.write("            }\r\n");
      out.write("            .container\r\n");
      out.write("            {\r\n");
      out.write("                /* width:250vh; */\r\n");
      out.write("                height:95vh;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                flex-wrap: wrap;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                overflow-x: hidden;\r\n");
      out.write("                /* display:none; */\r\n");
      out.write("            }\r\n");
      out.write("            form\r\n");
      out.write("            {\r\n");
      out.write("                width:100%;\r\n");
      out.write("                display:\"flex\";\r\n");
      out.write("                flex-wrap: \"wrap\";\r\n");
      out.write("                flex-direction: column;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                padding:10px;\r\n");
      out.write("                color:white;\r\n");
      out.write("            }\r\n");
      out.write("            button{\r\n");
      out.write("                width:50%;\r\n");
      out.write("                padding:10px;\r\n");
      out.write("                display: block;\r\n");
      out.write("                border: none;\r\n");
      out.write("                border-radius: 5%;\r\n");
      out.write("                color:white;\r\n");
      out.write("                margin: 15% auto 10% auto;\r\n");
      out.write("                background-color: rgb(170, 33, 33);\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            button:hover\r\n");
      out.write("            {\r\n");
      out.write("                background-color: rgb(216, 8, 8);\r\n");
      out.write("            }\r\n");
      out.write("            .footer\r\n");
      out.write("            {\r\n");
      out.write("                bottom:0px;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                font-size: 2.8vh;\r\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                height:5%;\r\n");
      out.write("                width:100%;\r\n");
      out.write("                color: white;\r\n");
      out.write("                background-color: black;\r\n");
      out.write("            }\r\n");
      out.write("            .header\r\n");
      out.write("            {\r\n");
      out.write("                top:0px;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                height:5%;\r\n");
      out.write("                width:100%;\r\n");
      out.write("                background-color: black;\r\n");
      out.write("            }\r\n");
      out.write("            .form-box\r\n");
      out.write("            {\r\n");
      out.write("                width:20%;\r\n");
      out.write("                /* height:50%; */\r\n");
      out.write("                display:flex;\r\n");
      out.write("                flex-wrap: wrap;\r\n");
      out.write("                flex-direction: column;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                background-color: black;\r\n");
      out.write("                padding:10px;\r\n");
      out.write("                border-radius: 4%;\r\n");
      out.write("            }\r\n");
      out.write("            .bus,.driver,.route,.date{\r\n");
      out.write("                display: block;\r\n");
      out.write("                width:70%;\r\n");
      out.write("                padding:10px;\r\n");
      out.write("                display: block;\r\n");
      out.write("                background-color:rgb(177, 170, 170);\r\n");
      out.write("                border: none;\r\n");
      out.write("                border-radius: 4%;\r\n");
      out.write("            }\r\n");
      out.write("            a{\r\n");
      out.write("                text-decoration:none;\r\n");
      out.write("                color:white;\r\n");
      out.write("            }\r\n");
      out.write("            .control{\r\n");
      out.write("                margin:1%;\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <!-- <img class=\"logo\" src=\"cu_logo3.png\"> -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"form-box\">\r\n");
      out.write("                <button type=\"button\" class=\"control\"><a href=\"schedule.jsp\">Back</a></button>\r\n");
      out.write("                <form name=\"edit_schedule\" action=\"AddSchedule\" method=\"POST\">\r\n");
      out.write("                    <p>Select Bus:</p>\r\n");
      out.write("                    <select name=\"bus\" class=\"bus\">\r\n");
      out.write("                        ");
for(Bus b:blist)
                        {
                            
                            for(Schedule s:slist)
                            {
                                if(b.getBusLisance().equals(s.getBusLisance())){
                                    
                                    flag=0;
                                    
                                    break;}
                                else{
                                    
                                    flag=1;}
                            }
                        if(flag==1)
                        {
                            countb=1;
                            flag=0;
                        
      out.write("\r\n");
      out.write("                        <option value=\"");
      out.print(b.getBusLisance());
      out.write('"');
      out.write('>');
      out.print(b.getBusLisance());
      out.write("</option>\r\n");
      out.write("                        ");
}
                            else
                            continue;
                        }
                        
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    </select>\r\n");
      out.write("                    <p>Select Driver:</p>\r\n");
      out.write("                    \r\n");
      out.write("                    <select name=\"driver\" class=\"driver\">\r\n");
      out.write("                        ");
for(Driver d:dlist)
                        {
                            
                            for(Schedule s:slist)
                            {
                                if(d.getName().equals(s.getDriverName())){
                                    flag=0;
                                    
                                    break;}
                                else{
                                    flag=1;}
                            }
                        if(flag==1)
                        {
                            countd=1;
                            flag=0;
                        
      out.write("\r\n");
      out.write("                        <option value=\"");
      out.print(d.getName());
      out.write('"');
      out.write('>');
      out.print(d.getName());
      out.write("</option>\r\n");
      out.write("                        ");
}
                            else
                            continue;
                        }
                        
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    </select>\r\n");
      out.write("                    <p>Select Route:</p>\r\n");
      out.write("                    \r\n");
      out.write("                    <select name=\"route\" class=\"route\">\r\n");
      out.write("                        ");
for(Route r:rlist)
                        {
                            
                            for(Schedule s:slist)
                            {
                                if(r.getRoute().equals(s.getRoute())){
                                    flag=0;
                                    
                                    break;}
                                else{
                                    
                                    flag=1;}
                            }
                        if(flag==1)
                        {
                            countr=1;
                            flag=0;
      out.write("\r\n");
      out.write("                        <option value=\"");
      out.print(r.getRoute());
      out.write('"');
      out.write('>');
      out.print(r.getRoute());
      out.write("</option>\r\n");
      out.write("                        ");
}
                            else
                            continue;
                        }
                        
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    </select>\r\n");
      out.write("                    <p>Select Date:");
      out.print(countb);
      out.write(' ');
      out.print(countd);
      out.write(' ');
      out.print(countr);
      out.write("</p><input class=\"date\" name=\"date\" type=\"date\">\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    ");
if(countb>0&&countr>0&&countd>0)
                    {
                        countb=0;
                        countr=0;
                        countd=0;
                    
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        <button type=\"submit\"><a href=\"schedule.jsp\">Submit</a></button>\r\n");
      out.write("                    ");
   }
                    else{
                        countb=0;
                        countr=0;
                        countd=0;
                    }
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            Copyright © Chitkara University 2019\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            function validateForm() {\r\n");
      out.write("            var x = document.forms[\"myForm\"][\"bus\"].value;\r\n");
      out.write("            if (x == \"\") {\r\n");
      out.write("            alert(\"Name must be filled out\");\r\n");
      out.write("            return false;\r\n");
      out.write("            }\r\n");
      out.write("            var y=document.forms[\"myForm\"][\"bus\"].value;\r\n");
      out.write("            if(x){}\r\n");
      out.write("            };\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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
