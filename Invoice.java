
/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 25/03/2021
*/

abstract class Invoice /** inisiasi class*/
{
    private int id; //ini untuk inisiasi variabel id dari invoice
    private Job job; //ini untuk inisiasi variabel idJob dari invoice
    private String date; //ini untuk inisiasi variabel date dari invoice
    protected int totalFee; //ini untuk inisiasi variabel totalFee dari invoice
    private Jobseeker jobseeker; //ini untuk inisiasi variabel jobseeker dari invoice
    private InvoiceStatus invoiceStatus;
    

    /**
     * Constructor untuk object invoice
     * @param id id pada invoice
     * @param idJob nama pada invoice
     * @param date date dari invoice
     * @param totalFee totalFee dari invoice
     * @param jobseeker jobseeker dari invoice
     */
    public Invoice(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        this.job = job;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * getter id dari invoice
     * @return dari id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * getter idJob dari invoice
     * @return dari idJob
     */
    public Job getJob()
    {
        return job;
    }
    
    /**
     * getter date dari invoice
     * @return dari date
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * getter totalFee dari invoice
     * @return dari totalFee
     */
    public int getTotalFee()
    {
        return totalFee;
    }
    
    /**
     * getter jobseeker dari invoice
     * @return dari jobseeker
     */
    public Jobseeker getJobseeker()
    {
        return jobseeker;
    }
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }
    
    /**
     * setter id dari invoice
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * setter idjob dari invoice
     * @param idjob
     */
    public void setJobs(Job job)
    {
        this.job = job;
    }
    
    /**
     * setter date dari invoice
     * @param date
     */
    public void setDate(String date)
    {
        this.date = date;
    }
    
    /**
     * setter totalFee dari invoice
     * @param totalFee
     */
    public abstract void setTotalFee();
    
    /**
     * setter jobseeker dari invoice
     * @param jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker = jobseeker;
    }
    
    public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }
    
    /**
     * printData ini fungsi nya untuk nge print data pada invoice yang dipanggil pada JWork
     */
    public void printData()
    {
     System.out.println("\n===Invoice===\n"+
        "ID            =  "+id +"\n"+
        "ID ob         =  "+job +"\n"+
        "Tanggal       =  "+date+"\n"+
        "Fee total     =  "+totalFee+"\n"+
        "Seeker        =  "+jobseeker.getName()+"\n"+
        "Status        =  "+getInvoiceStatus()
        );
    }
}
