package saddam.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        Location l1= new Location("Jawa Barat", "UI", "123");
        Location l2= new Location("Jawa Tengah", "UNDIP", "456");
        Location l3= new Location("Jawa Timur", "UB", "789");

        DatabaseRecruiter.addRecruiter(new Recruiter(1,"saddam","saddamkeren@gmail.com","081232315",l1));
        DatabaseRecruiter.addRecruiter(new Recruiter(2,"manis","manis@gmail.com","0831293874123",l2));
        DatabaseRecruiter.addRecruiter(new Recruiter(3,"gagah","gagah@gmail.com","0812376472432",l3));

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Polisi",DatabaseRecruiter.getRecruiterById(1),900000,JobCategory.DataAnalyst));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Polisi",DatabaseRecruiter.getRecruiterById(2),900000,JobCategory.DataAnalyst));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Polisi",DatabaseRecruiter.getRecruiterById(1),900000,JobCategory.UI));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Polisi",DatabaseRecruiter.getRecruiterById(3),900000,JobCategory.UX));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }


        SpringApplication.run(JWork.class, args);
    }

}