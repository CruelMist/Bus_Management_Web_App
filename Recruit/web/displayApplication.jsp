    <%-- 
    Document   : displayApplication
    Created on : Apr 14, 2019, 12:50:50 PM
    Author     : My Pc
--%>

<%@page import="Model.Candidate_Project"%>
<%@page import="Model.Candidate"%>
<%@page import="Model.Candidate_ProjectDAO"%>
<%@page import="Model.CandidateDAO"%>
<%@page import="Model.RecruiterDAO"%>
<%@page import="Model.Recruiter"%>
<%@page import="Model.Application"%>
<%@page import="Model.ApplicationDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% 
        String mail=(String)session.getAttribute("email");
        RecruiterDAO rAccess=new RecruiterDAO();
        List<Recruiter> rlist=rAccess.getRecruiter(mail);
        String company="";
        for(Recruiter r:rlist)
        {
            company=r.getCname();
        }
        ApplicationDAO appAccess=new ApplicationDAO();
        List<Application> alist=appAccess.getApplication(company);
        CandidateDAO cAccess=new CandidateDAO();
        Candidate_ProjectDAO cpAccess=new Candidate_ProjectDAO();
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display</title>
          <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
<link rel="stylesheet" href="myCss.css" type="text/css">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="newCss.css" type="text/css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <style>
      
/*table*/

 .tab tr:nth-child(even){
  background-color: #f2f2f2;
}

.tab tr:hover{
  background-color: #ddd;
 
}

  </style>
    </head>
    <body>
       <div class="sect"  >
    
    <div  class=" clear-filter" style=" background: linear-gradient(rgba(1,1,1 ,.7),rgba(1,1,1,0)),url(https://images.pexels.com/photos/1363876/pexels-photo-1363876.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940); background-size: inherit;">
      <nav id="navi" class="navbar navbar-expand-lg bg-primary fixed-top navbar-transparent " color-on-scroll="400">
      <span class="open-slide">
          <a href="#" onclick="openSlideMenu()">
            <svg width="30" height="30">
                <path d="M0,5 30,5" stroke="#fff" stroke-width="1.5"/>
                <path d="M0,14 30,14" stroke="#fff" stroke-width="1.5"/>
                <path d="M0,23 30,23" stroke="#fff" stroke-width="1.5"/>
            </svg>
          </a>
        </span>
        <div id="side-menu" class="side-nav nav-item">
          <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
          <a href="index.html">Home</a>
          <a href="about.html">About</a>
          <a href="services.html">Services</a>
          <a href="contact.html">Contact</a>
        </div>
    <div class="container">
      <div class="navbar-translate">
       
       
        
        
        <button class="navbar-toggler navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-bar top-bar"></span>
          <span class="navbar-toggler-bar middle-bar"></span>
          <span class="navbar-toggler-bar bottom-bar"></span>
        </button>
      </div>
      <div class="collapse navbar-collapse justify-content-end" id="navigation" data-nav-image="./assets/img/blurred-image-1.jpg">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href="javascript:void(0)"  onclick="scrollToSign()" >
        
              <p>Logout</p>
            </a>
          </li>

         
          <li class="nav-item">
            <a class="nav-link" rel="tooltip" title="Follow us on Twitter" data-placement="bottom" href="https://twitter.com" target="_blank">
              <i class="fab fa-twitter"></i>
              <p class="d-lg-none d-xl-none">Twitter</p>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" rel="tooltip" title="Like us on Facebook" data-placement="bottom" href="https://www.facebook.com" target="_blank">
              <i class="fab fa-facebook-square"></i>
              <p class="d-lg-none d-xl-none">Facebook</p>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" rel="tooltip" title="Follow us on Instagram" data-placement="bottom" href="https://www.instagram.com/kapoortania00" target="_blank">
              <i class="fab fa-instagram"></i>
              <p class="d-lg-none d-xl-none">Instagram</p>
            </a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
        <!--nav ends-->
               
          <div id="side-menu" class="side-nav">
       
        <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
        <a href="my.html">Home</a>
        <a href="about.html">About</a>
        <a href="services.html">Services</a>
        <a href="contact.html">Contact</a>
      </div>
        <div style=" padding-top:80px; ">
            <table class="table" style="color:white;">
                  <tr><th>Candidate Name</th><th>Applied For</th><th>Resume</th></tr>
            <%for(Application a:alist)
            {%>
                  <tr><td><%=a.getApplicantName()%></td><td><%=a.getJob()%></td><td><a data-toggle="modal" data-target="#mod" ><i class="fas fa-search"></i></a></td>
                  </tr>
        </table>
         <button class="btn" onclick=window.location.href='task.jsp' style="background-color:white;color:purple;">Back</button>
        
<!--        modal-->

 <!-- The Modal -->
  <div class="modal" id="mod" >
    <div class="modal-dialog" style="justify-content:center;">
      <div class="modal-content" style=" display:flex;justify-content:center; left:-20%; width: 750px;">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Resume</h4>
          
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body" style="display: flex; flex-direction:column; align-items:center;">
          <table class="table">
              <%
                  List<Candidate> clist=cAccess.getCandidate(a.getApplicantMail());
                  for(Candidate c:clist)
                  {%>
              <tr><th>Email</th><td><%=c.getEmail()%></td></tr>
              <tr><th>Phone</th><td><%=c.getPhone()%></td></tr>
              <tr><th>Marks in 10th</th><td><%=c.getMarks10()%></td></tr>
              <tr><th>Marks in 12th</th><td><%=c.getMarks12()%></td></tr>
              <tr><th>CGPA</th><td><%=c.getCgpa()%></td></tr>
              <tr><th>School in 10th</th><td><%=c.getSchool10()%></td></tr>
              <tr><th>School in 12th</th><td><%=c.getSchool12()%></td></tr>
              <tr><th>College</th><td><%=c.getCollege()%></td></tr>
              <tr><th>Address</th><td><%=c.getAddress()%></td></tr>
              <tr><th>City</th><td><%=c.getCity()%></td></tr>
              <tr><th>State</th><td><%=c.getState()%></td></tr>
              <tr><th>About Me</th><td><%=c.getCabout()%></td></tr>
              <%}%>
          </table>
          <table class="table">
              <tr><th>Project Name</th><th>Project Description</th></tr>
              <%
                  List<Candidate_Project> cplist=cpAccess.getCandidateProject(a.getApplicantMail());
                  for(Candidate_Project cp:cplist)
                  {%>
              <tr><td><%=cp.getProjectName()%></td><td><%=cp.getProjectName()%></td></tr>
              <% } %>
          </table>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>
  </div>
  <% } %>
  </div>
 
        </div>
    </div>
  <script>
      function closeSlideMenu(){
      document.getElementById('side-menu').style.width = '0px';
      
    }
    function openSlideMenu(){
      document.getElementById('side-menu').style.width = '200px';
     /* document.getElementById('main').style.marginLeft = '200px';*/
    }
    
    $(function () {
  $(document).scroll(function () {
    var $nav = $("#navi");
    $nav.toggleClass('scrolled', $(this).scrollTop() > $nav.height());
  });
});
</script> 
    </body>
</html>
