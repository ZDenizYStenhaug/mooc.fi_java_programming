/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Grade {
    private int point;
    
    public Grade(int point) {
        this.point = point;
        
    }
    
    public int getPoint() {
        return point;
    }
    
    public int getGrade() {
        int grade;
        if(point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
    
}
