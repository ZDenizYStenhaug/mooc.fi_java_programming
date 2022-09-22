/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class CD implements Packable {
    
    private double weight;
    private String artist;
    private String name;
    private int year;
    
    public CD(String artist, String name, int year) {
        weight = 0.1;
        this.artist = artist;
        this.name = name;
        this.year = year;
    }
    
    public double weight() {
        return weight;
    }
    
    public String toString() {
        return new StringBuilder().append(artist).append(": ").append(name). append(" (").append(year).append(")").toString();
    }
}
