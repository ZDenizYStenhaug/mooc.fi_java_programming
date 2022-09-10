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

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public Person shortest() {
        if (persons.size() == 0) {
            return null;
        }
        int height = persons.get(0).getHeight();
        Person shortest = persons.get(0);
        for(Person p : persons) {
            if(p.getHeight() < height) {
                height = p.getHeight();
                shortest = p;
            }
        }
        return shortest;
    }
    
    public Person take() {
        Person shortest = this.shortest();
        persons.remove(shortest);
        return shortest;
    }
}
 