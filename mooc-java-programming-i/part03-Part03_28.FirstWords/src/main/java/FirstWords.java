
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if(s.isEmpty()) {
                break;
            }
            String[] st = s.split(" ");
            
            System.out.println(st[0]);
        }
    }
}
