
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int to = scanner.nextInt();
        System.out.println("Where from?");
        int from = scanner.nextInt();
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }
}
