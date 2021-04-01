
/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 25/03/2021
*/

public class Job 
{
    private int id; 
    private String name; 
    private int fee; 
    private JobCategory category; 
    private Recruiter recruiter; 
 
    /**
     * Constructor untuk object job
     * @param id id pada job
     * @param name nama pada job
     * @param fee fee dari job
     * @param category kategori dari job
     * @param recruiter recruiter dari job
     */
    public Job(int id, String name, int fee, JobCategory category, Recruiter recruiter)
    {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.category = category;
        this.recruiter = recruiter;
    }

    /**
     * getter id dari job
     * @return dari id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * getter name dari job
     * @return dari name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * getter fee dari job
     * @return dari fee
     */
    public int getFee()
    {
        return fee;
    }
    
    /**
     * getter category dari job
     * @return dari category
     */
    public JobCategory getCategory()
    {
        return category;
    }
    
    /**
     * getter recruiter dari job
     * @return dari recruiter
     */
    public Recruiter getRecruiter()
    {
        return recruiter;
    }
    
    /**
     * setter id dari job
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * setter name dari job
     * @param id
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * setter fee dari job
     * @param fee
     */
    public void setFee(int fee)
    {
        this.fee = fee;
    }
    
    /**
     * setter category dari job
     * @param category
     */
    public void setCategory(JobCategory category)
    {
        this.category = category;
    }
    
    /**
     * setter recruiter dari job
     * @param recruiter
     */
    public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter = recruiter;
    }
    
    /**
     * printData ini fungsi nya untuk nge print data pada job yang dipanggil pada JWork
     */
    public void printData()
    {
     System.out.println("\n=========Job=========\n"+
        "ID         =  "+id +"\n"+
        "Nama       =  "+name +"\n"+
        "Recruiter  =  "+recruiter.getName()+"\n"+
        "Kota       = "+recruiter.getLocation().getCity()+"\n"+
        "Fee total  =  "+fee+"\n"+
        "kategori   =  "+category
        );
    }
}
