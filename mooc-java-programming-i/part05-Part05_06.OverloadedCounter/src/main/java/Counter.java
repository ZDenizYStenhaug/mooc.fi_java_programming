/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Counter {
    private int num;
    
    public Counter(int num) {
        this.num = num;
    }
    
    public Counter() {
        num = 0;
    }
    
    public int value() {
        return num;
    }
    
    public void increase(int increaseBy) {
        if(increaseBy > 0) {
            num += increaseBy;
        }
    }
    
    public void increase() {
        num++;
    }
    
    public void decrease(int decreaseBy) {
        if(decreaseBy > 0) {
            num -= decreaseBy;
        }
    }
    
    public void decrease() {
        num--;
    }
}
