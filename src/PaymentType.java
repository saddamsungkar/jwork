
/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 25/03/2021
*/

public enum PaymentType 
{
    BankPayment("Bank Payment"), 
    EwalletPayment("E-Wallet Payment");
    private String type;
    PaymentType(String type){
    this.type = type;
    }
      public String toString(){
        return type;
    }
}
