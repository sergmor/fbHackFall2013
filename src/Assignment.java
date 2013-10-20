
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ONT
 */
public class Assignment extends Node {
    //private Course course = new Course();
    private ArrayList<String> relatedTopics;
    private Date deadline = new Date(System.currentTimeMillis());
    private long hoursLeft = 20;
    private ArrayList<Task> tasks = new ArrayList<Task>();

    public Assignment() {
    }
    public Assignment(String title, int id) {
        this.title = title;
        this.id = id;
    }


    /**
     * @return the relatedTopics
     */
    public ArrayList<String> getRelatedTopics() {
        return relatedTopics;
    }

    /**
     * @param relatedTopics the relatedTopics to set
     */
    public void setRelatedTopics(ArrayList<String> relatedTopics) {
        this.relatedTopics = relatedTopics;
    }

    /**
     * @return the deadline
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * @return the hoursLeft
     */
    public long getHoursLeft() {
        return hoursLeft;
    }

    /**
     * @param hoursLeft the hoursLeft to set
     */
    public void setHoursLeft(long hoursLeft) {
        this.hoursLeft = hoursLeft;
    }

    /**
     * @return the tasks
     */
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    /**
     * @param tasks the tasks to set
     */
    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
