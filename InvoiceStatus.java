/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 18/03/2021
*/

public enum InvoiceStatus {
    Ongoing {
        @Override
        public String toString(){
            return "Ongoing";
        }
    }, Finished {
        @Override
        public String toString(){
            return "Finished";
        }
    }, Cancelled{
        @Override
        public String toString(){
            return "Cancelled";
        }
    };
   public static void main(String[] args){
        InvoiceStatus i1 = InvoiceStatus.Ongoing;
        System.out.println(i1);
        InvoiceStatus i2 = InvoiceStatus.Finished;
        System.out.println(i2);
        InvoiceStatus i3 = InvoiceStatus.Cancelled;
        System.out.println(i3);
        //InvoiceStatus i4 = InvoiceStatus.aman;
        //System.out.println(i4);akan eror apabila diuncoment
        //ini karena kita tidak dapat mengakses enum selain yang kita tulis
    }
    
}
