/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrlemon
 */
public class AverageSensor implements Sensor{
    
    private List<Sensor> sensors;
    private List<Integer> history;
    
    public AverageSensor() {
        sensors = new ArrayList<>();
        history = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return history;
    }
    
    @Override
    public boolean isOn() {
        for(Sensor s : sensors) {
            if(!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if(sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        }
        Integer avg = (int) sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
        history.add(avg);
        return avg;
    }
    
}
