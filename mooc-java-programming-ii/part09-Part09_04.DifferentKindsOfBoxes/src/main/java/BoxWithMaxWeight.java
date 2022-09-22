
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
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        items = new ArrayList<>();
        this.capacity = capacity;
    }
    
    @Override
    public void add(Item item) {
        if(!(item.getWeight() + getTotalWeight() > capacity)) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
    private int getTotalWeight() {
        int sum = 0;
        for(Item i : items) {
            sum += i.getWeight();
        }
        return sum;
    }
    
    
}
