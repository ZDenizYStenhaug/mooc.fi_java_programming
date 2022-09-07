/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */


public class Timer {
    private ClockHand hundrethOfSecond;
    private ClockHand second;
    
    public Timer() {
        hundrethOfSecond = new ClockHand(100);
        second = new ClockHand(60);
    }
    
    public void advance() {
        hundrethOfSecond.advance();
        if(hundrethOfSecond.value() >= 99) {
            second.advance();
        }
    }
    
    public String toString() {
        return second + ":" + hundrethOfSecond;
    }
}
