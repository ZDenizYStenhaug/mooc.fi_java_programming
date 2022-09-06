
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        String name = "";
        while (true) {
            String s = scanner.nextLine();
            if(s.isEmpty()) {
                break;
            }
            String[] st = s.split(",");
            int age = Integer.valueOf(st[1]);
            if (age > min) {
                min = age;
                name = st[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
