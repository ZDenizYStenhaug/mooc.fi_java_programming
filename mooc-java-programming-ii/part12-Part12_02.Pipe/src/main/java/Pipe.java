
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Pipe<T> {
    LinkedList<T> queue;
    
    public Pipe() {
        this.queue = new LinkedList<>();
    }
    
    public void putIntoPipe(T value) {
        queue.addLast(value);
    }
    
    public T takeFromPipe() {
        return queue.pollFirst();
    }
    
    public boolean isInPipe() {
        return !queue.isEmpty();
    }

}
