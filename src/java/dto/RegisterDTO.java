package dto;

/**
 *
 * @author rajes
 */
public class RegisterDTO 
{
    private String username,password,salary,city,id;

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) 
    {
        this.salary = salary;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }
}
