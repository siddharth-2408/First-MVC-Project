<%-- 
    Document   : UserDetailsJSP
    Created on : 21 Sep, 2024, 5:55:49 PM
    Author     : rajes
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.RegisterDTO"%>
<%@page import="dao.UserDetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All User Detail</title>
    </head>
    <body bgcolor = cyan>
        <a href="logout.jsp">Sign Out</a>
        <h1>Hello Admin!</h1>
        <h1>User Details are as Follows</h1>
        <%
            UserDetails ob1 = new UserDetails();
            ArrayList<RegisterDTO> l2 = ob1.getAllUserDetails();
            Iterator<RegisterDTO> i = l2.iterator();
            %>
            <table width='500'>
                <tr>
                    <td><strong>EmpID</strong></td>
                    <td><strong>EmpName</strong></td>
                    <td><strong>EmpSalary</strong></td>
                    <td><strong>EmpCity</strong></td>
                    <td><strong>EmpPassword</strong></td>
                </tr>

        <%
            while(i.hasNext())
            {
                RegisterDTO user = i.next();
                %>
                <tr>
                    <td><strong><%=user.getId()%></strong></td>
                    <td><strong><%=user.getUsername()%></strong></td>
                    <td><strong><%=user.getSalary()%></strong></td>
                    <td><strong><%=user.getCity()%></strong></td>
                    <td><strong><%=user.getPassword()%></strong></td>
                </tr>
        <%
            }
        %>
                    </table>
    </body>
</html>
