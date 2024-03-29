/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 25/03/2021
*/

public class JWork{ 
    public static void main(String[] args){ 
        
        // Location location1 = new Location("Jawabarat","Depok","Pesona Khayangan");
        // Recruiter recruiter1 = new Recruiter(12, "Saddam ", "saddamsungkar@gmail.com", "0811602020", location1);
        // Job job1 = new Job(1, "CEO", recruiter1, 500000, jobCategory.UI); job1.printData();
        // Jobseeker jobsek1 = new Jobseeker(1,"Golf ","GolfleFleur@gmail.com ","oke ","20-12-2019");
        //  Invoice inv1 = new Invoice(1,1,"20-03-2021",2000,jobsek1);
        
        // recr1.getName();
        // recr1.setName("GC");
        // recr1.getName();
        // job1.printData();
        // recr1.printData();

        // jobsek1 = new Jobseeker(1,"Golf","GolfeleFleur@gmail.com","oke","20-12-2019");
        // Invoice inv1 = new Invoice(1,1,"20-03-2021",1000,jobsek1,PaymentType.BankPayment,InvoiceStatus.Finished);
        // inv1.printData();
       
        /* Jobseeker iya = new Jobseeker(1, "Golf", "GolfeleFleur@gmail.com", "oke", "20-12-2019");
        Bonus bonus1 = new Bonus(1, "abc", 5000, 2000, true);
        Bonus bonus2 = new Bonus(2, "cba", 5000, 10000, true);
        Location loc1 = new Location("Jawa Barat", "Depok", "Pesona Khayangan");
        Recruiter rec1 = new Recruiter(1, "Saddam", "saddamsungkar@gmail.com", "0811602020", loc1);
        Job oke = new Job(12, "CEO", 12000, JobCategory.BackEnd, rec1);
        EwalletPayment ewalletpayment = new EwalletPayment(1, bersih,"01 April 2021", iya, InvoiceStatus.OnGoing);
        EwalletPayment ewalletpayment2 = new EwalletPayment(2, bersih, "01 April 2021", iya, bonus1, InvoiceStatus.Finished);
        EwalletPayment ewalletpayment3 = new EwalletPayment(3, bersih, "01 April 2021", iya, bonus2, InvoiceStatus.Finished);
        
        ewalletpayment.setTotalFee();
        ewalletpayment2.setTotalFee();
        ewalletpayment3.setTotalFee();
        
        ewalletpayment.printData();
        ewalletpayment2.printData();
        ewalletpayment3.printData();
        */
       
        /* Jobseeker iya = new Jobseeker(1, "Golf", "GolfeleFleur@gmail.com", "oke", "20-12-2019");
        Location loc1 = new Location("Jawa Barat", "Depok", "Pesona Khayangan");
        Recruiter rec1 = new Recruiter(1, "Saddam", "saddamsungkar@gmail.com", "0811602020", loc1);
        Job oke = new Job(12, "CEO", 12000, JobCategory.BackEnd, rec1);
        
        BankPayment bankpayment1 = new BankPayment(1, oke, "3 April 2021", iya, InvoiceStatus.Finished);
        BankPayment bankpayment2 = new BankPayment(2, oke, "3 April 2021", iya, 1000, InvoiceStatus.Finished);
               
        bankpayment1.setTotalFee();
        bankpayment2.setTotalFee();
        
        bankpayment1.printData();
        bankpayment2.printData(); */
        
        /* GregorianCalendar tanggal = new GregorianCalendar(2021, 8,4);
        Jobseeker oke = new Jobseeker(1, "saddam", "saddd..manis@ui.ac.id", "123", tanggal);
        Jobseeker asik = new Jobseeker(2, "saddam", "manis.yak@gmail.com", "saddamganteng", 2021, 8, 4);
        Jobseeker manis = new Jobseeker(3,"saddam", "mantap.yak@gmail.com", "saddamganteng" );
        
        System.out.println(oke.toString());
        System.out.println(asik.toString());
        System.out.println(manis.toString());
        
        oke.setEmail("saddam.asik@gmail.com");
        oke.setPassword("saddamganteng");
        
        System.out.println(oke.toString());*/
        
        Location loc1 = new Location("Jawa Barat", "Depok", "Pesona Khayangan");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Saddam", "oke@gmail.com", "1234", loc1));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Saddam", "manis@ui.ac.id", "saddamganteng", 2021, 04, 22));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Saddam", "iya@ui.ac.id", "saddamganteng", 2021, 04, 23));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "asik", "keren@ui.ac.id", "IMasdasda123", 2021, 03, 6));

        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
        DatabaseJob.addJob(new Job(1, "Backend Engineer Tesla", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(1, "Data Analyst BitCoin", DatabaseRecruiter.getRecruiterById(1), 20000, JobCategory.DataAnalyst));
        DatabaseJob.addJob(new Job(1, "Data Scientist Crypto", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.DataScientist));

        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst));
    }
}
