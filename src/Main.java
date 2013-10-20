
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ONT
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class Main {
    public static void main(String[] args){
        Gson gson = new GsonBuilder().create();
        Assignment a1 = new Assignment("Asgnmnt1", 0);
        Task t1 = new Task("Task 1", 0);
        t1.getResources().add(new Resource());
        a1.getTasks().add(t1);
        Task t2 = new Task("Task 2", 1); t2.getResources().add(new Resource());
        a1.getTasks().add(t2);

        Assignment a2 = new Assignment();
        Task t3 = new Task("Task 3", 0);
        t3.getResources().add(new Resource());
        a2.getTasks().add(t3);
        Task t4 = new Task("Task 4", 1);
        t4.getResources().add(new Resource());
        a2.getTasks().add(t4);

        Course crse = new Course();
        crse.getTas().add("Abhinav Bajaj");
        crse.getAssignments().add(a1);
        crse.getAssignments().add(a2);
        
        Exam e1 = new Exam("midterm1", 0);
        e1.getTasks().add(t1);
        e1.getRelatedTopics().add("JavaScript");
        e1.getRelatedTopics().add("HTML");

        crse.getExams().add(e1);
        crse.getTextbooks().add("Designing the Interface: Ben Schneiderman");

        gson.toJson(a1, System.out);
        //System.out.println(gson);

    }

}
