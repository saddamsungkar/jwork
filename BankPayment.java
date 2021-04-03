
/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 25/03/2021
*/

public class BankPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public BankPayment(
    int id, 
    Job job, 
    String date, 
    Jobseeker jobseeker, 
    InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
    }
    public BankPayment(
    int id, 
    Job job, 
    String date, 
    Jobseeker jobseeker,
    int adminFee,
    InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
        this.adminFee = adminFee;
    }
    
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public int getAdminFee()
    {
        return adminFee;
    }
    
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee;
    }
    
    @Override
    public void setTotalFee()
    {
        if (adminFee !=0){ 
            super.totalFee = super.getJob().getFee() - adminFee;
        } else {
            super.totalFee = super.getJob().getFee();
        }
    }
    
    @Override
    public void printData()
    {
        System.out.println("\n===Invoice===\n");
        System.out.println("ID        =  "+super.getId());
        System.out.println("Job       =  "+super.getJob().getCategory());
        System.out.println("Date      =  "+super.getDate());
        System.out.println("Seeker    =  "+super.getJobseeker().getName());
        System.out.println("Admin Fee =  "+getAdminFee());
        setTotalFee();
        System.out.println("Total Fee : " + super.totalFee);
        System.out.println("\n Status =  " + super.getInvoiceStatus().toString());
        System.out.println("\n Payment Type =  " + PAYMENT_TYPE.toString());
    }
}
    
    
    
    
    
      

