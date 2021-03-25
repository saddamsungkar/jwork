/**
 * @author : Muhammad Saddam
 * @version : Modul2 - 18/03/2021
*/

public class Recruiter
{
    /**
    Deklarasi Variable 
    */
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    
    /**
     * constructor dari recruiter
     * @param id dari recruiter
     * @param nama dari recruiter
     * @param email dari recruiter
     * @param phoneNumberdari recruiter
     * @param lokasi dari location
     */

    public Recruiter(int id, String name, String email, String phoneNumber, Location location) { 
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
    * getter id dari recruiter
    * @return id dari recruiter
    */
    public int getId()
    {
        return id;
    }
    
    /**
    * getter name dari recruiter
    * @return name dari recruiter
    */
    public String getName()
    {
        return name;
    }

    /**
    * getter location dari recruiter
    * @return location dari recruiter
    */
    public Location getLocation(){ 
        return location; 
    }
    
    /**
    * getter email dari recruiter
    * @return email dari recruiter
    */
    public String getEmail() { 
        return email; 
    }
    
    /**
    * getter phonenumber dari recruiter
    * @return phonenumber dari recruiter
    */
    public String getPhoneNumber() { 
        return phoneNumber; 
    }

    /**
    * getter lokasi dari recruiter
    * @return location dari recruiter
    */
    public Location getlocation() { 
        return location; 
    }
    
    /**
    * setter id dari recruiter
    * @param id dari recruiter
    */
    public void setId(int id) { 
        this.id = id; 
    }
    
    /**
    * setter email dari recruiter
    * @param email dari recruiter
    */
    public void setEmail(String email) { 
        this.email = email; 
    }
    
    /**
    * setter nama dari recruiter
    * @param name dari recruiter
    */
    public void setName(String name) { 
        this.name = name; 
    }
    
    /**
    * setter phonenumber dari recruiter
    * @param phonenumber dari recruiter
    */
    public void setPhoneNumber(String phoneNumber) { 
        this.phoneNumber=phoneNumber; 
    }

    /**
    * setter lokasi dari recruiter
    * @param location dari recruiter
    */
    public void setLocation(Location location) { 
        this.location=location; 
    }

    /**
    * mencetak nama perekrut
    */
    public void printData() {
        System.out.println("Perekrut : "+ name);
    }
}