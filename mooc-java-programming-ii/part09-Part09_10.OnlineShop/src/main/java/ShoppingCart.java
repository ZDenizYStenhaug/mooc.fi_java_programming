
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class ShoppingCart {
    
    private Map<String, Item> items;
    
    public ShoppingCart() {
        items = new HashMap<>();
    }
    
    public void add(String product, int price) {
         if(items.containsKey(product)) {
             Item i = items.get(product);
             i.increaseQuantity();
         } else {
             items.put(product, new Item(product, 1, price));
         }
    }
    
    public int price() {
        int price = 0;
        for(Item i : items.values()) {
            price += i.price();
        }
        return price;
    }
    
    public void print() {
        for(Item i : items.values()) {
            System.out.println(i);
        }
    }
    
    
}
