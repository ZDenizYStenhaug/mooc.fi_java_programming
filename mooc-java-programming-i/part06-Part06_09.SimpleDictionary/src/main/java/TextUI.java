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

public class TextUI {
    
    private Scanner sc;
    private SimpleDictionary dic;
    
    public TextUI(Scanner sc, SimpleDictionary dic) {
        this.sc = sc;
        this.dic = dic;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = sc.nextLine();
            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = sc.nextLine();
                System.out.print("Translation: ");
                String tr = sc.nextLine();
                dic.add(word, tr);
            }
            if (command.equals("search")) {
                System.out.print("To be translaated: ");
                String word = sc.nextLine();
                String trans = dic.translate(word);
                if(trans == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + trans);
                }
            }
            System.out.println("Unknown command");    
        }
    }    
}
