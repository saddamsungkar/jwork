
/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 25/03/2021
*/

public class Recruiter 
{
    private int id; 
    private String name; 
    private String email; 
    private String phoneNumber;
    private Location location;
    
    /**
     * Constructor untuk object recruiter
     * @param id id pada recruiter
     * @param name nama pada recruiter
     * @param email email dari recruiter
     * @param phoneNumber nomer hp dari recruiter
     * @param location lokasi dari recruiter
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
        
    }

    /**
     * getter id dari recruiter
     * @return dari id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * getter name dari recruiter
     * @return dari name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * getter email dari recruiter
     * @return dari email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * getter nomer hp dari recruiter
     * @return dari phoneNumber
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * getter lokasi dari recruiter
     * @return dari Location
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * setter id dari recruiter
     * @param id
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * setter name dari recruiter
     * @param name
     */
     public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * setter email dari recruiter
     * @param email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * setter phoneNumber dari recruiter
     * @param phonenumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * setter location dari recruiter
     * @param location
     */
    public void setLocation(Location location)
    {
        this.location = location;
    }
    
    /**
     * printData ini fungsi nya untuk nge print data pada recruiter yang dipanggil pada JWork
     */
       public void printData()
    {
         System.out.println("\n===Recruiter===\n"+
        "ID         =  "+id +"\n"+
        "Nama       =  "+name +"\n"+
        "Email      =  "+email+"\n"+
        "Nomor HP   =  "+phoneNumber+"\n"+
        "Kota       =  "+location.getCity()
        );
    }
}
