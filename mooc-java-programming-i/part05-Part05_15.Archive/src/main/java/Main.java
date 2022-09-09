
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String id = sc.nextLine();
            if(id.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = sc.nextLine();
            if(name.isEmpty()) {
                break;
            }
            Item it = new Item(name, id);
            if(!items.contains(it)) {
                items.add(it);

            }
        }
        System.out.println("==Items==");
        
        for(Item it : items) {
            System.out.println(it);
        }
    }
}

