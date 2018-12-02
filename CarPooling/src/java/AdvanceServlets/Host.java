/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvanceServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author My Pc
 */
public class Host extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            String fname="",lname="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/carpool?useSSL=false","root","devil114");
            HttpSession session=request.getSession();
            String query1="select fname,lname from userlog where email=?";
            
            PreparedStatement pstmt=conn.prepareStatement(query1);
            String u=(String)session.getAttribute("user");
            pstmt.setString(1,u);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
               fname=rs.getString(1);
               lname=rs.getString(2);
            }
            String hn=fname+" "+lname;
            String hm=u;
            String trip=request.getParameter("type");
            
            String from=request.getParameter("from");
            String to=request.getParameter("to");
            String c_no=request.getParameter("car_plate");
            String c_type=request.getParameter("vehicle");
            String query2="insert into hosting(host_mail,host_name,trip,trip_from,trip_to,car_no,car_type) values(?,?,?,?,?,?,?)";
            String query3="insert into seats(host_name) values(?)";
            PreparedStatement pstmt2=conn.prepareStatement(query2);
            PreparedStatement pstmt3=conn.prepareStatement(query3);
            pstmt2.setString(1,hm);
            pstmt2.setString(2,hn);
            pstmt2.setString(3,trip);
            pstmt3.setString(1,hn);
            pstmt2.setString(4,from);
            pstmt2.setString(5,to);
            pstmt2.setString(6,c_no);
            pstmt2.setString(7,c_type);
            int rs2=pstmt2.executeUpdate();
            if(rs2>=1)
            {
                pstmt3.executeUpdate();
                String url1=response.encodeRedirectURL("index.jsp");
                response.sendRedirect(url1);
            }
            else
            {
                String url1=response.encodeRedirectURL("host.jsp");
                response.sendRedirect(url1);
            }
            System.out.println("Rows Affected:::"+rs);
    }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
