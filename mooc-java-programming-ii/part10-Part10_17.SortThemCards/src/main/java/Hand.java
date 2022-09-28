
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class Hand implements Comparable<Hand> {
    
    private List<Card> cards;
    
    public Hand() {
        cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        cards.stream().forEach(c -> System.out.println(c));
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public int getValue() {
        return cards.stream().reduce(0, (prev, c) -> prev + c.getValue(), Integer::sum);
    }

    @Override
    public int compareTo(Hand o) {
        return this.getValue() - o.getValue();
    }
    
    public void sortBySuit() { 
        BySuitInValueOrder comp = new BySuitInValueOrder();
        Collections.sort(cards, comp);
    }
}
