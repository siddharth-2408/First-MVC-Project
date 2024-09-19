/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.RegisterDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rajes
 */
public class RegisterAuthenticator 
{
    public boolean isRegister(RegisterDTO user)
    {
        if(user.getUsername()!=null && user.getPassword()!=null && !user.getUsername().trim().equals(""))
        {
            Connection con = DBConnector.getConnection();
            PreparedStatement pst = null;
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Driver Loaded");
            
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdatabase","root","root");
                System.out.println("Connected");
            
                pst = con.prepareStatement("INSERT INTO emp VALUES(?,?,?,?,?)");
            
                pst.setInt(1, Integer.parseInt(user.getId()));
                pst.setString(2, user.getUsername());
                pst.setInt(3, Integer.parseInt(user.getSalary()));
                pst.setString(4, user.getCity());
                pst.setString(5, user.getPassword());

                int i = pst.executeUpdate();

                if(i>0)
                {
                    return true;
                }
            }
            catch(ClassNotFoundException | SQLException e)
            {
                System.out.println(e);
            }
        }
        return false;
    }
}
