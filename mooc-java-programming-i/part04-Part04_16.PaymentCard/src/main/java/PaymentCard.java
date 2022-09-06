/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if(balance - 2.60 >= 0) {
            balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        // write code here
        if(balance - 4.60 >= 0) {
            balance -= 4.60;
        }
    }
    
    public void addMoney(double amount) {
        if(amount > 0) {
            balance += amount;
        }
        if(balance > 150) {
            balance = 150;
        }
    }
    
    public String toString() {
        return "the card has a balance of " + balance + " euros";
    }
}
