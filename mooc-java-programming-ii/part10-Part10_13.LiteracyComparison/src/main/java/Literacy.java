

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */


public class Literacy implements Comparable<Literacy> {
    
    private String country;
    private String gender;
    private int year;
    private double rate;
    
    
    public Literacy(String country, String gender, int year, double rate) {
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.rate = rate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    @Override
    public int compareTo(Literacy l) {
        
        if(this.getRate() > l.getRate()) {
            return 1;
        } else if(this.getRate() < l.getRate()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return new StringBuilder().append(country).append(" (").append(year).append("), ")
                .append(gender).append(", ")
                .append(rate).toString();
    }
    
    
}
