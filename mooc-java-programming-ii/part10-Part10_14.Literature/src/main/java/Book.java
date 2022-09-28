/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Book implements Comparable<Book> {
    
    private String name;
    private int age;
    
    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public String toString() {
        return new StringBuilder().append(name).append(" (recommended for ").append(age).append(" year-old or older)").toString();
    }
    
    @Override
    public int compareTo(Book b) {
        return this.getAge() - b.getAge();
    }
}
    
