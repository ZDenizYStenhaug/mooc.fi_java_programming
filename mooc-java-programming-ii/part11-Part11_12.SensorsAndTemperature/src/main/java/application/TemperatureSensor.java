/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author mrlemon
 */
public class TemperatureSensor implements Sensor {
    
    private int value;
    private boolean s;
    
    public TemperatureSensor() {
            s = false;
    }

    @Override
    public boolean isOn() {
        return s;
    }

    @Override
    public void setOn() {
        s = true;
    }

    @Override
    public void setOff() {
        s = false;
    }

    @Override
    public int read() {
        if(!s) {
            throw new IllegalStateException();
        }
        Random r = new Random();
        value = r.ints(-30, 30).findFirst().getAsInt();
        return value;
    }
    
}
