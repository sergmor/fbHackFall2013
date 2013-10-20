
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ONT
 */
public class User {
    public enum Rank{ADVANCED, NOVICE, SUPER_USER, LEGEND};
    private String name;
    private ArrayList<Course> courses = new ArrayList<Course>();
    //private long endorsements;

}
