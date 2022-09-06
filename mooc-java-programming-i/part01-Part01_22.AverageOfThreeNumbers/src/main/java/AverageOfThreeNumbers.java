
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int n1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int n2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int n3 = Integer.valueOf(scanner.nextLine());
        // write your program here
        System.out.println("The average is " + ((n1 * 1.0 + n2 * 1.0 + n3 * 1.0) / 3));
        // Write your program here

    }
}
