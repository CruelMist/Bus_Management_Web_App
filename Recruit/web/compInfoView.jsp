<%-- 
    Document   : compInfo
    Created on : Apr 14, 2019, 2:14:31 AM
    Author     : My Pc
--%>

<%@page import="Model.RecruiterDAO"%>
<%@page import="Model.Recruiter"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
    String use=(String)session.getAttribute("email");
    RecruiterDAO uAccess=new RecruiterDAO();
    List<Recruiter> uL=uAccess.getRecruiter(use);
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CompanyInfo</title>
        
           <link rel="stylesheet" href="myCss.css" type="text/css">
        <link rel="stylesheet" href="bootstrap.css" type="text/css">
        <link rel="stylesheet" href="bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="newCss.css" type="text/css">
        <script src="WEB-INF/assets/code.jquery.com_jquery-3.3.1.min.js" type="text/javascript"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
  <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
  <style>
      .sect
      {
          height:auto;
          background-position: center;
          background-attachment: local; 
      }
      .clear-filter2 {

    background: -webkit-linear-gradient(left, transparent 0%,#fff 50%,transparent 100%);
    background: linear-gradient(to top, rgba(255,0,0,0), rgba(255,0,0,1));
    background: rgba(255,0 ,0, .2);
    background: linear-gradient(rgba(26, 188, 156,.7),rgba(241, 196, 15,.7));
    -webkit-background-size: cover;
    background-size: cover;
    background-attachment: fixed;
    text-align: center;
    color:white;
    min-height: 100vh;
    z-index: -1;
}
.cont{
    width:100%;
    margin: 0;
    padding-top: 80px;
    padding-left:0px;
}
.table{
    margin:0 auto;
    padding :10% 0 0 0;
    
    /*padding: 5%;*/
    padding-top:80px;}
table > tr > td > input{
     border: 0;
    outline: none;
    height: 40px;
    
}/*
input:hover{opacity:1;}
  input, textarea, select {
    width : 150px;
    margin: 0;
  
    -webkit-box-sizing: border-box;  For legacy WebKit based browsers 
       -moz-box-sizing: border-box;  For legacy (Firefox <29) Gecko based browsers 
            box-sizing: border-box;
  }*/
  </style>
    </head>
    <body>
        <div class="sect"  >
    
    <div  class=" clear-filter2" style=" background: linear-gradient(rgba(250,128,114 ,.7),rgba(1,1,1,.7)),url(https://i.pinimg.com/originals/eb/2a/33/eb2a33ef67815e219f838d69e642aaf2.jpg);">
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
          <a href="./myproject/my.html">Home</a>
          <a href="./myproject/about.html">About</a>
          <a href="./myproject/services.html">Services</a>
          <a href="./myproject/contact.html#">Contact</a>
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
            <a class="nav-link" href="logout.jsp"  onclick="scrollToSign()" >
        
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
        <a href="./myproject/my.html">Home</a>
        <a href="./myproject/about.html">About</a>
        <a href="./myproject/services.html">Services</a>
        <a href="./myproject/contact.html">Contact</a>
      </div>
       <div class="cont">
            <table class="table">
                <% for (Recruiter u: uL){%>
                <tr><th>Email</th><td><%=u.getEmail()%></td></tr>
                <tr><th>Username</th><td><%=u.getUsername()%></td></tr>
                
                <tr><th>Company Name</th><td><%=u.getCname()%></td></tr>
                <tr><th>Address</th><td><%=u.getAddress()%></td></tr>
                <tr><th>City</th><td><%=u.getCity()%></td></tr>
                <tr><th>State</th><td><%=u.getState()%></td></tr>
                <tr><th>About the Company</th>
                    <td><%=u.getRabout()%></td></tr>
                <tr><td colspan="2"><button class="btn" onclick=window.location.href='task.jsp' type="button">Back</button></td></tr>
                <%}%>
            </table>
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
  <script type="text/javascript" src="particles.js"></script>
    <script type="text/javascript" src="app.js"></script>
    
    </body>
</html>
