/**
 * Write a description of class Recruiter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recruiter
{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    
    public Location location;
    
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public int getId()
    {
        return this.id;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    public Location getLocation()
    {
        return this.location;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPhoneNumber(String phonenumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public void setLocation(Location location){}
    
    public void printData(){}
}