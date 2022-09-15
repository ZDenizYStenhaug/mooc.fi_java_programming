/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Container {
    private int contains;

    public Container() {
        contains = 0;
    }
    
    public void add(int amount) {
        if(amount < 0) {
            return;
        }
        contains += amount;
        if(contains > 100) {
            contains = 100;
        }
    }
    
    public int contains() {
        return contains;
    }
    
    public void setAmount(int amount) {
        this.contains = amount;
    }
    
    public void remove(int amount) {
        if(amount > contains) {
            contains = 0;
        } else {
            contains -= amount;
        }
    }
    
    public String toString() {
        return contains + "/100";
    }
    
    
}
