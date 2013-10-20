
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ONT
 */
public class Course extends Node {

    /**
     * @return the id
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * @param id the id to set
     */
    public void courseId(String id) {
        this.courseId = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the prof
     */
    public Professor getProf() {
        return prof;
    }

    /**
     * @param prof the prof to set
     */
    public void setProf(Professor prof) {
        this.prof = prof;
    }

    /**
     * @return the tas
     */
    public ArrayList<String> getTas() {
        return tas;
    }

    /**
     * @param tas the tas to set
     */
    public void setTas(ArrayList<String> tas) {
        this.tas = tas;
    }

    /**
     * @return the assignments
     */
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    /**
     * @param assignments the assignments to set
     */
    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    /**
     * @return the exams
     */
    public ArrayList<Exam> getExams() {
        return exams;
    }

    /**
     * @param exams the exams to set
     */
    public void setExams(ArrayList<Exam> exams) {
        this.exams = exams;
    }

    /**
     * @return the textbooks
     */
    public ArrayList<String> getTextbooks() {
        return textbooks;
    }

    /**
     * @param textbooks the textbooks to set
     */
    public void setTextbooks(ArrayList<String> textbooks) {
        this.textbooks = textbooks;
    }

    /**
     * @return the courseWebpage
     */
    public String getCourseWebpage() {
        return courseWebpage;
    }

    /**
     * @param courseWebpage the courseWebpage to set
     */
    public void setCourseWebpage(String courseWebpage) {
        this.courseWebpage = courseWebpage;
    }

    /**
     * @return the rating
     */
    public Ratings getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(Ratings rating) {
        this.rating = rating;
    }

    /**
     * @return the culpaJSON
     */
    public String getCulpaJSON() {
        return culpaJSON;
    }

    /**
     * @param culpaJSON the culpaJSON to set
     */
    public void setCulpaJSON(String culpaJSON) {
        this.culpaJSON = culpaJSON;
    }
    public enum Ratings{TOUGH, MODERATE, EASY};
    private String courseId = "COMS 4710";
    private String name = "User Interface Design";
    private Professor prof = new Professor();
    private ArrayList<String> tas = new ArrayList<String>();
    private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    private ArrayList<Exam> exams = new ArrayList<Exam>();
    private ArrayList<String> textbooks = new ArrayList<String>();
    private String courseWebpage = "http://graphics.cs.columbia.edu/courses/csw4170/";
    private Ratings rating = Ratings.TOUGH;
    private String culpaJSON = "";

    Course() {
    }

}
