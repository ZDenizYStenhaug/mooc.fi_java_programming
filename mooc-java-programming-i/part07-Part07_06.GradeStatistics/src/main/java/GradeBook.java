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
import java.util.HashMap;

public class GradeBook {
    private ArrayList<Grade> grades;
    private HashMap<Integer, Integer> gradeDist;
    
    public GradeBook() {
        grades = new ArrayList<>();
        gradeDist = new HashMap<>();
    }
    
    public void addGrade(Grade g) {
        grades.add(g);
        int grade = g.getGrade();
        if(gradeDist.containsKey(grade)) {
            gradeDist.put(grade, gradeDist.get(grade) + 1);
        } else {
            gradeDist.put(grade, 1);
        }
    }
    
    public double getAverage() {
        if(grades.size() == 0) {
            return -1;
        }
        int sum = 0;
        for(Grade g : grades) {
            sum += g.getPoint();
        }
        return sum * 1.0 / grades.size();
    }
    
    public double getPassingAverage() {
        if(grades.size() == 0) {
            return -1;
        }
        int sum = 0;
        int count = 0;
        for(Grade g : grades) {
            if (g.getPoint() >= 50) {
                sum += g.getPoint();
                count ++;
            }
        }
        if(count == 0) {
            return -1;
        }
        return sum * 1.0 / count;
    }
    
    public double getPassPercentage() {
        int count = 0;
        for(Grade g : grades) {
            if (g.getPoint() >= 50) {
                count ++;
            }
        }
        if(grades.size() == 0) {
            return 0;
        }
        return 100 * (count * 1.0) / grades.size();
    }
    
    public void printGradeDist() {
        for(int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            if(gradeDist.containsKey(i)) {
            printStars(gradeDist.get(i));
            }
            System.out.println("");
        }
    }
    
    private void printStars(int num) {
        for(int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}
