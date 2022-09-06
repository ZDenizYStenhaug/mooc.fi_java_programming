
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = 0;
        String name = "";
        int sum = 0;
        int count = 0;
        while (true) {
            String s = scanner.nextLine();
            if(s.isEmpty()) {
                break;
            }
            String[] st = s.split(",");
            if (st[0].length() > len) {
                name = st[0];
                len = st[0].length();
            }
            sum += Integer.valueOf(st[1]);
            count ++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (sum * 1.0 / count));
    }
}
