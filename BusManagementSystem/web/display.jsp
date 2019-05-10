<%-- 
    Document   : display
    Created on : Mar 26, 2019, 9:25:47 AM
    Author     : My Pc
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr><th>Name</th><th>Data</th></tr>
            <%
                List<Student> li=request.getAttribute("list");
                for(Student s:li)
                {
            %>
            <tr><td><%= s.getName()%></td><td><%=s.getID()%></td></tr>
            <% } %>
        </table>
    </body>
</html>
