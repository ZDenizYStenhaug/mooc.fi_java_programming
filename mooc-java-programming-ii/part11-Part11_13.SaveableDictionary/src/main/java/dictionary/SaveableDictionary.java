/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author mrlemon
 */
public class SaveableDictionary {
    private HashMap<String, String> to;
    private HashMap<String, String> from;
    private String fn;
    
    
    public SaveableDictionary() {
        to = new HashMap<>();
        from = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        to = new HashMap<>();
        from = new HashMap<>();
        this.fn = file;
    }
    
    public boolean load() {
        try {
            Scanner reader = new Scanner(Paths.get(this.fn));
            while(reader.hasNextLine()) {
                
                String[] line = reader.nextLine().split(":");
                this.add(line[0], line[1]);
            }
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    
    public void add(String word, String trans) {
        if(!to.containsKey(word) && !from.containsKey(trans)) {
            to.put(word, trans);
            from.put(trans, word);
        }
        
    }
    
    public String translate(String word) {
        if(to.containsKey(word)) {
            return to.get(word);
        }
        return from.get(word);
    }
    
    public void delete(String word) {
        if(to.containsKey(word)) {
            from.remove(to.get(word));
            to.remove(word);
        } else {
            to.remove(from.get(word));
            from.remove(word);
        }
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(fn);
            for(String key : to.keySet()) {
                writer.println(key + ":" + to.get(key));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
