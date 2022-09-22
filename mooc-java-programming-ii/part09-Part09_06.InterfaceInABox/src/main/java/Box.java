
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Box implements Packable{
    
    private ArrayList<Packable> items;
    private double capacity;
    
    public Box(double capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }
    
    public void add(Packable p) {
        if(p.weight() + this.weight() <= capacity) {
            items.add(p);
        }
    }
    
    public double weight() {
        double weight = 0;
        for(Packable p : items) {
            weight += p.weight();
        }
        return weight;
    }
    
    public String toString() {
        return new StringBuilder().append("Box: ").append(items.size()).append(" items, ").append("total weight ").append(this.weight()).append(" kg").toString();
    }
}
