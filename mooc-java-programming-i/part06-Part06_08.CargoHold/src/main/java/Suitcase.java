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

public class Suitcase {
    
    private ArrayList<Item> items;
    private int max;
    
    public Suitcase(int max) {
        items = new ArrayList<>();
        this.max = max;
    }
    
    public void addItem(Item item) {
        if(item.getWeight() + this.totalWeight() > max) {
            return;
        }
        items.add(item);
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Item i : items) {
            weight += i.getWeight();
        }
        return weight;
    }
    
    public Item heaviestItem() {
        if(items.size() == 0) {
            return null;
        }
        Item heaviest = items.get(0);
        for (Item i : items) {
            if(i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }
    
    public void printItems() {
        for(Item i : items) {
            System.out.println(i);
        }
    }
    
    public String toString() {
        String itemsStr;
        if(items.size() == 0) {
            itemsStr = "no items";
        } else if (items.size() == 1) {
            itemsStr = "1 item";
        } else {
            itemsStr = items.size() + " items";
        }
        return itemsStr + " (" + this.totalWeight() + " kg)";
    }
    
    
    
}
