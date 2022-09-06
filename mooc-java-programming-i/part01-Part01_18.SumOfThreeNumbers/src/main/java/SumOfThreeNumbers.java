
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int n1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int n2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int n3 = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (n1 + n2 + n3));
        // Write your program here

    }
}
