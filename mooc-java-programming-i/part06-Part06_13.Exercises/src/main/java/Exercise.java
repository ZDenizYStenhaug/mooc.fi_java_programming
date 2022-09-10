/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Exercise {
    private String name;
    private boolean completed;
    
    public Exercise(String name) {
        this.name = name;
        completed = false;
    }
    
    public String getName() {
        return  name;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public boolean getCompleted() {
        return completed;
    }
    
    public boolean equals(Exercise ex) {
        System.out.println(ex.name + "  " + ex.completed);
        if(this == ex) {
            return true;
        }
        if(!(ex instanceof Exercise)) {
            return false;
        }
        Exercise exer = (Exercise) ex;
        
        if(exer.completed == this.completed &&
                exer.name == this.name) {
            return true;
        }
        return false;
    }
}
