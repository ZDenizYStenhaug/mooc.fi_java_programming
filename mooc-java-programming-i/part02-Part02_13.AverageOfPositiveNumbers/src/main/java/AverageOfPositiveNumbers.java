
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int c = 0;
        while(true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n > 0) {
                s += n;
                c ++;
            }
        }
        if (c < 1) {
            System.out.println("Cannot calculate the average.");
        } else {
            System.out.println(s * 1.0 / c);
        }
    }
}
