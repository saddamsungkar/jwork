
/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 25/03/2021
*/

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

    public static Job getJobById(int id){
        Job tempVar = null;
        for (Job job: JOB_DATABASE) {
            if (id == job.getId()){
                tempVar = job;
            }
            else{
                tempVar =  null;
            }
        }
        return tempVar;
    }

    public static boolean addJob(Job job)
    {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    public static boolean removeJob(int id)
    {
        boolean tempBool = true;
        for (Job job: JOB_DATABASE) {
            if (id == job.getId()){
                JOB_DATABASE.remove(id);
                tempBool = true;
            }
            else{
                tempBool = false;
            }
        }
        return tempBool;
    }
}