/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Hideout<T> {
    T object = null;
    
    public void putIntoHideout(T toHide) {
        this.object = toHide;
    }
    
    public T takeFromHideout() {
        T ob = object;
        object = null;
        return ob;
    }
    
    public boolean isInHideout() {
        return !(object == null);
    }
    
}
