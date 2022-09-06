
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
       
        while (true) {
            System.out.println("Give a number:");

            int n = scanner.nextInt();
            if(n == 0) {
                System.out.println("Sum of the numbers: " + s);
                break;
            }
            s += n;
        }
    }
}
