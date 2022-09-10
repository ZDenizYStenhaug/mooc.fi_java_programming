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
public class Package {
    
    private ArrayList<Gift> gifts;
    
    public Package() {
        gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    
    public int totalWeight() {
        int total = 0;
        for(Gift g : gifts) {
            total += g.getWeight();
        }
        return total;
    }
    
}
