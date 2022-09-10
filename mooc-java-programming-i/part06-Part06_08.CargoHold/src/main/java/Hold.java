/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int max;
    
    public Hold(int max) {
        suitcases = new ArrayList<>();
        this.max = max;
    }
    
    public int totalWeight() {
         int weight = 0;
        for (Suitcase s : suitcases) {
            weight += s.totalWeight();
        }
        return weight;
    }
    
    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
    
    public void addSuitcase(Suitcase s) {
        if (s.totalWeight() + this.totalWeight() <= max) {
            suitcases.add(s);
        }
    }
    
     public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
