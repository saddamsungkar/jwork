/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 18/03/2021
*/

public enum PaymentType {
    BankPayment {
        @Override
        public String toString(){
            return "Bank Payment";
        }
    },
    EwalletPayment {
        @Override
        public String toString(){
            return "E-wallet Payment";
        }
    };
    public static void main(String[] args){
        PaymentType p1 = PaymentType.BankPayment;
        System.out.println(p1);
        PaymentType p2 = PaymentType.EwalletPayment;
        System.out.println(p2);
    }
}
