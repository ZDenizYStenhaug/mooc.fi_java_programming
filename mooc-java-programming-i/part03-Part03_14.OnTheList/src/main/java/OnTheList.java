
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String s = scanner.nextLine();
        if(list.contains(s)) {
            System.out.println(s + " was found!");
        } else {
            System.out.println(s + " was not found!");
        }
    }
}
