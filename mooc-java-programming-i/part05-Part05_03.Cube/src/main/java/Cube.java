/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Cube {
    private int edgeLength;
    private int volume;
    
    
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
        volume = (int) Math.pow(edgeLength, 3);
    }    
    
    public int volume() {
        return volume;
    }
    
    public String toString() {
        return "The length of the edge is " + edgeLength + " and the volume " + volume;
    }
}
