
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int n1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int n2 = Integer.valueOf(scanner.nextLine());
        // write your program here
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    }
}
