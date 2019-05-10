/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Candidate;
import Model.CandidateDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class addEmpInfo extends HttpServlet {

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
        HttpSession session=request.getSession();
        String mail=(String)session.getAttribute("email");
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String phone=request.getParameter("phone");
        String address=request.getParameter("address");
        String city=request.getParameter("city");
        String state=request.getParameter("state");
        String marks10=request.getParameter("marks10");
        Float m10=Float.parseFloat(marks10);
        String marks12=request.getParameter("marks12");
        Float m12=Float.parseFloat(marks12);
        String cgpa=request.getParameter("cgpa");
        Float cg=Float.parseFloat(cgpa);
        String school10=request.getParameter("school10");
        String school12=request.getParameter("school12");
        String college=request.getParameter("college"); 
        String about=request.getParameter("about");
        String user="";
        Candidate c=new Candidate();
        CandidateDAO cAccess=new CandidateDAO();
        c.setFname(fname);
        c.setLname(lname);
        c.setPhone(phone);
        c.setAddress(address);
        c.setCity(city);
        c.setState(state);
        c.setMarks10(m10);
        c.setMarks12(m12);
        c.setCgpa(cg);
        c.setSchool10(school10);
        c.setSchool12(school12);
        c.setCollege(college);
        c.setCabout(about);
        c.setEmail(mail);
        List<Candidate> rlist=cAccess.getCandidate(mail);
        for(Candidate rc:rlist)
        {
           user= rc.getUsername();
        }
        c.setUsername(user);
        cAccess.addCandidateInfo(c,mail);
        RequestDispatcher rd=request.getRequestDispatcher("task.jsp");
            rd.forward(request, response);
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
