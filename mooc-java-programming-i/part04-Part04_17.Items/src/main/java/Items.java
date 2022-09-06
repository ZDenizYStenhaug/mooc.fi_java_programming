
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Name:");
            String name = sc.nextLine();
            if(name.isEmpty()) {
                break;
            }
            Item item = new Item(name);
            items.add(item);
        }
        for(Item i : items) {
            System.out.println(i);
        }
    }
}
