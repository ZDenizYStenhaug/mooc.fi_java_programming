
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while(true) {
            Integer num = Integer.valueOf(scanner.nextLine());
            if(num < 0) {
                break;
            }
            nums.add(num);
        }
        nums.stream()
                .filter(n -> (n <= 5 && n >= 1))
                .forEach(n -> System.out.println(n));
    }
}
