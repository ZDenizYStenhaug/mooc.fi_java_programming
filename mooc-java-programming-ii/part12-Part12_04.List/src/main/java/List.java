/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;
    
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 10;
    }
    
    public void add(Type value) {
        if (this.values.length == this.firstFreeIndex) {
            this.grow();
        }
        this.values[firstFreeIndex] = value;
        this.firstFreeIndex ++;
    }
    
    public boolean contains(Type value) {
        for (int i = 0; i < values.length; i++) {
            if(values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
    
    public void remove(Type value) {
        int indexOfValue = this.indexOfValue(value);
        if(indexOfValue < 0) {
            return;
        }
        this.moveToLeft(indexOfValue);
        this.firstFreeIndex --;
    }
    
    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];    
    }
    
    public int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = values[i];
        }
        this.values = newValues;
    }
     
    private void moveToLeft(int fromIndex) {
        for(int i = fromIndex; i < firstFreeIndex; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
     
}
