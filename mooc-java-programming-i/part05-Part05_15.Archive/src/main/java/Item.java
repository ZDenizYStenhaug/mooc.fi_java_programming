/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Item {
    private String name;
    private String identifier;
    
    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    
    public boolean equals(Object it) {
        if (this == it) {
            return true;
        }
        if(!(it instanceof Item)) {
            return false;
        }
        Item item = (Item) it;
        if(this.identifier.equals(item.identifier)) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return identifier + ": " + name;
    }
}
