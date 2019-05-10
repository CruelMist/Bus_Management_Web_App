/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Candidate;
import Model.CandidateDAO;
import Model.Recruiter;
import Model.RecruiterDAO;
import Model.User;
import Model.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author My Pc
 */
public class signServlet extends HttpServlet {

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
        String mail=request.getParameter("mail");
        String user=request.getParameter("uname");
        String pass=request.getParameter("pass");
        String type=request.getParameter("type");
        User u =new User();
        u.setEmail(mail);
        u.setUsername(user);
        u.setPassword(pass);
        u.setType(type);
        UserDAO useAccess=new UserDAO();
        useAccess.addUser(u);
        HttpSession session=request.getSession();
        session.setAttribute("email",mail);
        session.setMaxInactiveInterval(30*60);
        
        if(u.getType().equals("recruiter"))
        {
            Recruiter c=new Recruiter();
            RecruiterDAO cAccess=new RecruiterDAO();
            c.setEmail(mail);
            c.setUsername(user);
            cAccess.recruiterInit(c);
            RequestDispatcher rd=request.getRequestDispatcher("compInfo.jsp");
            rd.forward(request, response);
        }
        else if(u.getType().equals("candidate"))
        {
            Candidate c=new Candidate();
            CandidateDAO cAccess=new CandidateDAO();
            c.setEmail(mail);
            c.setUsername(user);
            cAccess.candidateInit(c);
            RequestDispatcher rd=request.getRequestDispatcher("empInfo.jsp");
            rd.forward(request, response);
        }
        else
        {
            RequestDispatcher rd=request.getRequestDispatcher("index.html");//Change to dashboard
            rd.forward(request, response);
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
