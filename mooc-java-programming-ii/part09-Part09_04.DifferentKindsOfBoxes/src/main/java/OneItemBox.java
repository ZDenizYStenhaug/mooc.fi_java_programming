
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
public class OneItemBox extends Box {

    private ArrayList<Item> items;
    private int capacity;
    
    public OneItemBox() {
        items = new ArrayList<>();
        this.capacity = 1;
    }
    
    @Override
    public void add(Item item) {
        if (items.size() < capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
    
}
