/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 25/03/2021
*/

public class Jobseeker
{
    private int id; //ini untuk inisiasi variabel id dari jobseeker
    private String name; //ini untuk inisiasi variabel nama seorang jobseeker
    private String email;//ini untuk inisiasi variabel email nya jobseeker
    private String password;//ini untuk inisiasi variabel password nya jobseeker
    private String joinDate;//ini untuk inisiasi variabel tanggal join nya dari seorang jobseeker
    

    /**
     * Constructor untuk objek JobSeeker
     * @param id id pada jobseeker
     * @param name nama pada jobseeker
     * @param email email dari jobseeker
     * @param password password dari jobseeker
     * @param joinDate tanggal join dari jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        this.id = id; 
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;

    }

    /**
     * getter id dari jobseeker
     * @return dari id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * getter name dari jobseeker
     * @return dari name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * getter email dari jobseeker
     * @return dari email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * getter password dari jobseeker
     * @return dari password
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * getter joinDate dari jobseeker
     * @return dari joinDate
     */
    public String getJoinDate()
    {
        return joinDate;
    }
    
    /**
     * setter id dari jobseeker
     * @param id
     */
    public void setID(int id) 
    {
        this.id = id;
    }
    
    /**
     * setter name dari jobseeker
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * setter email dari jobseeker
     * @param email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * setter password dari jobseeker
     * @param password
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    /**
     * setter joindate dari jobseeker
     * @param joinDate
     */
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }
    
    /**
     * printData ini fungsi nya untuk nge print data pada jobseeker yang dipanggil pada JWork
     */
    public void printData()
    {
        System.out.println("\n===JobSeeker===\n"+
        "ID         =  "+id +"\n"+
        "Nama       =  "+name +"\n"+
        "Email      =  "+email+"\n"+
        "Password   =  "+password+"\n"+
        "Join       =  "+joinDate
        );
    }
}
