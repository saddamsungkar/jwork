import java.util.ArrayList;

public class DatabaseJob
{
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;

    public static ArrayList<Job> getJobDatabase()
    {
        return JOB_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException {
        Job x = null;
        try{for (Job job : JOB_DATABASE) {
            if (id == job.getId()) {
                x = job;
            }
        }}
        catch (Exception e){
            throw new JobNotFoundException(id);}
        return x;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId)
    {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (recruiterId == job.getRecruiter().getId()) {
                temp.add(job);
            } else {
                return null;
            }
        }
        return temp;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category)
    {
        ArrayList<Job> x = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (category == job.getCategory()) {
                x.add(job);
            } else {
                return null;
            }
        }
        return x;
    }

    public static boolean addJob(Job job)
    {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    public static boolean removeJob(int id) throws JobNotFoundException {
        boolean status = false;
        for (Job element : JOB_DATABASE) {
            if (element.getId() == id) {
                JOB_DATABASE.remove(element);
                status = true;
                break;
            }
        }
        if (!status){
            throw new JobNotFoundException(id);
        }

        return status;
    }
}