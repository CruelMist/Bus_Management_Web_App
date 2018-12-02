/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author My Pc
 */
public class Signup extends HttpServlet {

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
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/carpool?useSSL=false","root","devil114");
            String query1="insert into userlog values(?,?,?,?)";
            String query2="insert into userprof(fname,lname,email) values(?,?,?)";
            PreparedStatement pstmt=conn.prepareStatement(query1);
            PreparedStatement pstmt2=conn.prepareStatement(query2);
            String n=request.getParameter("fname");
            String nl=request.getParameter("lname");
            String u=request.getParameter("email");
            String p=request.getParameter("password");
            pstmt.setString(1,n);
            pstmt.setString(2,nl);
            pstmt.setString(3,u);
            pstmt.setString(4,p);
            pstmt2.setString(1,n);
            pstmt2.setString(2,nl);
            pstmt2.setString(3,u);
            int rs=pstmt.executeUpdate();
            if(rs>=1)
            {
                pstmt2.executeUpdate();
                HttpSession session=request.getSession();
                session.setAttribute("user",u);
                session.setMaxInactiveInterval(30*60);
                String url=response.encodeRedirectURL("SignupSuccess");
                String url1=response.encodeRedirectURL("login.html");
                response.sendRedirect(url1);
            }
            else
            {
                request.getSession().invalidate();
            response.sendRedirect("login.html");
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
