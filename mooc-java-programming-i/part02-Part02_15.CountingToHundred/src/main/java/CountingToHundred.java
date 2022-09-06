
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        for (int i = s; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
