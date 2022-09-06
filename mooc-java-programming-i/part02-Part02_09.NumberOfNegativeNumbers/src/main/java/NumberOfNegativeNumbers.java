
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        int i;
        while (true) {
            System.out.println("Give a number:");
            i = scanner.nextInt();
            if (i == 0) {
                break;
            }
            if(i < 0) {
                c++;
            }
        }
        System.out.println("Number of negative numbers: " + c);

    }
}
