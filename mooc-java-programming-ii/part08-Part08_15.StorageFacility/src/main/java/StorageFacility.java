
import java.util.ArrayList;
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> units;
    
    public StorageFacility() {
        units = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        units.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> items = units.get(unit);
        items.add(item);
    }
    
    public ArrayList<String> contents(String unit) {
        if (units.containsKey(unit)) {
            return units.get(unit);
        }
        return new ArrayList<>();
    }
    
    public void remove(String unit, String item) {
        ArrayList<String> items = units.get(unit);
        items.remove(item);
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitNames = new ArrayList<>();
        for(String unit : units.keySet()) {
            if(!units.get(unit).isEmpty()) {
                unitNames.add(unit);
            }
        }
        return unitNames;
    }
    
    
    
}
