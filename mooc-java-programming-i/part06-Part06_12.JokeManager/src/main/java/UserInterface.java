/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */

import java.util.Scanner;

public class UserInterface {
    
    private Scanner sc;
    private JokeManager manager;
    
    public UserInterface(JokeManager manager, Scanner sc) {
        this.manager = manager;
        this.sc = sc;
    }
    
    public void start() {
        System.out.println("What a joke!");

        while(true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = sc.nextLine();
            if (command.equals("X")) {
            break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = sc.nextLine();
                manager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(manager.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");    
                manager.printJokes();
            }
        }
    }
    
}
