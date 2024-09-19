<%-- 
    Document   : home
    Created on : 19 Sep, 2024, 4:41:17 PM
    Author     : rajes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <a href="logout.jsp">Sign Out</a>
        <%
            String username = (String)session.getAttribute("username");
            if(username==null || username.trim().equals(""))
            {
                response.sendRedirect("login.html");
            }
        %>
        <h1>Hello <%=username%>!</h1>
        <h2>Login Successful</h2>
    </body>
</html>
