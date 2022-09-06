
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int c = 0;

        while (true) {
            System.out.println("Give a number:");
            int n = scanner.nextInt();
            if(n == 0) {
                System.out.println("Average of the numbers: " + s * 1.0 / c * 1.0);
                break;
            }
            s += n;
            c ++;
        }
    }
}
