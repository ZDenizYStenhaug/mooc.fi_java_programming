
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Employees {
    private List<Person> employees;
    
    public Employees() {
        employees = new ArrayList<>();
    }
    
    public void add(Person person) {
        employees.add(person);
    }
    
    public void add(List<Person> list) {
        employees.addAll(list);
    }
    
    public void print() {
        Iterator<Person> it = employees.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    public void print(Education ed) {
        Iterator<Person> it = employees.iterator();
        while(it.hasNext()) {
            Person p = it.next();
            if(p.getEducation() == ed) {
                System.out.println(p);
            }        
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> it = employees.iterator();
        while(it.hasNext()) {
            Person p = it.next();
            if(p.getEducation() == education) {
                it.remove();
            }        
        }
    }
    
    
}
