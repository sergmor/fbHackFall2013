
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
public class Exam extends Node {

    Exam(){

    }
    Exam(String title, int id){
        this.title = title;
        this.id = id;
    }

    /**
     * @return the type
     */
    public ExamType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(ExamType type) {
        this.type = type;
    }

    /**
     * @return the examDate
     */
    public Date getExamDate() {
        return examDate;
    }

    /**
     * @param examDate the examDate to set
     */
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
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
    public enum ExamType{MIDTERM, FINAL, MIDTERM_TAKE_HOME, FINAL_TAKE_HOME};
    private ExamType type = ExamType.MIDTERM;
    private Date examDate = new Date(System.currentTimeMillis());
    private ArrayList<Task> tasks = new ArrayList<Task>();
    private ArrayList<String> relatedTopics = new ArrayList<String>();
 }
