
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Abbreviations {
    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abb, String ex) {
        abbreviations.put(abb, ex);
    }
    
    public boolean hasAbbreviation(String abb) {
        if(abbreviations.containsKey(abb)) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abb) {
        return abbreviations.get(abb);
    }   
}
