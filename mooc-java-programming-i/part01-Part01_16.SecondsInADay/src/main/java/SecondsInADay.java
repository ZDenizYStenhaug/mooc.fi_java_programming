
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(sc.nextLine());
        System.out.println(days * 24 * 60 * 60);
        // Write your program here

    }
}
