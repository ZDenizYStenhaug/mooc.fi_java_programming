
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Recipes {
    
    private ArrayList<Recipe> recipes;
    
    public Recipes() {
        recipes = new ArrayList<>();
    }
    
    public void add(Recipe r) {
        recipes.add(r);
    }
    
    public void printRecipeList() {
        for(Recipe r : recipes) {
            System.out.println(r);
        }
    }
    
    public void readFromFile(String filename) {
        // read from the file
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get((filename)))){
            while(reader.hasNextLine()) {
                ArrayList<String> datum  = new ArrayList<>();
                while(true) {
                    String row = reader.nextLine();
                    if(row.isEmpty() || !reader.hasNextLine()) {
                        data.add(datum);
                        break;
                    }
                    datum.add(row);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (ArrayList<String> r : data) {
            Recipe recipe = new Recipe(r.get(0), Integer.valueOf(r.get(1)));
            for (int i = 2; i < r.size(); i++) {
                recipe.addIngredient(r.get(i));
            }
            recipes.add(recipe);
        }
    }
    
    public void searchByName(String name) {
        for(Recipe r : recipes) {
            if(r.getName().contains(name)) {
                System.out.println(r);
            }
        }
    }
    
    public void searchByCookingTime(int cookingTime) {
        for(Recipe r : recipes) {
            if(r.getCookingTime() <= cookingTime) {
                System.out.println(r);
            }
        }
    }
    
    public void searchByIngredient(String ingredient) {
        for (Recipe r : recipes)  {
            if(r.getIngredients().contains(ingredient)) {
                System.out.println(r);
            }
        }
    }
}
