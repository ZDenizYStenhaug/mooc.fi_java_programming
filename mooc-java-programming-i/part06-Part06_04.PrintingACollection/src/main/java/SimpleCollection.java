
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if(elements.size() == 0) {
            return "The collection " + name + " is empty.";
        }
        String str = "The collection " + name + " has " + elements.size();
        if(elements.size() == 1) {
            str += " element:";
        } else {
            str += " elements:";

        }
        for (String s : elements) {
            str += "\n" + s;
        }
        return str;
    }
}
