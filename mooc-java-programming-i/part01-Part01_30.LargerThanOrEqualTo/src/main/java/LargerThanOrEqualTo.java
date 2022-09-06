
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int n1 = scan.nextInt();
        System.out.println("Give the second number:");
        int n2 = scan.nextInt();
        if(n1 > n2) {
            System.out.println("Greater number is: " + n1);
        } else if (n1 < n2) {
            System.out.println("Greater number is: " + n2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
