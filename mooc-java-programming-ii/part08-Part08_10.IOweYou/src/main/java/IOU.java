
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class IOU {
    
    private HashMap<String, Double> dept;
    
    public IOU() {
        dept = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        dept.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return dept.getOrDefault(toWhom, 0d);
    }
    
}
