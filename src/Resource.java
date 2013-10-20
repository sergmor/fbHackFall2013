/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ONT
 */
public class Resource {
    public enum ResourceType{VIDEO, TEXT, PPT, E_BOOK};
    private ResourceType type = ResourceType.TEXT;
    private String name = "www.google.com";
    Resource(){
    }
}
