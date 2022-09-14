
import java.nio.file.Paths;
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
public class UserInterface {
    
    private Scanner sc;
    
    public UserInterface(Scanner sc) {
        this.sc = sc;
    }
    
    public void start() {
        System.out.println("File to read: ");
        String fn = sc.nextLine();
        Recipes recipes = new Recipes();
        recipes.readFromFile(fn);
        
        printCommandList();

        while(true) {
            System.out.println("Enter command: ");
            String command = sc.nextLine();
            System.out.println("");
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                System.out.println("Recipes:");
                recipes.printRecipeList();
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String word = sc.nextLine();
                System.out.println("Recipes:");
                recipes.searchByName(word);
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cookingtime: ");
                int maxCookingTime = Integer.valueOf(sc.nextLine());
                System.out.println("Recipes:");
                recipes.searchByCookingTime(maxCookingTime);
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = sc.nextLine();
                System.out.println("Recipes:");
                recipes.searchByIngredient(ingredient);
            }
        }
    }
    
    private void printCommandList() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
    
}
