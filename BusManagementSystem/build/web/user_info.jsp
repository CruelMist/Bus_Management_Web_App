<%-- 
    Document   : user_info
    Created on : Apr 3, 2019, 10:48:07 PM
    Author     : My Pc
--%>

<%@page import="Model.User"%>
<%@page import="java.util.List"%>
<%@page import="Model.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <%
    String use=(String)session.getAttribute("email");
    UserDAO uAccess=new UserDAO();
    List<User> uL=uAccess.getUser();
    %>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- <link rel="stylesheet" href="bootstrap/css/bootstrap.css"> -->
        <script src="jquery-3.3.1.js"></script>
        <!-- <script type="text/javascript" src="iconwc.js"></script> -->
        <link rel="stylesheet" href="animate.css">
        <link rel="stylesheet" href="styles1.css">
        <style media="screen">
            .col1{
                padding:10px;
                display: flex;
                flex-wrap: wrap;
                flex-direction: row;
                justify-content: center;
                align-items: center;
            }
            .sch{
                padding:15px;
                width:70vh;
                height:70%;
                border-collapse: collapse;
            }
            
            
            .sch td{
                background:white;
                border:none;
                text-align: center;
                width:50%;
                /* border: 1px solid rgb(216, 8, 8); */
            }
            
            
            .sch tr:hover td{
                background: rgb(170, 24, 24);
                color:white;
            }
            .sch tr:hover th{
                background: white;
                color:black;
            }
            .btn-sch{
                background:rgb(216, 8, 8);
                padding:20px;
                font-size: 100%;
                border:2px solid white;
                border-radius: 4%;
                color:white;
            }
            .btn-sch:hover{
                background:white;
                color:black;
            }
            .btn-home{
                background:rgb(216, 8, 8);
                padding: 0 15px 0 20px;
                border:2px solid white;
                border-radius: 4%;
                width:20%;
                height:10vh;
            }
            .btn-home:hover{
                background: rgb(170, 24, 24);
            }
            .sub-col{
                width:95%;
                display: flex;
                flex-wrap: wrap;
                flex-direction: row;
                justify-content: space-around;
            }
            .pre{
                display:flex;
                justify-content: right;
                flex-wrap: wrap;
                flex-direction: column;
            }
            
            .sch th{
                background: rgb(170, 24, 24);
                color:white;
            }
            .del-svg{
                width:20%;
            }
            .del-svg .si-glyph *{
                fill:red;
            }
            @media(min-width:2560px)
            {
                .sch{
                    width:70vh;
                }
            }
            @media(max-width:1024px){
                .sch{
                    width:70vh;
                }
            }
            @media(max-width:768px){
                .col1{
                    padding:0
                }
                .sch{
                    width:70vh;
                    padding:0;
                }
                .sub-col{
                    width:80%;
                }
                .sch td{
                    font-size:60%;
                }
            }
            @media(max-width:425px){
                .sch{
                    width:50vh;
                }
                .btn-sch{
                    width:30%;
                }
                .btn-home{
                    padding:0;
                }
            }
            @media(max-width:375px){
                .container{
                    width:65vh;
                }
                .btn-sch{
                    padding:0;
                }
            }
        </style>

    </head>
    <body>
        <div class="header">
            <img class="logo" src="cu_logo3.png">
        </div>
        <div class="container">
            <div class="col1">
                    
                <table class="sch">
                    <!-- <tr class="thead">
                        <th>Bus ID</th><th>Driver ID</th><th>Driver Name</th><th>Contact</th><th>Route</th><th>Date</th>
                    </tr> -->
                    <%
                    for(User u:uL)
                    {
                        if(u.getEmail().equals(use))
                        {%>
                    <tr>
                        
                        <th>Email</th><td><%=u.getEmail()%></td>
                    </tr>
                    <tr>
                        
                        <th>User Type</th><td><%=u.getType()%></td>
                    </tr>
                    <tr>
                        
                        <th>Password</th><td><%=u.getPwd()%></td>
                    </tr>
                    <%}
                    }%>
                </table>
                <div class="sub-col">
                    <%
                    for(User u:uL)
                    {
                        if(u.getEmail().equals(use))
                        {
                            if(u.getType().equals("staff")){%>
                <button class="btn-home" onclick=window.location.href='page2-staff.html'><svg viewBox="0 0 17 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="si-glyph si-glyph-house"><title>Home</title><defs></defs><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g transform="translate(1.000000, 1.000000)" fill="#434343"><path d="M15.794,7.77 L11.984,3.864 L11.9839997,1.01706251 L11.0159997,1.03906251 L11.016,2.767 L8.502,0.245 C8.224,-0.031 7.776,-0.031 7.499,0.245 L0.206,7.771 C-0.069,8.048 -0.068,8.498 0.206,8.773 C0.482,9.049 0.933,9.049 1.209,8.772 L8,1.982 L14.793,8.772 C14.931,8.91 15.111,8.98 15.293,8.98 C15.474,8.98 15.654,8.912 15.794,8.773 C16.068,8.496 16.068,8.045 15.794,7.77 L15.794,7.77 Z" class="si-glyph-fill"></path><path d="M3.043,8.532 L3.043,14.222 C3.043,14.616 3.26102394,15.0078125 3.61002394,15.0078125 L5.88702394,15.0078125 L5.95099996,11.0147705 L10.0249632,11.0147705 L10.0230128,15.0078125 L12.3260496,15.0078125 C12.6750496,15.0078125 12.958,14.617 12.958,14.222 L12.958,8.531 L8,3.625 L3.043,8.532 L3.043,8.532 Z" class="si-glyph-fill"></path></g></g></svg>
                </button>
                    <%}
                else{%>
                <button class="btn-home" onclick=window.location.href='page2(stu).html'><svg viewBox="0 0 17 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="si-glyph si-glyph-house"><title>Home</title><defs></defs><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g transform="translate(1.000000, 1.000000)" fill="#434343"><path d="M15.794,7.77 L11.984,3.864 L11.9839997,1.01706251 L11.0159997,1.03906251 L11.016,2.767 L8.502,0.245 C8.224,-0.031 7.776,-0.031 7.499,0.245 L0.206,7.771 C-0.069,8.048 -0.068,8.498 0.206,8.773 C0.482,9.049 0.933,9.049 1.209,8.772 L8,1.982 L14.793,8.772 C14.931,8.91 15.111,8.98 15.293,8.98 C15.474,8.98 15.654,8.912 15.794,8.773 C16.068,8.496 16.068,8.045 15.794,7.77 L15.794,7.77 Z" class="si-glyph-fill"></path><path d="M3.043,8.532 L3.043,14.222 C3.043,14.616 3.26102394,15.0078125 3.61002394,15.0078125 L5.88702394,15.0078125 L5.95099996,11.0147705 L10.0249632,11.0147705 L10.0230128,15.0078125 L12.3260496,15.0078125 C12.6750496,15.0078125 12.958,14.617 12.958,14.222 L12.958,8.531 L8,3.625 L3.043,8.532 L3.043,8.532 Z" class="si-glyph-fill"></path></g></g></svg>
                </button>
                <%} } }%>
                </div>
            </div>
        </div>
        <div class="footer">
            Copyright © Chitkara University 2019
        </div>
        
    </body>
<html>
