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
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager() {
        jokes = new ArrayList<>();
    }
    
    public ArrayList<String> getJokes() {
        return jokes;
    }
    
    public void addJoke(String joke) {
        jokes.add(joke);
    }
    
    public String drawJoke() {
         if(this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        }
    }
    
    public void printJokes() {
         for (String joke : jokes) {
            System.out.println(joke);
        }
    }
    
    
    
}
