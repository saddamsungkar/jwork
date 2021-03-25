/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 18/03/2021
*/

public class Job
{
    /**
    Deklarasi Variable 
    */
    private int id;
    private String name;
    private int fee;
    private String category;
    private Recruiter recruiter;

    public Job(int id, String name, Recruiter recruiter, int fee, String category) {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getFee()
    {
        return fee;
    }

    public String getCategory()
    {
        return category;
    }

    public Recruiter getRecruiter() { 
        return recruiter; 
    }

    public void setRecruiter(Recruiter recruiter) { 
        this.recruiter = recruiter; 
    }

    public void setId(int id) { 
        this.id = id; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }

    public void setFee(int fee) { 
        this.fee = fee; 
    }

    public void setCategory(String category) { 
        this.category = category; 
    }

    public void printData() {
        System.out.println("Nama Job : " + name);
        System.out.println("==========JOB==========");
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Recruiter:" + recruiter.getName());
        System.out.println("City"+ recruiter.getLocation().getCity());
        System.out.println("Fee:" + fee);
        System.out.println("Category:" + category);
    }

}
