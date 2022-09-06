
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        while (true) {
            String s = scanner.nextLine();
            if(s.isEmpty()) {
                break;
            }
            String[] st = s.split(",");
            int age = Integer.valueOf(st[1]);
            if (age > min) {
                min = age;
            }
        }
        System.out.println("Age of the oldest: " + min);
    }
}
