package dao;

import db.DBConnector;
import dto.RegisterDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author rajes
 */
public class UserDetails 
{
    public RegisterDTO getUserDetail(String username)
    {
        RegisterDTO user = new RegisterDTO();
        try
        {
            Statement st = DBConnector.getStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM emp");
            if(rs.next())
            {
                user.setId(rs.getString(1));
                user.setUsername(rs.getString(2));
                user.setSalary(rs.getString(3));
                user.setCity(rs.getString(4));
                user.setPassword(rs.getString(5));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return user;
    }
    public ArrayList<RegisterDTO> getAllUserDetails()
    {
        ArrayList<RegisterDTO> l1 = new ArrayList<RegisterDTO>();
        try
        {
            Statement st = DBConnector.getStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM emp");
            while(rs.next())
            {
                RegisterDTO user = new RegisterDTO();
                user.setId(rs.getString(1));
                user.setUsername(rs.getString(2));
                user.setSalary(rs.getString(3));
                user.setCity(rs.getString(4));
                user.setPassword(rs.getString(5));
                l1.add(user);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return l1;
    }
}
