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

public class Stack {
    private ArrayList<String> strs;
    
    public Stack() {
        strs = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return strs.isEmpty();
    }
    
    public String take() {
        return strs.remove(strs.size() - 1);
    }
    
    public void add(String value) {
        strs.add(value);
    }
    
    public ArrayList<String> values() {
        return strs;
    }
}
