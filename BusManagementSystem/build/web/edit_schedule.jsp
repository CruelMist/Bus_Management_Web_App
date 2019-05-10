<%@page import="Model.Schedule"%>
<%@page import="Model.ScheduleDAO"%>
<%@page import="Model.Route"%>
<%@page import="Model.RouteDAO"%>
<%@page import="Model.RouteDAO"%>
<%@page import="Model.Driver"%>
<%@page import="java.util.List"%>
<%@page import="Model.DriverDAO"%>
<%@page import="Model.Bus"%>
<%@page import="Model.BusDAO"%>
<!DOCTYPE html>
<% 
    BusDAO busAccess=new BusDAO();
    List <Bus> blist=busAccess.getBus();
    DriverDAO driveAccess=new DriverDAO();
    List <Driver> dlist=driveAccess.getDriver();
    RouteDAO routeAccess=new RouteDAO();
    List <Route> rlist=routeAccess.getRoute();
    ScheduleDAO schAccess=new ScheduleDAO();
    List <Schedule> slist=schAccess.getSch();
    int flag=99;
    int countb=0,countr=0,countd=0;
%>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- <link rel="stylesheet" href="bootstrap/css/bootstrap.css"> -->
        <script src="jquery-3.3.1.js"></script>
        <!-- <script type="text/javascript" src="iconwc.js"></script> -->
        <link rel="stylesheet" href="animate.css">
        <!-- <link rel="stylesheet" href="styles1.css"> -->
        <style media="screen">
            body{
                margin:0;
                font-family: Arial, Helvetica, sans-serif;
                background: rgb(170, 24, 24);
            }
            .container
            {
                /* width:250vh; */
                height:95vh;
                display: flex;
                flex-wrap: wrap;
                justify-content: center;
                align-items: center;
                background-size: cover;
                overflow-x: hidden;
                /* display:none; */
            }
            form
            {
                width:100%;
                display:"flex";
                flex-wrap: "wrap";
                flex-direction: column;
                align-items: center;
                justify-content: center;
                padding:10px;
                color:white;
            }
            button{
                width:50%;
                padding:10px;
                display: block;
                border: none;
                border-radius: 5%;
                color:white;
                margin: 15% auto 10% auto;
                background-color: rgb(170, 33, 33);
            }
            
            button:hover
            {
                background-color: rgb(216, 8, 8);
            }
            .footer
            {
                bottom:0px;
                display: flex;
                align-items: center;
                justify-content: center;
                font-size: 2.8vh;
                font-family: Arial, Helvetica, sans-serif;
                position: absolute;
                height:5%;
                width:100%;
                color: white;
                background-color: black;
            }
            .header
            {
                top:0px;
                position: absolute;
                height:5%;
                width:100%;
                background-color: black;
            }
            .form-box
            {
                width:20%;
                /* height:50%; */
                display:flex;
                flex-wrap: wrap;
                flex-direction: column;
                align-items: center;
                background-color: black;
                padding:10px;
                border-radius: 4%;
            }
            .bus,.driver,.route,.date{
                display: block;
                width:70%;
                padding:10px;
                display: block;
                background-color:rgb(177, 170, 170);
                border: none;
                border-radius: 4%;
            }
            a{
                text-decoration:none;
                color:white;
            }
            .control{
                margin:1%;
                
            }
        </style>
    </head>
    <body>
        <div class="header">
            <!-- <img class="logo" src="cu_logo3.png"> -->
        </div>
        <div class="container">
            <div class="form-box">
                <button type="button" class="control"><a href="schedule.jsp">Back</a></button>
                <form name="edit_schedule" action="AddSchedule" method="POST">
                    <p>Select Bus:</p>
                    <select name="bus" class="bus" required>
                        <%for(Bus b:blist)
                        {
                            
                            for(Schedule s:slist)
                            {
                                if(b.getBusLisance().equals(s.getBusLisance())){
                                    
                                    flag=0;
                                    
                                    break;}
                                else{
                                    
                                    flag=1;}
                            }
                        if(flag==1)
                        {
                            countb=1;
                            flag=0;
                        %>
                        <option value="<%=b.getBusLisance()%>"><%=b.getBusLisance()%></option>
                        <%}
                            else
                            continue;
                        }
                        %>
                        
                    </select>
                    <p>Select Driver:</p>
                    
                    <select name="driver" class="driver" required>
                        <%for(Driver d:dlist)
                        {
                            
                            for(Schedule s:slist)
                            {
                                if(d.getName().equals(s.getDriverName())){
                                    flag=0;
                                    
                                    break;}
                                else{
                                    flag=1;}
                            }
                        if(flag==1)
                        {
                            countd=1;
                            flag=0;
                        %>
                        <option value="<%=d.getName()%>"><%=d.getName()%></option>
                        <%}
                            else
                            continue;
                        }
                        %>
                        
                    </select>
                    <p>Select Route:</p>
                    
                    <select name="route" class="route" required>
                        <%for(Route r:rlist)
                        {
                            
                            for(Schedule s:slist)
                            {
                                if(r.getRoute().equals(s.getRoute())){
                                    flag=0;
                                    
                                    break;}
                                else{
                                    
                                    flag=1;}
                            }
                        if(flag==1)
                        {
                            countr=1;
                            flag=0;%>
                        <option value="<%=r.getRoute()%>"><%=r.getRoute()%></option>
                        <%}
                            else
                            continue;
                        }
                        %>
                        
                    </select>
                    <p>Select Date:<%=countb%> <%=countd%> <%=countr%></p><input class="date" name="date" type="date" required>
                    
                    
                    <%if(countb>0&&countr>0&&countd>0)
                    {
                        countb=0;
                        countr=0;
                        countd=0;
                    %>
                        
                        <button type="submit"><a href="schedule.jsp">Submit</a></button>
                    <%   }
                    else{
                        countb=0;
                        countr=0;
                        countd=0;
                    }%>
                        
                    
                    
                    
                </form>
            </div>
        </div>
        <div class="footer">
            Copyright © Chitkara University 2019
        </div>
        <script>
            function validateForm() {
            var x = document.forms["myForm"]["bus"].value;
            if (x == "") {
            alert("Name must be filled out");
            return false;
            }
            var y=document.forms["myForm"]["bus"].value;
            if(x){}
            };
        </script>
    </body>
</html>