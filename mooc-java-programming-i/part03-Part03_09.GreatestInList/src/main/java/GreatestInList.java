
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if(input > max) {
                max = input;
            }
            list.add(input);
        }
        
        System.out.println("");
        System.out.println("The greatest number: " + max);
        // implement finding the greatest number in the list here
    }
}
