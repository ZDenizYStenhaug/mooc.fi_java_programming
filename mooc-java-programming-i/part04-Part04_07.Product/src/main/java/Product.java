/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product(String name, double price, int quantity) {    
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }
    
    public void printProduct() {
        System.out.println(name + ", " + price + ", " + quantity + " pcs");
    }
}
