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

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe() {}
    
    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        ingredients = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public int getCookingTime() {
        return cookingTime;
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }
    
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
    
    
    
    
}
