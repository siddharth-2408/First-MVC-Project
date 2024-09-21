<%-- 
    Document   : logout
    Created on : 19 Sep, 2024, 4:55:10 PM
    Author     : rajes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("OpeningPage.html");
        %>
    </body>
</html>
