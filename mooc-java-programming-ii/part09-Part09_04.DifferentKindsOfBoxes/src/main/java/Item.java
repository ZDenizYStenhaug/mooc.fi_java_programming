
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof Item)) {
            return false;
        }
        Item i = (Item) o;
        if(i.name.equals(this.name)) {
            return true;
        }
        return false;
    }
    
    public int hashCode() {
        return name.hashCode();
    }

}
