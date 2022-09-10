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
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner sc) {
        this.sc = sc;
        this.list = list;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = sc.nextLine();
            if(command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = sc.nextLine();
                list.add(toAdd);
            } else if (command.equals("list")) {
                list.print();
            } else if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                list.remove(Integer.valueOf(sc.nextLine()));
            }
        }
    }
    
}
