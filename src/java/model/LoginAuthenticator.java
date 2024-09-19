package model;

import db.DBConnector;
import dto.LoginDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rajes
 */
public class LoginAuthenticator 
{
    public boolean isLogin(LoginDTO user)
    {
        String username = user.getUsername();
        String password = user.getPassword();
        
        if(username!=null && password!=null && !username.trim().equals(""))
        {
            Statement st = DBConnector.getStatement();
            try
            {
                String query = "SELECT emppassword FROM emp where empname='"+username+"'";
                System.out.println(query);
            
                ResultSet rs = st.executeQuery(query);
                if(rs.next())
                {
                    String tablePassword= rs.getString(1);
                    return password.equals(tablePassword);
                }
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
        return false;
    }
}
