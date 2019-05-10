<%-- 
    Document   : feedback
    Created on : Apr 4, 2019, 9:18:03 AM
    Author     : My Pc
--%>

<%-- 
    Document   : edit_bus
    Created on : Mar 31, 2019, 4:58:54 PM
    Author     : My Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            .ta{
                color:black;
            }
        </style>
    </head>
    <body>
        <div class="header">
            <!-- <img class="logo" src="cu_logo3.png"> -->
        </div>
        <div class="container">
            <div class="form-box">
                <button type="button" class="control"><a href="page2(stu).html">Back</a></button>
                <form name="edit_schedule" action="AddFeed" method="POST">
                    <p class="type">Topic:</p>
                    <input id="mail" name="topic" type="text" placeholder="Topic" required>
                    <p class="type">Comment:</p>
                    <textarea class="ta" rows="10" cols="30" name="detail" placeholder="Write Feedback Here (120 Characters)........" required></textarea>
                    
                    <button type="submit"><a href="page2(stu).html">Submit</a></button>
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
