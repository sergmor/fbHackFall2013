
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ONT
 */
public abstract class Node {

    public void setSocialFeed(SocialFeed socialFeed) {
        this.socialFeed = socialFeed;
    }
    public enum Dependency{MANDATORY, RECCOMMENDED, HIGHLY_RECCOMMENDED};
    protected String title = "test";
    protected int id = 0;
    protected GUIAttributes presentation = new GUIAttributes();
    protected Dependency link = Dependency.MANDATORY;
    protected SocialFeed socialFeed = new SocialFeed();
    Node(){
        
    }
}
