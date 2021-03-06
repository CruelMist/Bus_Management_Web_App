package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Feedback;
import Model.FeedbackDAO;
import Model.User;
import Model.UserDAO;
import Model.Schedule;
import Model.ScheduleDAO;
import java.util.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
 
    FeedbackDAO schAccess=new FeedbackDAO();
    List <Feedback> list=schAccess.getFeed();
    int count=0;
    String use=(String)session.getAttribute("email");
    UserDAO uAccess=new UserDAO();
    List<User> uL=uAccess.getUser();

      out.write(" \n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\"> -->\n");
      out.write("        <script src=\"jquery-3.3.1.js\"></script>\n");
      out.write("        <!-- <script type=\"text/javascript\" src=\"iconwc.js\"></script> -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles1.css\">\n");
      out.write("        <style media=\"screen\">\n");
      out.write("            .col1{\n");
      out.write("                padding:10px;\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                flex-direction: row;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            .sch{\n");
      out.write("                padding:15px;\n");
      out.write("                width:170vh;\n");
      out.write("                height:70%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            .del-tab{\n");
      out.write("                margin:0;\n");
      out.write("                height:60%;\n");
      out.write("                width:10vh;\n");
      out.write("                display: none;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            .del-tab td{\n");
      out.write("                /* background:white; */\n");
      out.write("                border:none;\n");
      out.write("                height:11.4vh;\n");
      out.write("                text-align: center;\n");
      out.write("                /* width:16.667%; */\n");
      out.write("                /* border: 1px solid rgb(216, 8, 8); */\n");
      out.write("            }\n");
      out.write("            .del-tab th{\n");
      out.write("                /* padding:10px; */\n");
      out.write("                height: 10vh;\n");
      out.write("                background:black;\n");
      out.write("                /* border: 1px solid white; */\n");
      out.write("                color:white;\n");
      out.write("                border:none;\n");
      out.write("            }\n");
      out.write("            .sch td{\n");
      out.write("                background:white;\n");
      out.write("                border:none;\n");
      out.write("                text-align: center;\n");
      out.write("                width:16.667%;\n");
      out.write("                border: 1px solid rgb(216, 8, 8);\n");
      out.write("            }\n");
      out.write("            .thead{\n");
      out.write("                padding:10px;\n");
      out.write("                height: 10vh;\n");
      out.write("                background:rgb(216, 8, 8);\n");
      out.write("                /* border: 1px solid white; */\n");
      out.write("                color:white;\n");
      out.write("                border:none;\n");
      out.write("                /* width:10%; */\n");
      out.write("            }\n");
      out.write("            .sch tr:nth-child(even) td{\n");
      out.write("                background-color: #f0e8e8;\n");
      out.write("            }\n");
      out.write("            .sch tr:hover td{\n");
      out.write("                background: rgb(170, 24, 24);\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            .btn-sch{\n");
      out.write("                background:rgb(216, 8, 8);\n");
      out.write("                padding:20px;\n");
      out.write("                font-size: 100%;\n");
      out.write("                border:2px solid white;\n");
      out.write("                border-radius: 4%;\n");
      out.write("                color:white;\n");
      out.write("                transition-duration: 0.5s;\n");
      out.write("            }\n");
      out.write("            .btn-sch:hover{\n");
      out.write("                background:white;\n");
      out.write("                color:black;\n");
      out.write("            }\n");
      out.write("            .btn-home{\n");
      out.write("                background:rgb(216, 8, 8);\n");
      out.write("                padding: 0 15px 0 20px;\n");
      out.write("                border:2px solid white;\n");
      out.write("                border-radius: 4%;\n");
      out.write("                width:20%;\n");
      out.write("                height:10vh;\n");
      out.write("                transition-duration: 0.5s;\n");
      out.write("            }\n");
      out.write("            .btn-home:hover{\n");
      out.write("                background: rgb(170, 24, 24);\n");
      out.write("            }\n");
      out.write("            .sub-col{\n");
      out.write("                width:95%;\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                flex-direction: row;\n");
      out.write("                justify-content: space-between;\n");
      out.write("            }\n");
      out.write("            .pre{\n");
      out.write("                display:flex;\n");
      out.write("                justify-content: right;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("            .del{\n");
      out.write("                /* display:none; */\n");
      out.write("                background:black;\n");
      out.write("                padding:0;\n");
      out.write("                width:100%;\n");
      out.write("                height:100%;\n");
      out.write("                border: 2px solid black;\n");
      out.write("                border-radius: 5%;\n");
      out.write("                transition-duration: 0.2s;\n");
      out.write("            }\n");
      out.write("            .del-svg{\n");
      out.write("                width:20%;\n");
      out.write("            }\n");
      out.write("            .del-svg .si-glyph *{\n");
      out.write("                fill:red;\n");
      out.write("            }\n");
      out.write("            .sch tr td:last-child {\n");
      out.write("                border: none;\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                height:85%;\n");
      out.write("                width: 80%;\n");
      out.write("            }\n");
      out.write("            @media(min-width:2560px)\n");
      out.write("            {\n");
      out.write("                .sch{\n");
      out.write("                    width:160vh;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media(max-width:1024px){\n");
      out.write("                .sch{\n");
      out.write("                    width:150vh;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media(max-width:768px){\n");
      out.write("                .col1{\n");
      out.write("                    padding:0\n");
      out.write("                }\n");
      out.write("                .sch{\n");
      out.write("                    width:100vh;\n");
      out.write("                    padding:0;\n");
      out.write("                }\n");
      out.write("                .sub-col{\n");
      out.write("                    width:80%;\n");
      out.write("                }\n");
      out.write("                .sch td{\n");
      out.write("                    font-size:60%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media(max-width:425px){\n");
      out.write("                .sch{\n");
      out.write("                    width:50vh;\n");
      out.write("                }\n");
      out.write("                .btn-sch{\n");
      out.write("                    width:30%;\n");
      out.write("                }\n");
      out.write("                .btn-home{\n");
      out.write("                    padding:0;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media(max-width:375px){\n");
      out.write("                .container{\n");
      out.write("                    width:65vh;\n");
      out.write("                }\n");
      out.write("                .btn-sch{\n");
      out.write("                    padding:0;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img class=\"logo\" src=\"cu_logo3.png\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col1\">\n");
      out.write("                <form action=\"DeleteSchedule\" method=\"POST\">\n");
      out.write("                <table class=\"sch\">\n");
      out.write("                    <tr class=\"thead\">\n");
      out.write("                        <th>User</th><th>Topic</th><th>Feedback</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 
                        for(Feedback sch:list){
                            count+=1;
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print(sch.getEmail());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print(sch.getTopic());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print(sch.getEmail());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </table>\n");
      out.write("                </form>\n");
      out.write("<!--                    <table class=\"del-tab\">\n");
      out.write("                        <tr><th class=\"del\"></th></tr>\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"del\">\n");
      out.write("                                    <svg class=\"del-svg\" viewBox=\"0 0 17 17\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" class=\"si-glyph si-glyph-delete\"><title>Delete</title><defs></defs><g stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\"><path d=\"M12.566,8 L15.611,4.956 C16.031,4.535 16.031,3.853 15.611,3.434 L12.566,0.389 C12.146,-0.031 11.464,-0.031 11.043,0.389 L7.999,3.433 L4.955,0.389 C4.534,-0.031 3.852,-0.031 3.432,0.389 L0.388,3.434 C-0.034,3.854 -0.034,4.536 0.387,4.956 L3.431,8 L0.387,11.044 C-0.034,11.465 -0.034,12.147 0.388,12.567 L3.432,15.611 C3.852,16.032 4.534,16.032 4.955,15.611 L7.999,12.567 L11.043,15.611 C11.464,16.032 12.146,16.032 12.566,15.611 L15.611,12.567 C16.031,12.146 16.031,11.464 15.611,11.044 L12.566,8 L12.566,8 Z\" fill=\"red\" class=\"si-glyph-fill\"></path></g></svg>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"del\">\n");
      out.write("                                    <svg class=\"del-svg\" viewBox=\"0 0 17 17\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" class=\"si-glyph si-glyph-delete\"><title>Delete</title><defs></defs><g stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\"><path d=\"M12.566,8 L15.611,4.956 C16.031,4.535 16.031,3.853 15.611,3.434 L12.566,0.389 C12.146,-0.031 11.464,-0.031 11.043,0.389 L7.999,3.433 L4.955,0.389 C4.534,-0.031 3.852,-0.031 3.432,0.389 L0.388,3.434 C-0.034,3.854 -0.034,4.536 0.387,4.956 L3.431,8 L0.387,11.044 C-0.034,11.465 -0.034,12.147 0.388,12.567 L3.432,15.611 C3.852,16.032 4.534,16.032 4.955,15.611 L7.999,12.567 L11.043,15.611 C11.464,16.032 12.146,16.032 12.566,15.611 L15.611,12.567 C16.031,12.146 16.031,11.464 15.611,11.044 L12.566,8 L12.566,8 Z\" fill=\"red\" class=\"si-glyph-fill\"></path></g></svg>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"del\">\n");
      out.write("                                    <svg class=\"del-svg\" viewBox=\"0 0 17 17\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" class=\"si-glyph si-glyph-red si-glyph-delete\"><title>Delete</title><defs></defs><g stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\"><path d=\"M12.566,8 L15.611,4.956 C16.031,4.535 16.031,3.853 15.611,3.434 L12.566,0.389 C12.146,-0.031 11.464,-0.031 11.043,0.389 L7.999,3.433 L4.955,0.389 C4.534,-0.031 3.852,-0.031 3.432,0.389 L0.388,3.434 C-0.034,3.854 -0.034,4.536 0.387,4.956 L3.431,8 L0.387,11.044 C-0.034,11.465 -0.034,12.147 0.388,12.567 L3.432,15.611 C3.852,16.032 4.534,16.032 4.955,15.611 L7.999,12.567 L11.043,15.611 C11.464,16.032 12.146,16.032 12.566,15.611 L15.611,12.567 C16.031,12.146 16.031,11.464 15.611,11.044 L12.566,8 L12.566,8 Z\" fill=\"red\" class=\"si-glyph-fill\"></path></g></svg>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"del\">\n");
      out.write("                                    <svg class=\"del-svg\" viewBox=\"0 0 17 17\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" class=\"si-glyph si-glyph-delete\"><title>Delete</title><defs></defs><g stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\"><path d=\"M12.566,8 L15.611,4.956 C16.031,4.535 16.031,3.853 15.611,3.434 L12.566,0.389 C12.146,-0.031 11.464,-0.031 11.043,0.389 L7.999,3.433 L4.955,0.389 C4.534,-0.031 3.852,-0.031 3.432,0.389 L0.388,3.434 C-0.034,3.854 -0.034,4.536 0.387,4.956 L3.431,8 L0.387,11.044 C-0.034,11.465 -0.034,12.147 0.388,12.567 L3.432,15.611 C3.852,16.032 4.534,16.032 4.955,15.611 L7.999,12.567 L11.043,15.611 C11.464,16.032 12.146,16.032 12.566,15.611 L15.611,12.567 C16.031,12.146 16.031,11.464 15.611,11.044 L12.566,8 L12.566,8 Z\" fill=\"red\" class=\"si-glyph-fill\"></path></g></svg>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                </table>-->\n");
      out.write("<!--                    <tr>\n");
      out.write("                        \n");
      out.write("                        <td>HR01A9089</td><td>001</td><td>ABD</td><td>9980975789</td><td>Baddi-Kalka-Pinjore-Dhakoli</td><td>25-02-2019</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>HR01A9089</td><td>001</td><td>ABD</td><td>9980975789</td><td>Baddi-Kalka-Pinjore-Dhakoli</td><td>25-02-2019</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>HR01A9089</td><td>001</td><td>ABD</td><td>9980975789</td><td>Baddi-Kalka-Pinjore-Dhakoli</td><td>25-02-2019</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>HR01A9089</td><td>001</td><td>ABD</td><td>9980975789</td><td>Baddi-Kalka-Pinjore-Dhakoli</td><td>25-02-2019</td>\n");
      out.write("                    </tr>-->\n");
      out.write("                \n");
      out.write("                <div class=\"sub-col\">\n");
      out.write("                    \n");
      out.write("                ");

                    for(User u:uL)
                    {
                        if(u.getEmail().equals(use))
                        {
                            if(u.getType().equals("admin")){
      out.write("\n");
      out.write("                <button type=\"button\" class=\"btn-home\" onclick=window.location.href='page2(admin).html'><svg viewBox=\"0 0 17 16\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" class=\"si-glyph si-glyph-house\"><title>Home</title><defs></defs><g stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\"><g transform=\"translate(1.000000, 1.000000)\" fill=\"#434343\"><path d=\"M15.794,7.77 L11.984,3.864 L11.9839997,1.01706251 L11.0159997,1.03906251 L11.016,2.767 L8.502,0.245 C8.224,-0.031 7.776,-0.031 7.499,0.245 L0.206,7.771 C-0.069,8.048 -0.068,8.498 0.206,8.773 C0.482,9.049 0.933,9.049 1.209,8.772 L8,1.982 L14.793,8.772 C14.931,8.91 15.111,8.98 15.293,8.98 C15.474,8.98 15.654,8.912 15.794,8.773 C16.068,8.496 16.068,8.045 15.794,7.77 L15.794,7.77 Z\" class=\"si-glyph-fill\"></path><path d=\"M3.043,8.532 L3.043,14.222 C3.043,14.616 3.26102394,15.0078125 3.61002394,15.0078125 L5.88702394,15.0078125 L5.95099996,11.0147705 L10.0249632,11.0147705 L10.0230128,15.0078125 L12.3260496,15.0078125 C12.6750496,15.0078125 12.958,14.617 12.958,14.222 L12.958,8.531 L8,3.625 L3.043,8.532 L3.043,8.532 Z\" class=\"si-glyph-fill\"></path></g></g></svg>\n");
      out.write("                </button>\n");
      out.write("                ");
}
                        
                    else if(u.getType().equals("staff"))
                    {
      out.write("\n");
      out.write("                    <button type=\"button\" class=\"btn-home\" onclick=window.location.href='page2-staff.html'><svg viewBox=\"0 0 17 16\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" class=\"si-glyph si-glyph-house\"><title>Home</title><defs></defs><g stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\"><g transform=\"translate(1.000000, 1.000000)\" fill=\"#434343\"><path d=\"M15.794,7.77 L11.984,3.864 L11.9839997,1.01706251 L11.0159997,1.03906251 L11.016,2.767 L8.502,0.245 C8.224,-0.031 7.776,-0.031 7.499,0.245 L0.206,7.771 C-0.069,8.048 -0.068,8.498 0.206,8.773 C0.482,9.049 0.933,9.049 1.209,8.772 L8,1.982 L14.793,8.772 C14.931,8.91 15.111,8.98 15.293,8.98 C15.474,8.98 15.654,8.912 15.794,8.773 C16.068,8.496 16.068,8.045 15.794,7.77 L15.794,7.77 Z\" class=\"si-glyph-fill\"></path><path d=\"M3.043,8.532 L3.043,14.222 C3.043,14.616 3.26102394,15.0078125 3.61002394,15.0078125 L5.88702394,15.0078125 L5.95099996,11.0147705 L10.0249632,11.0147705 L10.0230128,15.0078125 L12.3260496,15.0078125 C12.6750496,15.0078125 12.958,14.617 12.958,14.222 L12.958,8.531 L8,3.625 L3.043,8.532 L3.043,8.532 Z\" class=\"si-glyph-fill\"></path></g></g></svg>\n");
      out.write("                </button>\n");
      out.write("                    ");
}
                    }
                    }
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            Copyright © Chitkara University 2019\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("<html>");
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
