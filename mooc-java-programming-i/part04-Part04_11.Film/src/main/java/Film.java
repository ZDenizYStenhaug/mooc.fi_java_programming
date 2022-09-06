/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Film {
    private String name;
    private int ageRating;
    
    public Film(String name, int ageRating) {
        this.name = name;
        this.ageRating = ageRating;
    }
    
    public String name() {
        return name;
    }
    
    public int ageRating() {
        return ageRating;
    }
}
