/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Debt {
    private double balance;
    private double interestRate;
    
    public Debt(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    public void printBalance() {
        System.out.println(balance);
    }
    
    public void waitOneYear()  {
        balance = interestRate * balance;
    }
    
}
