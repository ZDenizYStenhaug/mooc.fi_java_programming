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
    private GradeBook gb;
    
    public UserInterface(Scanner scanner, GradeBook gb) {
        this.sc = scanner;
        this.gb = gb;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(sc.nextLine());
            if(input == -1) {
                break;
            }
            if(input < 0 || input > 100) {
                continue;
            }
            gb.addGrade(new Grade(input));
        }
        printAverage();
        printPassingAverage();
        System.out.println("Pass percentage: " + gb.getPassPercentage());
        gb.printGradeDist();
    }
    
    private void printAverage() {
        double avg = gb.getAverage();
        if(avg < 0) {
            System.out.println("Point average (all): -");
        } else {
            System.out.println("Point average (all): " + avg);
        }
    }
    
    private void printPassingAverage() {
        double avg = gb.getPassingAverage();
        if(avg < 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + avg);
        }
    }
}
