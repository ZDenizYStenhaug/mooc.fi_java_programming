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
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licencePlate, String owner) {
        if(registry.containsKey(licencePlate)) {
            return false;
        }
        registry.put(licencePlate, owner);
        return true;
    }
    
    public String get(LicensePlate lp) {
        return registry.get(lp);
    }
    
    public boolean remove(LicensePlate lp) {
        if(registry.containsKey(lp)) {
            registry.remove(lp);
            return true;
        }
        return false;
    }
    
    
    public void printLicensePlates() {
        for(LicensePlate lp : this.registry.keySet()) {
            System.out.println(lp);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for(String val : registry.values()) {
            if(!owners.contains(val)) {
                System.out.println(val);
                owners.add(val);
            }
        }
    }
}
