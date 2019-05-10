<%-- 
    Document   : apply
    Created on : Apr 14, 2019, 12:01:50 PM
    Author     : My Pc
--%>

<%@page import="Model.Recruiter_Jobs"%>
<%@page import="Model.Recruiter"%>
<%@page import="java.util.List"%>
<%@page import="Model.Recruiter_JobsDAO"%>
<%@page import="Model.RecruiterDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        RecruiterDAO r1Access=new RecruiterDAO();
        Recruiter_JobsDAO r2Access=new Recruiter_JobsDAO();
        List<Recruiter> l1=r1Access.getAllRecruiter();
        List<Recruiter_Jobs> l2=r2Access.getRecruiterJobs();
        
    %>
    <head>
        <title>Task</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="myCss.css" type="text/css">
        <link rel="stylesheet" href="bootstrap.css" type="text/css">
        <link rel="stylesheet" href="bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="newCss.css" type="text/css">
        <script src="WEB-INF/assets/code.jquery.com_jquery-3.3.1.min.js" type="text/javascript"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
  <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
    </head>
    <body>
<div class="sect">
    <div class=" clear-filter" style="background-attachment: fixed;">
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
          <a href="contact.html#">Contact</a>
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
        
              <p>Sign Up</p>
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
                <div class="video-container">
            <div class="color-overlay"></div>
            <video width="1400"  autoplay loop muted >
                <source src="Light Illuminating Blue Glitter Particles _ 4K Relaxing Screensaver.mp4" type="video/mp4">
            </video>
        </div>
          <div id="side-menu" class="side-nav">
       
        <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
        <a href="./myproject/my.html">Home</a>
        <a href="./myproject/about.html">About</a>
        <a href="./myproject/services.html">Services</a>
        <a href="./myproject/contact.html">Contact</a>
      </div>
        
        <div class="middle">
            <form action="applicationServlet" method="POST">
            <div class="menu">
                
                    <%
                        String prev="";
                        int count=0;
                for(Recruiter rec1:l1)
                {
                    
                    for(Recruiter_Jobs rec2:l2)
                    {
                        if(prev.equals(rec2.getEmail())){}
                    else{
                        if(rec1.getEmail().equals(rec2.getEmail()))
                        {
                            prev=rec1.getEmail();
                            count++;
            %>
                <li class="item" id="<%=count%>">
                    <a href="#<%=count%>" class="btn-m" style="font-size: 20px;"><i class="far fa-building" style="padding:5px; font-size: 20px;"></i><%=rec1.getCname()%></a>
                    
                    <div class="smenu">
                        <%
                List<Recruiter_Jobs> jobList=r2Access.getRecruiterJobs(rec1.getEmail());
                for(Recruiter_Jobs j:jobList)
                {
            %>
                        <a href="#"><%=j.getJob()%></a>
                        <a href="#"><%=j.getJobDescription()%></a>
                        <button class="btn" value="<%=j.getJob()+"div00ide"+rec1.getCname()%>" name="job" type="submit">Apply</button>
                        <hr style="border-color: rgb(112, 107, 107);"/>
                        <%} %>
                    </div>
                </li>
                <%} } } }%>
                <li class="item" >
                    <a href="#" class="btn-m">Close</a>
                </li>
            </div>
            </form>
        </div>
        </div>
</div>
   

<!--<div class="sect"></div>
<div class="subsect"></div>
<div class="sect"></div>-->


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


