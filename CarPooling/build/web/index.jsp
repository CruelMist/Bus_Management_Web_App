<%-- 
    Document   : index.jsp
    Created on : Nov 25, 2018, 7:14:05 PM
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
		
		<meta name="description" content="">
		<meta name="author" content="">
		<link rel="icon" href="favicon.ico">
		<title>Carpooling - made by Vishwas Anand</title>
                
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
		
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
                    <%
                        
            if(rs.last()==true)
            {
            %>
                    <li class="navbar-item">
                        <a class="nav-link" href="profile.jsp">Profile</a>
                    </li>
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
    <!--<nav class="navbar navbar-expand-lg navbar-inverse navbar-fixed-top ">
        
                <a class="navbar-brand" href="#">Carpool</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            
           
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="nav navbar-nav">
                    <li class="navbar-item active">
                        <a href="index.html">Home</a>
                    </li>
                    <li class="navbar-item">
                        <a class="nav-link" href="#about">Lifestyle</a>
                    </li>
                    <li class="navbar-item">
                        <a class="nav-link" href="#pooling">Pooling</a>
                    </li>
                </ul>
                <ul class="nav navbar-nav">
                    <li><a href="login.html"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="login.html"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </ul> 
            </div>
        
    </nav>-->

        </head>
	<body>



		<div class="container">
		<header>
			<a href="index.jsp"><h1>Carpooling</h1><br><h2>by: Vishwas Anand</h2></a>
		</header>
		<section class="main-slider">
			<ul class="bxslider">
				<li><div class="slider-item"><img src="images/10.jpg" title="Funky roots" /><h2><a href="#" title="Vintage-Inspired Finds for Your Home">Vintage-Inspired Finds for Your Home</a></h2></div></li>
				<li><div class="slider-item"><img src="images/11.jpg" title="Funky roots" /><h2><a href="#" title="Vintage-Inspired Finds for Your Home">Vintage-Inspired Finds for Your Home</a></h2></div></li>
				<li><div class="slider-item"><img src="images/pool3.jpg" title="Funky roots" /><h2><a href="#" title="Vintage-Inspired Finds for Your Home">Vintage-Inspired Finds for Your Home</a></h2></div></li>
			</ul>
		</section>
		<section>
			<div class="row">
				<div class="col-md-8">
					<article class="blog-post">
						<div class="blog-post-image">
							<a href="#"><img src="images/pool5.jpg" alt=""></a>
						</div>
						<div class="blog-post-body">
							<h2><a href="#">We serve everyone in home with complete care</a></h2>
							<div class="post-meta"><span>by <a href="#">Vishwas Anand</a></span>/<span><i class="fa fa-clock-o"></i>November 21, 2018</span>/<span><i class="fa fa-comment-o"></i> <a href="#">343</a></span></div>
							<p>Carpooling saves money and reduces congestion on our roads and highways. It also gives you the opportunity to develop new friendships with co-workers or other commuters. There are a number of benefits when two or more people share a ride in one vehicle.<div class="read-more"><a href="#">Continue Reading</a></div>
						</div>
					</article>
					
					<article class="blog-post">
						<div class="blog-post-image">
							<a href="#"><img src="images/pool3.jpg" alt=""></a>
						</div>
						<div class="blog-post-body">
							<h2><a href="#">Some of the mentioned benefits of car pooling</a></h2>
							<div class="post-meta"><span>by <a href="#">Vishwas Anand</a></span>/<span><i class="fa fa-clock-o"></i>November 21, 2018</span>/<span><i class="fa fa-comment-o"></i> <a href="#">343</a></span></div>
							<p>Driving takes a big bite out of your budget and your time. Because the average household in the region travels approximately 39 miles each day, when gas is $3.00 per gallon the average household is paying $5.32 each day for gasoline alone. Additionally, the average commuter spends an extra 39 hours per year on the road due to gridlock.<div class="read-more"><a href="#">Continue Reading</a></div>
						</div>
					</article>
					<!-- article -->
					<article class="blog-post">
						<div class="blog-post-image">
							<a href="#"><img src="images/pool10.jpg" alt=""></a>
						</div>
						<div class="blog-post-body">
							<h2><a href="#">What is car pooling and why is is soo modern these days in our country?</a></h2>
							<div class="post-meta"><span>by <a href="#">Vishwas Anand</a></span>/<span><i class="fa fa-clock-o"></i>November 21, 2018</span>/<span><i class="fa fa-comment-o"></i> <a href="#">343</a></span></div>
							<p>Carpooling is when several people travel together by car and share the cost of the journey. You probably already carpool very often with family and friends: every time you take the car together you share the cost of a journey with them. In much the same way, BlaBlaCar connects car owners and co-travellers to share city-to-city journeys, so that they can share a long distance trip together, and both save money.<div class="read-more"><a href="#">Continue Reading</a></div>
						</div>
					</article>
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
					<!-- sidebar-widget -->
					<div class="sidebar-widget">
						<h3 class="sidebar-title">Categories</h3>
						<div class="widget-container">
							<ul>
								<li><a href="#">Nearby</a></li>
								<li><a href="#">Inter-City</a></li>
								<li><a href="#">Inter-State</a></li>
								<li><a href="#">Pool-XL</a></li>
								<li><a href="#">Premium</a></li>
								<li><a href="#">Uncategorized</a></li>
							</ul>
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

			
		

		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/jquery.bxslider.js"></script>
		<script src="js/mooz.scripts.min.js"></script>
	</body>
</html>