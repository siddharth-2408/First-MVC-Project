package controller;

import dto.RegisterDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RegisterAuthenticator;

/**
 *
 * @author rajes
 */
public class RegisterChecker extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("register.html");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String password = request.getParameter("password");
        String confirm = request.getParameter("confirmpassword");
        String username = request.getParameter("username");
        String salary = request.getParameter("salary");
        String city = request.getParameter("city");
        String id = request.getParameter("id");

        if(username.equals("")&&password.equals("")&&salary.equals("")&&city.equals("")&&id.equals(""))
        {
            response.sendRedirect("register2.html");
        }
        else if(password.equals(confirm))
        {
            
            
            RegisterDTO user = new RegisterDTO();
            user.setUsername(username);
            user.setPassword(password);
            user.setId(id);
            user.setCity(city);
            user.setSalary(salary);
            
            RegisterAuthenticator r1 = new RegisterAuthenticator();
            boolean register = r1.isRegister(user);
            
            if(register)
            {
                HttpSession session = request.getSession(true);
                session.setAttribute("username", username);
                response.sendRedirect("home.jsp");
            }
        }
        else
            response.sendRedirect("register2.html");
    } 
    
}
