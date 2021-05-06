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
        oke.setPassword("saddamganteng");s
        
        System.out.println(oke.toString());*/
        
        /* Location loc1 = new Location("Jawa Barat", "Depok", "Pesona Khayangan");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Saddam", "oke@gmail.com", "1234", loc1));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Saddam", "manis@ui.ac.id", "saddamganteng", 2021, 04, 22));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Saddam", "iya@ui.ac.id", "saddamganteng", 2021, 04, 23));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "asik", "keren@ui.ac.id", "IMasdasda123", 2021, 03, 6));

        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
        DatabaseJob.addJob(new Job(1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(1, "Data Analyst", DatabaseRecruiter.getRecruiterById(1), 20000, JobCategory.DataAnalyst));
        DatabaseJob.addJob(new Job(1, "Data Scientist", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.DataScientist));

        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst)); */
        Location jakarta = new Location("Jawa Barat", "Depok", "di Depok");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId()+1, "the brotherhood", "danielcaesar@gmail.com", "081002320", jakarta));
        try {
            DatabaseJobSeeker.addJobseeker((new Jobseeker(DatabaseJobSeeker.getLastId()+1, "misumi", "lashes@gmail.com", "1234", 2021, 8, 4)));
        } catch (EmailAlreadyExistException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobSeeker.addJobseeker((new Jobseeker(DatabaseJobSeeker.getLastId()+1, "outlander", "nissan@gmail.com", "1234", 2021, 8, 4)));
        } catch (EmailAlreadyExistException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobSeeker.addJobseeker((new Jobseeker(DatabaseJobSeeker.getLastId()+1, "alphard", "toyota@gmail.com", "1234", 2021, 8, 4)));
        } catch (EmailAlreadyExistException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobSeeker.addJobseeker((new Jobseeker(DatabaseJobSeeker.getLastId()+1, "pajero", "sport@gmail.com", "1234", 2021, 8, 4)));
        } catch (EmailAlreadyExistException e) {
            System.out.println(e.getMessage());
        }
        /*for (Jobseeker jobseeker : DatabaseJobSeeker.getJobseekerDatabase()){
            System.out.println(jobseeker.getName());
            System.out.println(jobseeker.getId());
            }*/

        try {
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Chef", 12000, JobCategory.BackEnd, DatabaseRecruiter.getRecruiterById(1)));
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Artist", 12000, JobCategory.BackEnd, DatabaseRecruiter.getRecruiterById(1)));
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Racer", 12000, JobCategory.FrontEnd, DatabaseRecruiter.getRecruiterById(1)));
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        for (Job job : DatabaseJob.getJobByCategory(JobCategory.BackEnd)){
            System.out.println(job.getName());
        }
        for (Job job : DatabaseJob.getJobByCategory(JobCategory.FrontEnd)){
            System.out.println(job.getName());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "bmw i8", 10000,1000, false));
        } catch (ReferralCodeAlreadyExistException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "bmw 320i", 20000,2000, false));
        } catch (ReferralCodeAlreadyExistException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "bmw seri 7", 2000,2000, false));
        } catch (ReferralCodeAlreadyExistException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "bmw seri 3", 200000,2000, false));
        } catch (ReferralCodeAlreadyExistException e) {
            System.out.println(e.getMessage());
        }
        /*for(Bonus bonus : DatabaseBonus.getBonusByReferralCode()){
            System.out.println(bonus.getId());
            System.out.println(bonus.getReferralCode());
        };*/
        Jobseeker asdos = new Jobseeker(1, "apaaja", "mami@gmail.com", "666", 2021,8,12 );
        Recruiter salman = new Recruiter(1, "jakarta aneh", "mamipoko@gmail.com", "0818181820", jakarta);
        Job bersih = new Job(1, "O7", 12000, JobCategory.BackEnd, salman);
        Jobseeker aslab = new Jobseeker(2, "macet", "kia@gmail.com", "0702", 2021,8,12 );
        Recruiter idam = new Recruiter(2, "rangerover ganteng", "mercedes@gmail.com", "081517923", jakarta);
        Job babu = new Job(2, "lampu", 12000, JobCategory.BackEnd, idam);
        Jobseeker asprak = new Jobseeker(3, "hijau", "serena@gmail.com", "1492", 2021,8,12 );
        Recruiter parhan = new Recruiter(3, "vw golf", "volkswagen@gmail.com", "081812973", jakarta);
        Job pembantu = new Job(3, "mitsubishi", 12000, JobCategory.BackEnd, parhan);
        BankPayment bankpayment1 = new BankPayment(DatabaseInvoice.getLastId()+1, DatabaseJob.getJobDatabase(), asdos);
        BankPayment bankpayment2 = new BankPayment(DatabaseInvoice.getLastId()+1, DatabaseJob.getJobDatabase(), aslab);
        BankPayment bankpayment3 = new BankPayment(DatabaseInvoice.getLastId()+1, DatabaseJob.getJobDatabase(), asprak);
        DatabaseInvoice.addInvoice((bankpayment1));
        DatabaseInvoice.addInvoice((bankpayment2));
        DatabaseInvoice.addInvoice((bankpayment3));
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            new Thread(new FeeCalculator(invoice)).start();
        }
    }
}

    
