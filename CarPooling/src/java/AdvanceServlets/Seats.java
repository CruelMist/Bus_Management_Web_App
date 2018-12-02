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
public class Seats extends HttpServlet {

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
            String name="";
            HttpSession session=request.getSession();
            String u=(String)session.getAttribute("user");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/carpool?useSSL=false","root","devil114");
            String query1="select fname,lname from userlog where email=?";
            PreparedStatement pstmt=conn.prepareStatement(query1);
            pstmt.setString(1,u);
            ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {
                name=rs.getString(1)+" "+rs.getString(2);
            }
            String host=request.getParameter("host");
            String seat=request.getParameter("s1");

            String query2="update seats set "+seat+"=? where host_name=?";
            PreparedStatement pstmt2=conn.prepareStatement(query2);

            pstmt2.setString(2, host);
            pstmt2.setString(1,name);
            int rs2=pstmt2.executeUpdate();
            if(rs2>=1)
            {
               
                String url1=response.encodeRedirectURL("index.jsp");
                response.sendRedirect(url1);
            }
            else
            {
                request.getSession().invalidate();
                response.sendRedirect("index.jsp");
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
