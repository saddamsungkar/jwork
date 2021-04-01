
/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 25/03/2021
*/

public class EwalletPayment extends Invoice
{
    
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public EwalletPayment(
    int id, 
    Job job, 
    String date, 
    Jobseeker jobseeker, 
    InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
    }
    public EwalletPayment(
    int id, 
    Job job, 
    String date, 
    Jobseeker jobseeker,
    Bonus bonus,
    InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
        this.bonus = bonus;
    }
    
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public Bonus getBonus()
    {
        return bonus;
    }
    
    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus;
    }
    
    @Override
    public void setTotalFee()
    {
        if (bonus !=null && bonus.getActive() && super.getJob().getFee() > bonus.getMinTotalFee()){
            super.totalFee = super.getJob().getFee() + bonus.getExtraFee();
        } else {
            super.totalFee = super.getJob().getFee();
        }
    }
    
    @Override
    public void printData()
    {
        System.out.println("\n===Invoice===\n");
        System.out.println("ID        =  "+super.getId());
        System.out.println("Job       =  "+super.getJob().getName());
        System.out.println("Date      =  "+super.getDate());
        System.out.println("Seeker   =  "+super.getJobseeker().getName());
        setTotalFee();
        System.out.println("Fee : " + super.totalFee);
        if (bonus != null && bonus.getActive() && super.totalFee > bonus.getMinTotalFee()){
            System.out.println("Referral Code = " + bonus.getReferralCode());
        }
        System.out.println("\n Status =  " + super.getInvoiceStatus().toString());
        System.out.println("\n Payment Type =  " + PAYMENT_TYPE.toString());
    }
}
    
    
    
    
    
      

