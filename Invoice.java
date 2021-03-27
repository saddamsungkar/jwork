/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 18/03/2021
*/
public class Invoice
{
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
    private PaymentType paymentType;
    private InvoiceStatus status;

    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status) { 
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;    
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
    }

    public int getId(){
        return id;
    }

    public int getIdJob(){
        return idJob;
    }
    
    public String getDate(){
        return date;
    }
    

    public int getTotalFee(){
        return totalFee;
    }

    public Jobseeker getJobseeker() { 
        return jobseeker; 
    }

    public PaymentType getPaymentType() { 
        return paymentType; 
    }

    public InvoiceStatus getInvoiceStatus() { 
        return status; 
    }

    public void setJobseeker(Jobseeker jobseeker) { 
        this.jobseeker = jobseeker; 
    }

    public void setInvoiceStatus(InvoiceStatus status) { 
        this.status = status; 
    }

    public void setId(int id){ 
        this.id = id; 
    }

    public void setIdJobs(int idJobs){ 
        this.idJob = idJobs; 
    }

    public void setDate(String date){ 
        this.date = date; 
    }

    public void setTotalFee(int totalFee){ 
        this.totalFee = totalFee; 
    }

    public void printData() {
        System.out.println("==================Invoice==================");
        System.out.println("ID : " + id);
        System.out.println("ID Job : " + idJob);
        System.out.println("Tanggal Invoice : " + date);
        System.out.println("Pencari Kerja : " + jobseeker);
        System.out.println("Banyaknya Fee : " + totalFee);
        System.out.println("Status : " + status);
    }
}