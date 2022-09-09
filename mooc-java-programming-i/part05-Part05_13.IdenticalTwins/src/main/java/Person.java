
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public boolean equals(Object comparable) {
        if(this == comparable) {
            return true;
        }
        if(!(comparable instanceof Person)) {
            return false;
        }
        Person comparableP = (Person) comparable;
        if(this.name == comparableP.name &&
                this.birthday.equals(comparableP.birthday) &&
                this.height == comparableP.height &&
                this.weight == comparableP.weight) {
            return true;
        }
        return false;
    }

    // implement an equals method here for checking the equality of objects
}
