
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> nums = new ArrayList();
        while (true) {
            int num = scanner.nextInt();
            if(num == 9999) {
                break;
            }
            if(num < min) {
                min = num;
            }
            nums.add(num);
        }
        System.out.println("Smallest number: " + min);
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == min) {
                System.out.println("Found at index: " + i);
            }
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
