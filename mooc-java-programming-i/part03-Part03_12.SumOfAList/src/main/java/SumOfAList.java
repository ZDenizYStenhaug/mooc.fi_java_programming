
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            sum += input;
            list.add(input);
        }

        System.out.println("");
        System.out.println("Sum: " + sum);
        // toteuta listan lukujen summan laskeminen tänne
    }
}
