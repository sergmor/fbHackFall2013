
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
public class Task extends Node {
    private Date startDate = new Date(System.currentTimeMillis());
    private Date endDate = new Date(System.currentTimeMillis());
    //Scale of 10
    private int difficulty = 8;
    private int percentDone = 75;
    private ArrayList<Resource> resources = new ArrayList<Resource>();
    Task(){

    }
    Task(String name, int id)
    {
        this.title = name;
        this.id = id;
    }
    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the difficulty
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the percentDone
     */
    public int getPercentDone() {
        return percentDone;
    }

    /**
     * @param percentDone the percentDone to set
     */
    public void setPercentDone(int percentDone) {
        this.percentDone = percentDone;
    }

    /**
     * @return the resources
     */
    public ArrayList<Resource> getResources() {
        return resources;
    }

    /**
     * @param resources the resources to set
     */
    public void setResources(ArrayList<Resource> resources) {
        this.resources = resources;
    }
    
}
