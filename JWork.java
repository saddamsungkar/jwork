/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 18/03/2021
*/

public class JWork
{
    public static void main(String[] args){
        
        // Location loc1 = new Location("Jawa Barat ","Depok ","Pesona Khayangan");
        // Recruiter recr1= new Recruiter(1,"Saddam ","saddamsungkar@gmail.com ","0811602020 ",loc1);
        // Job job1 = new Job(1,"CEO ",recr1,500000000,"Heavyweight ");
        // Jobseeker jobsek1 = new Jobseeker(1,"Golf ","GolfleFleur@gmail.com ","oke ","20-12-2019");
       //  Invoice inv1 = new Invoice(1,1,"20-03-2021",2000,jobsek1);
        
        // recr1.getName();
        // recr1.setName("GC");
        // recr1.getName();
        // job1.printData();
        // recr1.printData();

       Location location1 = new Location("Jawabarat","Depok","Pesona Khayangan");
        Recruiter recruiter1 = new Recruiter(12, "Saddam ", "saddamsungkar@gmail.com", "0811602020", location1);
        Job job1 = new Job(13, "CEO", recruiter1, 120000, jobCategory.UX);
        job1.printData();
    }
}
