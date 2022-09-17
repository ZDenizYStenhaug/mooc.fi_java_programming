
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrlemon
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations() {
        translations = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        translations.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> trans = translations.get(word);
        trans.add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        if(translations.containsKey(word)) {
            return translations.get(word);
        }
        return new ArrayList<>();
    }
    
    public void remove(String word) {
        translations.remove(word);
    }
    
}
