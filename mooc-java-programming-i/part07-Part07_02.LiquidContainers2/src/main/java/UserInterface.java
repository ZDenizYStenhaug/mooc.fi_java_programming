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
    private Container c1;
    private Container c2;
    
    public UserInterface(Scanner sc, Container c1, Container c2) {
        this.sc = sc;
        this.c1 = c1;
        this.c2 = c2;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("First: " + c1);
            System.out.println("Second: " + c2);

            String input = sc.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] values = input.split(" ");
            int val = Integer.valueOf(values[1]);
            if(val < 0) {
                continue;
            }
            String command = values[0];
            if(command.equals("add")) {
                c1.add(val);
            } else if(command.equals("move")) {
                if(val > c1.contains()) {
                    c2.add(c1.contains());
                    c1.setAmount(0);
                } else {
                    c1.remove(val);
                    c2.add(val);
                }
            } else if (command.equals("remove")) {
                if(val > c2.contains()) {
                    c2.setAmount(0);
                } else {
                    c2.remove(val);
                }
            }
         }
    }
    
}
