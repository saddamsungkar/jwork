/**
 * @author : Muhammad Saddam
 * @version : Modul2 - 18/03/2021
*/

public class JWork
{
    /**
       * fungsi main
       * membuat objek dari class yang ada
       * memanggil method method yang ada menggunakan objek yang telah dibuat
    */
    public static void main(String[] args){
        
        Location loc1 = new Location("Jawa Barat","Depok","Pesona Khayangan");
        Recruiter recr1= new Recruiter(1,"Mas","saddamsungkar@Gmail.com","0811602020",loc1);
        Job job1 = new Job(1,"Wiraswasta",recr1,2000,"Heavyweight");
        Jobseeker jobsek1 = new Jobseeker(1,"Rafly","raflyganteng@gmail.com","oke","20-12-2019");
        Invoice inv1 = new Invoice(1,1,"20-03-2021",2000,jobsek1);
        
        recr1.getName();
        recr1.setName("GC");
        recr1.getName();
        job1.printData();
        recr1.printData();
    }
}
