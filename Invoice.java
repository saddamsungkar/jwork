/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 18/03/2021
*/

public class Invoice
{
    /**
    Deklarasi Variable 
    */
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;

    /**
     * constructor dari invoice
     * @param id dari invoice
     * @param idJob dari invoice
     * @param date dari invoice
     * @param totalfee dari invoice
     * @param jobseeker dari jobseeker
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker) { 
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;    
        this.jobseeker = jobseeker;
    }

    /**
    * getter id dari invoice
    * @return id dari invoice
    */
    public int getId(){
        return id;
    }
    
    /**
    * getter idjob dari invoice
    * @return idjob dari invoice
    */
    public int getIdJob(){
        return idJob;
    }
    
    /**
    * getter date dari invoice
    * @return date dari invoice
    */
    public String getDate(){
        return date;
    }
    
    /**
    * getter totalfee dari invoice
    * @return totalfee dari invoice
    */
    public int getTotalFee(){
        return totalFee;
    }

    /**
    * getter jobseeker dari jobseeker
    * @return jobseeker dari jobseeker
    */
    public Jobseeker getJobseeker() { 
        return jobseeker; 
    }

    /**
    * setter totalfee dari invoice
    * @param totalfee dari invoice
    */
    public void setJobseeker(Jobseeker jobseeker) { 
        this.jobseeker = jobseeker; 
    }

    /**
    * setter id dari invoice
    * @param id dari invoice
    */
    public void setId(int id){ 
        this.id = id; 
    }
    
    /**
    * setter idjobs dari invoice
    * @param idjobs dari invoice
    */
    public void setIdJobs(int idJobs){ 
        this.idJob = idJobs; 
    }
    
    /**
    * setter date dari invoice
    * @param date dari invoice
    */
    public void setDate(String date){ 
        this.date = date; 
    }
    
    /**
    * setter totalfee dari invoice
    * @param totalfee dari invoice
    */
    public void setTotalFee(int totalFee){ 
        this.totalFee = totalFee; 
    }

    /**
    * Mencetak data untuk saat ini parameternya belum ditentukan
    */
    public void printData() {
        System.out.println("Jumlah Harga :" + totalFee);
    }

}