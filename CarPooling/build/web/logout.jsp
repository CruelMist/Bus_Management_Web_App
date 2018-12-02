<%-- 
    Document   : logout
    Created on : Nov 25, 2018, 8:03:57 PM
    Author     : My Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
session.invalidate();
response.sendRedirect("index.jsp");
%>
