
/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 25/03/2021
*/

public enum InvoiceStatus /** inisiasi enum */
{
    OnGoing("On Going"), 
    Finished("Finished"), 
    Cancelled("Cancelled");
    private String status;
    InvoiceStatus(String status){
        this.status = status;
    }
    public String toString(){
        return status;
    }
}


