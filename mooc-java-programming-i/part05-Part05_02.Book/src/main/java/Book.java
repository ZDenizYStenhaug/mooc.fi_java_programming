/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Book {
    private String author;
    private String name;
    private int pages;
    
    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPages() {
        return pages;
    }
    
    public String toString() {
        return author + ", " + name + ", " + pages + " pages";
    }
    
}
