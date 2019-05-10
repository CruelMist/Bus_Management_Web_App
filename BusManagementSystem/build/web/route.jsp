<%@page import="Model.User"%>
<%@page import="Model.UserDAO"%>
<%@page import="Model.Route"%>
<%@page import="Model.RouteDAO"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<% 
    RouteDAO schAccess=new RouteDAO();
    List <Route> list=schAccess.getRoute();
    int count=0;
    String use=(String)session.getAttribute("email");
    UserDAO uAccess=new UserDAO();
    List<User> uL=uAccess.getUser();
%>
<html lang="en" dir="ltr">
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
                width:170vh;
                height:70%;
                border-collapse: collapse;
            }
            .del-tab{
                margin:0;
                height:60%;
                width:10vh;
                display: none;
                border-collapse: collapse;
            }
            .del-tab td{
                /* background:white; */
                border:none;
                height:11.4vh;
                text-align: center;
                /* width:16.667%; */
                /* border: 1px solid rgb(216, 8, 8); */
            }
            .del-tab th{
                /* padding:10px; */
                height: 10vh;
                background:black;
                /* border: 1px solid white; */
                color:white;
                border:none;
            }
            .sch td{
                background:white;
                border:none;
                text-align: center;
                width:16.667%;
                border: 1px solid rgb(216, 8, 8);
            }
            .thead{
                padding:10px;
                height: 10vh;
                background:rgb(216, 8, 8);
                /* border: 1px solid white; */
                color:white;
                border:none;
                /* width:10%; */
            }
            .sch tr:nth-child(even) td{
                background-color: #f0e8e8;
            }
            .sch tr:hover td{
                background: rgb(170, 24, 24);
                color:white;
            }
            .btn-sch{
                background:rgb(216, 8, 8);
                padding:20px;
                font-size: 100%;
                border:2px solid white;
                border-radius: 4%;
                color:white;
                transition-duration: 0.5s;
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
                transition-duration: 0.5s;
            }
            .btn-home:hover{
                background: rgb(170, 24, 24);
            }
            .sub-col{
                width:85%;
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
            form{
                height:85%;
                width: 80%;
            }
            .del{
                /* display:none; */
                background:black;
                padding:0;
                
                /*height:100%;*/
                border: 2px solid black;
                border-radius: 5%;
                transition-duration: 0.2s;
            }
            .del-svg{
                width:20%;
            }
            .del-svg .si-glyph *{
                fill:red;
            }
            .sch tr td:last-child {
                border: none;
                display: none;
            }
            td svg{
                height:30%;
            }
            form{
                display:flex;
                flex-direction: column;
                flex-wrap: wrap;
                justify-content: space-around;
            }
            .td-del{
                height:0;
                padding:0;
                margin:0;
                width:auto;
            }
            @media(min-width:2560px)
            {
                .sch{
                    width:160vh;
                }
            }
            @media(max-width:1024px){
                .sch{
                    width:150vh;
                }
            }
            @media(max-width:768px){
                .col1{
                    padding:0
                }
                .sch{
                    width:100vh;
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

                <form action="DeleteRoute" method="POST">
                <table class="sch">
                    <tr class="thead">
                        <th>Route ID</th><th>Route</th>
                    </tr>
                    <% 
                        for(Route sch:list){
                            count+=1;
                    %>
                    <tr>
                        <td>
                            <%=sch.getRouteID()%>
                        </td>
                        <td>
                            <%=sch.getRoute()%>
                        </td>
                        
                        <td class="td-del" style="background-color: black;">
                            <button type="submit" value="<%=sch.getRoute()%>" name="routeValue" class="del del<%=sch.getRoute()%>">
                                <svg class="del-svg del-svg<%=sch.getRoute()%>" viewBox="0 0 17 17" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="si-glyph si-glyph-delete"><title>Delete</title><defs></defs><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><path d="M12.566,8 L15.611,4.956 C16.031,4.535 16.031,3.853 15.611,3.434 L12.566,0.389 C12.146,-0.031 11.464,-0.031 11.043,0.389 L7.999,3.433 L4.955,0.389 C4.534,-0.031 3.852,-0.031 3.432,0.389 L0.388,3.434 C-0.034,3.854 -0.034,4.536 0.387,4.956 L3.431,8 L0.387,11.044 C-0.034,11.465 -0.034,12.147 0.388,12.567 L3.432,15.611 C3.852,16.032 4.534,16.032 4.955,15.611 L7.999,12.567 L11.043,15.611 C11.464,16.032 12.146,16.032 12.566,15.611 L15.611,12.567 C16.031,12.146 16.031,11.464 15.611,11.044 L12.566,8 L12.566,8 Z" fill="red" class="si-glyph-fill"></path></g></svg>
                            </button>
                        </td>
                    </tr>
                    <%}%>
                    </table>
                </form>

<!--                    <table class="del-tab">
                        <tr><th class="del"></th></tr>
                        
                            
                            <tr>
                                <td class="del">
                                    <svg class="del-svg" viewBox="0 0 17 17" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="si-glyph si-glyph-delete"><title>Delete</title><defs></defs><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><path d="M12.566,8 L15.611,4.956 C16.031,4.535 16.031,3.853 15.611,3.434 L12.566,0.389 C12.146,-0.031 11.464,-0.031 11.043,0.389 L7.999,3.433 L4.955,0.389 C4.534,-0.031 3.852,-0.031 3.432,0.389 L0.388,3.434 C-0.034,3.854 -0.034,4.536 0.387,4.956 L3.431,8 L0.387,11.044 C-0.034,11.465 -0.034,12.147 0.388,12.567 L3.432,15.611 C3.852,16.032 4.534,16.032 4.955,15.611 L7.999,12.567 L11.043,15.611 C11.464,16.032 12.146,16.032 12.566,15.611 L15.611,12.567 C16.031,12.146 16.031,11.464 15.611,11.044 L12.566,8 L12.566,8 Z" fill="red" class="si-glyph-fill"></path></g></svg>
                                </td>
                            </tr>
                            <tr>
                                <td class="del">
                                    <svg class="del-svg" viewBox="0 0 17 17" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="si-glyph si-glyph-delete"><title>Delete</title><defs></defs><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><path d="M12.566,8 L15.611,4.956 C16.031,4.535 16.031,3.853 15.611,3.434 L12.566,0.389 C12.146,-0.031 11.464,-0.031 11.043,0.389 L7.999,3.433 L4.955,0.389 C4.534,-0.031 3.852,-0.031 3.432,0.389 L0.388,3.434 C-0.034,3.854 -0.034,4.536 0.387,4.956 L3.431,8 L0.387,11.044 C-0.034,11.465 -0.034,12.147 0.388,12.567 L3.432,15.611 C3.852,16.032 4.534,16.032 4.955,15.611 L7.999,12.567 L11.043,15.611 C11.464,16.032 12.146,16.032 12.566,15.611 L15.611,12.567 C16.031,12.146 16.031,11.464 15.611,11.044 L12.566,8 L12.566,8 Z" fill="red" class="si-glyph-fill"></path></g></svg>
                                </td>
                            </tr>
                            <tr>
                                <td class="del">
                                    <svg class="del-svg" viewBox="0 0 17 17" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="si-glyph si-glyph-red si-glyph-delete"><title>Delete</title><defs></defs><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><path d="M12.566,8 L15.611,4.956 C16.031,4.535 16.031,3.853 15.611,3.434 L12.566,0.389 C12.146,-0.031 11.464,-0.031 11.043,0.389 L7.999,3.433 L4.955,0.389 C4.534,-0.031 3.852,-0.031 3.432,0.389 L0.388,3.434 C-0.034,3.854 -0.034,4.536 0.387,4.956 L3.431,8 L0.387,11.044 C-0.034,11.465 -0.034,12.147 0.388,12.567 L3.432,15.611 C3.852,16.032 4.534,16.032 4.955,15.611 L7.999,12.567 L11.043,15.611 C11.464,16.032 12.146,16.032 12.566,15.611 L15.611,12.567 C16.031,12.146 16.031,11.464 15.611,11.044 L12.566,8 L12.566,8 Z" fill="red" class="si-glyph-fill"></path></g></svg>
                                </td>
                            </tr>
                            <tr>
                                <td class="del">
                                    <svg class="del-svg" viewBox="0 0 17 17" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="si-glyph si-glyph-delete"><title>Delete</title><defs></defs><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><path d="M12.566,8 L15.611,4.956 C16.031,4.535 16.031,3.853 15.611,3.434 L12.566,0.389 C12.146,-0.031 11.464,-0.031 11.043,0.389 L7.999,3.433 L4.955,0.389 C4.534,-0.031 3.852,-0.031 3.432,0.389 L0.388,3.434 C-0.034,3.854 -0.034,4.536 0.387,4.956 L3.431,8 L0.387,11.044 C-0.034,11.465 -0.034,12.147 0.388,12.567 L3.432,15.611 C3.852,16.032 4.534,16.032 4.955,15.611 L7.999,12.567 L11.043,15.611 C11.464,16.032 12.146,16.032 12.566,15.611 L15.611,12.567 C16.031,12.146 16.031,11.464 15.611,11.044 L12.566,8 L12.566,8 Z" fill="red" class="si-glyph-fill"></path></g></svg>
                                </td>
                            </tr>
                </table>-->
<!--                    <tr>
                        
                        <td>HR01A9089</td><td>001</td><td>ABD</td><td>9980975789</td><td>Baddi-Kalka-Pinjore-Dhakoli</td><td>25-02-2019</td>
                    </tr>
                    <tr>
                        <td>HR01A9089</td><td>001</td><td>ABD</td><td>9980975789</td><td>Baddi-Kalka-Pinjore-Dhakoli</td><td>25-02-2019</td>
                    </tr>
                    <tr>
                        <td>HR01A9089</td><td>001</td><td>ABD</td><td>9980975789</td><td>Baddi-Kalka-Pinjore-Dhakoli</td><td>25-02-2019</td>
                    </tr>
                    <tr>
                        <td>HR01A9089</td><td>001</td><td>ABD</td><td>9980975789</td><td>Baddi-Kalka-Pinjore-Dhakoli</td><td>25-02-2019</td>
                    </tr>-->
                
                <div class="sub-col">
                    <%
                    for(User u:uL)
                    {
                        if(u.getEmail().equals(use))
                        {
                            if(u.getType().equals("admin")){%>
                <button type="button" class="btn-sch bt-edit" onclick=window.location.href='edit_route.jsp'>Edit Routes</button>
                <%}
                        }
                    }
                %>
                <%
                    for(User u:uL)
                    {
                        if(u.getEmail().equals(use))
                        {
                            if(u.getType().equals("admin")){%>
                <button type="button" class="btn-home" onclick=window.location.href='page2(admin).html'><svg viewBox="0 0 17 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="si-glyph si-glyph-house"><title>Home</title><defs></defs><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g transform="translate(1.000000, 1.000000)" fill="#434343"><path d="M15.794,7.77 L11.984,3.864 L11.9839997,1.01706251 L11.0159997,1.03906251 L11.016,2.767 L8.502,0.245 C8.224,-0.031 7.776,-0.031 7.499,0.245 L0.206,7.771 C-0.069,8.048 -0.068,8.498 0.206,8.773 C0.482,9.049 0.933,9.049 1.209,8.772 L8,1.982 L14.793,8.772 C14.931,8.91 15.111,8.98 15.293,8.98 C15.474,8.98 15.654,8.912 15.794,8.773 C16.068,8.496 16.068,8.045 15.794,7.77 L15.794,7.77 Z" class="si-glyph-fill"></path><path d="M3.043,8.532 L3.043,14.222 C3.043,14.616 3.26102394,15.0078125 3.61002394,15.0078125 L5.88702394,15.0078125 L5.95099996,11.0147705 L10.0249632,11.0147705 L10.0230128,15.0078125 L12.3260496,15.0078125 C12.6750496,15.0078125 12.958,14.617 12.958,14.222 L12.958,8.531 L8,3.625 L3.043,8.532 L3.043,8.532 Z" class="si-glyph-fill"></path></g></g></svg>
                </button>
                <%}
                        
                    else if(u.getType().equals("staff"))
                    {%>
                    <button type="button" class="btn-home" onclick=window.location.href='page2-staff.html'><svg viewBox="0 0 17 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="si-glyph si-glyph-house"><title>Home</title><defs></defs><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g transform="translate(1.000000, 1.000000)" fill="#434343"><path d="M15.794,7.77 L11.984,3.864 L11.9839997,1.01706251 L11.0159997,1.03906251 L11.016,2.767 L8.502,0.245 C8.224,-0.031 7.776,-0.031 7.499,0.245 L0.206,7.771 C-0.069,8.048 -0.068,8.498 0.206,8.773 C0.482,9.049 0.933,9.049 1.209,8.772 L8,1.982 L14.793,8.772 C14.931,8.91 15.111,8.98 15.293,8.98 C15.474,8.98 15.654,8.912 15.794,8.773 C16.068,8.496 16.068,8.045 15.794,7.77 L15.794,7.77 Z" class="si-glyph-fill"></path><path d="M3.043,8.532 L3.043,14.222 C3.043,14.616 3.26102394,15.0078125 3.61002394,15.0078125 L5.88702394,15.0078125 L5.95099996,11.0147705 L10.0249632,11.0147705 L10.0230128,15.0078125 L12.3260496,15.0078125 C12.6750496,15.0078125 12.958,14.617 12.958,14.222 L12.958,8.531 L8,3.625 L3.043,8.532 L3.043,8.532 Z" class="si-glyph-fill"></path></g></g></svg>
                </button>
                    <%}
                    else{%>
                    <button type="button" class="btn-home" onclick=window.location.href='page2(stu).html'><svg viewBox="0 0 17 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="si-glyph si-glyph-house"><title>Home</title><defs></defs><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g transform="translate(1.000000, 1.000000)" fill="#434343"><path d="M15.794,7.77 L11.984,3.864 L11.9839997,1.01706251 L11.0159997,1.03906251 L11.016,2.767 L8.502,0.245 C8.224,-0.031 7.776,-0.031 7.499,0.245 L0.206,7.771 C-0.069,8.048 -0.068,8.498 0.206,8.773 C0.482,9.049 0.933,9.049 1.209,8.772 L8,1.982 L14.793,8.772 C14.931,8.91 15.111,8.98 15.293,8.98 C15.474,8.98 15.654,8.912 15.794,8.773 C16.068,8.496 16.068,8.045 15.794,7.77 L15.794,7.77 Z" class="si-glyph-fill"></path><path d="M3.043,8.532 L3.043,14.222 C3.043,14.616 3.26102394,15.0078125 3.61002394,15.0078125 L5.88702394,15.0078125 L5.95099996,11.0147705 L10.0249632,11.0147705 L10.0230128,15.0078125 L12.3260496,15.0078125 C12.6750496,15.0078125 12.958,14.617 12.958,14.222 L12.958,8.531 L8,3.625 L3.043,8.532 L3.043,8.532 Z" class="si-glyph-fill"></path></g></g></svg>
                </button>
                    <%}
                      }
                    }
                %>
                <%
                    for(User u:uL)
                    {
                        if(u.getEmail().equals(use))
                        {
                            if(u.getType().equals("admin")){%>
                <button type="button" class="btn-sch bt-del" id="bt-del">Delete Route</button>
                <%}
                        }
                    }
                %>
                </div>
            </div>
        </div>
        <div class="footer">
            Copyright © Chitkara University 2019
        </div>
        <script>
            <%String str="";%>
            <%for(Route b:list){
                
            %>
            var count=0;
            $(".del<%=b.getRoute()%>").mouseover(function(){
                $(".del<%=b.getRoute()%>").css('background-color','white');
                $(".del<%=b.getRoute()%>").css('border','white');
                $(".del-svg<%=b.getRoute()%> .si-glyph-fill").css('fill','black');
            });
            $(".del<%=b.getRoute()%>").mouseout(function(){
                $(".del<%=b.getRoute()%>").css('background-color','black');
                $(".del<%=b.getRoute()%>").css('border','black');
                $(".del-svg<%=b.getRoute()%> .si-glyph-fill").css('fill','red');
            });
            <%}%>
            $("#bt-del").click(function(){
                if(count==0)
                {
                    $(".sch tr td:last-child").css('display','inline');
                    count=1;
                }
                else if(count==1)
                {
                    count=0;
                    $(".sch tr td:last-child").css('display','none');
                }
            });
        </script>
    </body>
<html>