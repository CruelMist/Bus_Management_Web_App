<%-- 
    Document   : end
    Created on : Dec 3, 2018, 3:30:00 AM
    Author     : My Pc
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
		<meta name="description" content="">
		<meta name="author" content="">
		<link rel="icon" href="favicon.ico">
		<title>Host</title>
		<!-- Bootstrap core CSS -->
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
		<!-- Custom styles for this template -->
		<link href="css/jquery.bxslider.css" rel="stylesheet">
		<link href="css/style.css" rel="stylesheet">
                 <style>
                    .dropdown .dropdown-menu a {
    color: #8c8c8c;
    text-decoration: none;
    text-decoration-line: none;
    text-decoration-style: initial;
    text-decoration-color: initial;
}
.dropdown-menu .dropdown-item {
    display: inline-block;
    width: 100%;
    padding: 10px 5px;
}
.dropdown-item {
    display: block;
    width: 100%;
    padding: .25rem 1.5rem;
    clear: both;
    font-weight: 400;
    color: #212529;
    text-align: inherit;
    white-space: nowrap;
    background-color: transparent;
    border: 0;
}

.dropdown-menu {
    position: absolute;
    top: 100%;
    left: 0;
    z-index: 1000;
    display: none;
    float: left;
    min-width: 160px;
    padding: 5px 0;
    margin: 2px 0 0;
    font-size: 14px;
    text-align: left;
    list-style: none;
    background-color: #262626;
    -webkit-background-clip: padding-box;
    background-clip: padding-box;
    border: 1px solid #ccc;
    border: 1px solid rgba(0,0,0,.15);
    border-radius: 4px;
    -webkit-box-shadow: 0 6px 12px rgba(0,0,0,.175);
    box-shadow: 0 6px 12px rgba(0,0,0,.175);
}
.container .dropdown .dropdown-menu a:hover
{
  color: #666666;
  background-color: #666666;
  border-color: #666666;
}
                </style>

<%
                        Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/carpool?useSSL=false","root","devil114");
            String user=(String)session.getAttribute("user");
            String query1="select * from userlog where email=?";
            PreparedStatement pstmt=conn.prepareStatement(query1);
            pstmt.setString(1,user);
            String query11="select * from hosting where host_mail=?";
            PreparedStatement pstmt11=conn.prepareStatement(query11);
            pstmt11.setString(1,user);
            ResultSet rs=pstmt.executeQuery();
            %>
<nav class="navbar navbar-expand-lg navbar-inverse navbar-fixed-top  navbar-dark">
                <a class="navbar-brand" href="#">Carpool</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="nav navbar-nav">
                    <li class="navbar-item active">
                        <a href="index.jsp">Home</a>
                    </li>
                    <li class="navbar-item">
                        <a class="nav-link" href="profile.jsp">Profile</a>
                    </li>
                    <%
                        
            if(rs.last()==true)
            {
            %>
                    <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Pooling
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="host.jsp">Host Trip</a>
          <a class="dropdown-item" href="ride.jsp">Ride Trips </a>
          <%
                   ResultSet rs11=pstmt11.executeQuery();     
            if(rs11.last()==true)
            {
            %>
          <a class="dropdown-item" href="end.jsp">End Trip </a>
          <%}%>
        </li>
        <%}%>
    </ul>
                    <%
                        
            if(rs.last()==true)
            {
            %>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="logout.jsp" name="logout" ><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
            </ul>
            <%}
             else
                { %>
            
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="login.html"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="login.html"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </ul>
                <%}%>
  </div>
</nav>
	</head>
	<body>

		<div class="container">
		<header>
                    <form action="End" post="method">
                        <button type="submit" name="end" value="end" class="btn btn-primary"><h1>End Trip</h1></button>
                    </form>
                    
		</header>
		<section>
			<div class="row">
                                
				<div class="col-md-8">
                                    
				</div>
				<div class="col-md-4 sidebar-gutter">
					<aside>
					<!-- sidebar-widget -->
					<div class="sidebar-widget">
						<h3 class="sidebar-title">About Me</h3>
						<div class="widget-container widget-about">
							<a href="#"><img src="images/pool2.jpg" alt=""></a>
							<h4>Vishwas Anand</h4>
							<div class="author-title">Designer</div>
							<p>While everyone’s eyes are glued to the runway, it’s hard to ignore that there are major fashion moments on the front row too.</p>
						</div>
					</div>
					<!-- sidebar-widget -->
					<div class="sidebar-widget">
						<h3 class="sidebar-title">Featured Posts</h3>
						<div class="widget-container">
							<article class="widget-post">
								<div class="post-image">
									<a href="#"><img src="images/pool5.jpg" alt=""></a>
								</div>
								<div class="post-body">
									<h2><a href="#">New development in car pooling</a></h2>
									<div class="post-meta">
										<span><i class="fa fa-clock-o"></i> 21. November 2018</span> <span><a href="#"><i class="fa fa-comment-o"></i> 23</a></span>
									</div>
								</div>
							</article>
							<article class="widget-post">
								<div class="post-image">
									<a href="#"><img src="images/pool6.jpg" alt=""></a>
								</div>
								<div class="post-body">
									<h2><a href="#">Why we need private vehicles when pooling is cheaper?</a></h2>
									<div class="post-meta">
										<span><i class="fa fa-clock-o"></i> 21. November 2018</span> <span><a href="#"><i class="fa fa-comment-o"></i> 23</a></span>
									</div>
								</div>
							</article>
							<article class="widget-post">
								<div class="post-image">
									<a href="#"><img src="images/pool8.jpg" alt=""></a>
								</div>
								<div class="post-body">
									<h2><a href="#">Current scenario after hike in fuel</a></h2>
									<div class="post-meta">
										<span><i class="fa fa-clock-o"></i> 21. November 2018</span> <span><a href="#"><i class="fa fa-comment-o"></i> 23</a></span>
									</div>
								</div>
							</article>
							<article class="widget-post">
								<div class="post-image">
									<a href="#"><img src="images/pool.jpg" alt=""></a>
								</div>
								<div class="post-body">
									<h2><a href="#">Vintage-Inspired Finds for Your Home</a></h2>
									<div class="post-meta">
										<span><i class="fa fa-clock-o"></i> 21. November 2018</span> <span><a href="#"><i class="fa fa-comment-o"></i> 23</a></span>
									</div>
								</div>
							</article>
							<article class="widget-post">
								<div class="post-image">
									<a href="#"><img src="images/pool11.jpg" alt=""></a>
								</div>
								<div class="post-body">
									<h2><a href="#">New vehicles for better comfort</a></h2>
									<div class="post-meta">
										<span><i class="fa fa-clock-o"></i> 21. November 2018</span> <span><a href="#"><i class="fa fa-comment-o"></i> 23</a></span>
									</div>
								</div>
							</article>
						</div>
					</div>
					<!-- sidebar-widget -->
					<div class="sidebar-widget">
						<h3 class="sidebar-title">Socials</h3>
						<div class="widget-container">
							<div class="widget-socials">
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-instagram"></i></a>
								<a href="#"><i class="fa fa-google-plus"></i></a>
								<a href="#"><i class="fa fa-dribbble"></i></a>
								<a href="#"><i class="fa fa-reddit"></i></a>
					</div>
					</div>
                                        </div>
					</aside>
				</div>
			</div>
		</section>
		</div><!-- /.container -->

		<footer class="footer">

			<div class="footer-socials">
				<a href="#"><i class="fa fa-facebook"></i></a>
				<a href="#"><i class="fa fa-twitter"></i></a>
				<a href="#"><i class="fa fa-instagram"></i></a>
				<a href="#"><i class="fa fa-google-plus"></i></a>
				<a href="#"><i class="fa fa-dribbble"></i></a>
				<a href="#"><i class="fa fa-reddit"></i></a>
			</div>

			<div class="footer-bottom">
				<i class="fa fa-copyright"></i> Copyright 2018. All rights reserved.
				
			</div>
		</footer>

		<!-- Bootstrap core JavaScript
			================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/jquery.bxslider.js"></script>
		<script src="js/mooz.scripts.min.js"></script>
	</body>
</html>
