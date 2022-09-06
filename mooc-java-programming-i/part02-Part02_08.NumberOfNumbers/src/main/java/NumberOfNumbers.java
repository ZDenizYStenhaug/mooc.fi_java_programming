
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int c = 0;
        while (true) {
            System.out.println("Give a number:");
            i = scanner.nextInt();
            if (i == 0) {
                break;
            }
            c ++;
        }
        System.out.println("Number of numbers: " + c);
    }
}
