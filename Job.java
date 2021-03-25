/**
 * @author : Muhammad Saddam
 * @version : Modul2 - 18/03/2021
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

    /**
     * constructor dari job
     * @param id dari job
     * @param nama dari job
     * @param perekrut dari recruiter
     * @param fee dari job
     * @param categori dari job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, String category) {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }

    /**
    * getter id dari jobseeker
    * @return id dari jobseeker
    */
    public int getId()
    {
        return id;
    }
    
    /**
    * getter name dari jobseeker
    * @return name dari jobseeker
    */
    public String getName()
    {
        return name;
    }
    
    /**
    * getter fee dari jobseeker
    * @return fee dari jobseeker
    */
    public int getFee()
    {
        return fee;
    }
    
    /**
    * getter categori dari jobseeker
    * @return category dari jobseeker
    */
    public String getCategory()
    {
        return category;
    }

    /**
    * getter perekrut dari recruiter
    * @return recruiter dari recruiter
    */
    public Recruiter getRecruiter() { 
        return recruiter; 
    }

    /**
    * setter rekruiter dari recruiter
    * @param rekruiter dari rekruiter
    */
    public void setRecruiter(Recruiter recruiter) { 
        this.recruiter = recruiter; 
    }
    
    /**
    * setter id dari invoice
    * @param id dari invoice
    */    
    public void setId(int id) { 
        this.id = id; 
    }
    
    /**
    * setter name dari invoice
    * @param name dari invoice
    */
    public void setName(String name) { 
        this.name = name; 
    }
    
    /**
    * setter fee dari invoice
    * @param fee dari invoice
    */
    public void setFee(int fee) { 
        this.fee = fee; 
    }
    
    /**
    * setter categori dari invoice
    * @param category dari invoice
    */
    public void setCategory(String category) { 
        this.category = category; 
    }
    
    /**
    * Mencetak data akan tetapi parameternya belum ditentukan
    */
    public void printData() {
        System.out.println("Nama Job : " + name);
    }
}
