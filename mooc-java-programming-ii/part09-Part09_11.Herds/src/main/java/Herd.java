
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Herd implements Movable {
    private List<Movable> objects;
    
    public Herd() {
        this.objects = new ArrayList<>();
    }
    
    public void addToHerd(Movable m) {
        objects.add(m);
    }
    
    public void move(int dx, int dy) {
        for(Movable m: objects) {
            m.move(dx, dy);
        }
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Movable m : objects) {
            sb.append(m.toString()).append("\n");
        }
        return sb.toString();
    }
    
}
