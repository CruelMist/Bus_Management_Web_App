<%-- 
    Document   : profile
    Created on : Nov 26, 2018, 10:01:57 PM
    Author     : My Pc
--%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Profile</title>
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
		
		<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
                <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
                <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
		
                 <style>
				body{
                        background: -webkit-linear-gradient(left, #3931af, #00c6ff);
                    }
                    .emp-profile{
                        padding: 3%;
                        margin-top: 3%;
                        margin-bottom: 3%;
                        border-radius: 0.5rem;
                        background: #fff;
                    }
                    .profile-img{
                        text-align: center;
                    }
                    .profile-img img{
                        width: 70%;
                        height: 100%;
                    }
                    .profile-img .file {
                        position: relative;
                        overflow: hidden;
                        margin-top: -20%;
                        width: 70%;
                        border: none;
                        border-radius: 0;
                        font-size: 15px;
                        background: #212529b8;
                    }
                    .profile-img .file input {
                        position: absolute;
                        opacity: 0;
                        right: 0;
                        top: 0;
                    }
                    .profile-head h5{
                        color: #333;
                    }
                    .profile-head h6{
                        color: #0062cc;
                    }
                    .profile-edit-btn{
                        border: none;
                        border-radius: 1.5rem;
                        width: 70%;
                        padding: 2%;
                        font-weight: 600;
                        color: #6c757d;
                        cursor: pointer;
                    }
                    .proile-rating{
                        font-size: 12px;
                        color: #818182;
                        margin-top: 5%;
                    }
                    .proile-rating span{
                        color: #495057;
                        font-size: 15px;
                        font-weight: 600;
                    }
                    .profile-head .nav-tabs{
                        margin-bottom:5%;
                    }
                    .profile-head .nav-tabs .nav-link{
                        font-weight:600;
                        border: none;
                    }
                    .profile-head .nav-tabs .nav-link.active{
                        border: none;
                        border-bottom:2px solid #0062cc;
                    }
                    .profile-work{
                        padding: 14%;
                        margin-top: -15%;
                    }
                    .profile-work p{
                        font-size: 12px;
                        color: #818182;
                        font-weight: 600;
                        margin-top: 10%;
                    }
                    .profile-work a{
                        text-decoration: none;
                        color: #495057;
                        font-weight: 600;
                        font-size: 14px;
                    }
                    .profile-work ul{
                        list-style: none;
                    }
                    .profile-tab label{
                        font-weight: 600;
                    }
                    .profile-tab p{
                        font-weight: 600;
                        color: #0062cc;
                    }
                    </style>
        
                   
    </head>
    <body>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/carpool?useSSL=false","root","devil114");
            String user=(String)session.getAttribute("user");
            String query1="select * from userprof where email=?";
            PreparedStatement pstmt=conn.prepareStatement(query1);
            pstmt.setString(1,user);
            ResultSet rs=pstmt.executeQuery();
            %>
        <div class="container emp-profile">
            <form action="Profile" method="post">
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="profile-img">
                                        <img src="images/user.png" alt=""/>
                                        <div class="file btn btn-lg btn-primary">
                                            Change Photo
                                            <input type="file" name="file"/>
                                        </div>
                                    </div>
                                </div>
                                <% while(rs.next())
                                {%>
                                <div class="col-md-6">
                                    <div class="profile-head">
                                                <h5>
                                                    <%=rs.getString(1)+" "+rs.getString(2)%>
                                                </h5>
                                                
                                                <p class="proile-rating">RATING : <span>4.2/5</span></p>
                                        <ul class="nav nav-tabs" id="myTab" role="tablist">
                                            <li class="nav-item">
                                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">About</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Edit Profile</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <button class="profile-edit-btn"  name="btnAddMore" ><a href="index.jsp" class="profile-edit-btn">Go Back</a></button>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="profile-work">
                                        <p>RECENT TRIPS</p>
                                        <a href="">Trip 1</a><br/>
                                        <a href="">Trip 2</a><br/>
                                        <a href="">Trip 3</a>
                                        <p>RATINGS</p>
                                        <a href="">3/5</a><br/>
                                        <a href="">4/5</a><br/>
                                        <a href="">2/5</a><br/>
                                    </div>
                                </div>
                                <div class="col-md-8">
                                    <div class="tab-content profile-tab" id="myTabContent">
                                        <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>First Name</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <p><%=rs.getString(1)%></p>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>Last Name</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <p><%=rs.getString(2)%></p>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>Email</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <p><%=rs.getString(3)%></p>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>Phone</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <% if(rs.getString(4)==null)
                                                            {%>
                                                            <p>No Number Provided</p>
                                                            <%}
                                                            else
                                                             {%>
                                                             <p><%=rs.getString(4)%></p>
                                                             <%}%>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>Address</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <% if(rs.getString(5)==null)
                                                            {%>
                                                            <p>No Address Provided</p>
                                                            <%}
                                                            else
                                                             {%>
                                                             <p><%=rs.getString(5)%></p>
                                                             <%}%>
                                                        </div>
                                                    </div>
                                        </div>
                                        <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>First Name</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <input id="name" name="fname" placeholder="<%=rs.getString(1)%>" class="form-control here" type="text" disabled>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>Last Name</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <input id="name" name="lname" placeholder="<%=rs.getString(2)%>" class="form-control here" type="text" disabled>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>Email</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <input id="email" name="email" placeholder="<%=rs.getString(3)%>" class="form-control here" required="required" type="text" disabled>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>Phone</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <% if(rs.getString(4)==null)
                                                            {%>
                                                            <input id="phone" name="phno" placeholder="Phone Number" class="form-control here" required="required" type="number">
                                                            <%}
                                                            else
                                                             {%>
                                                             <input id="phone" name="phno" placeholder="<%=rs.getString(4)%>" class="form-control here" required="required" type="number">
                                                             <%}%>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>Address</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <% if(rs.getString(5)==null)
                                                            {%>
                                                            <input id="address" name="add" placeholder="Address" class="form-control here" required="required" type="text">
                                                            <%}
                                                            else
                                                             {%>
                                                             <input id="address" name="add" placeholder="<%=rs.getString(5)%>" class="form-control here" required="required" type="text">
                                                             <%}%>
                                                        </div>
                                                    </div>
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <input type="submit" class="profile-edit-btn" name="btnAddMore" value="Save Changes"/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>           
                    </div>
                                                        <%}%>
    </body>
</html>

