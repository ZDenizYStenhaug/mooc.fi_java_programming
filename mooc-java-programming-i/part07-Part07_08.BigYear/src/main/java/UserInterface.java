
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
    private BirdDb db;
    
    
    
    public UserInterface(Scanner sc) {
        this.sc = sc;
        db = new BirdDb();
    }
    
    public void start() {
        while(true) {
            System.out.println("?");
            String command = sc.nextLine();
            
            if(command.equals("Quit")) {
                break;
            }
            if(command.equals("Add")) {
                System.out.println("Name:");
                String name = sc.nextLine();
                System.out.println("Latin:");
                String latin = sc.nextLine();
                db.add(new Bird(name, latin));
            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String bird = sc.nextLine();
                if(db.hasKey(bird)) {
                    db.addObservation(bird);
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("All")) {
                db.list();
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String name = sc.nextLine();
                db.listOne(name);
            } else {
                System.out.println("Incorrect input.");
            }
        }
    }
    
}
