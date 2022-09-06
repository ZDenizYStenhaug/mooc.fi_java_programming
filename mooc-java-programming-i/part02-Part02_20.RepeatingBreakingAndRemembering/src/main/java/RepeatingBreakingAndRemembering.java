
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int s = 0;
        int c = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int n = scanner.nextInt();
            if(n == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (n % 2 == 0) {
                even ++;
            } else {
                odd ++;
            }
            s += n;
            c ++;
        }
        System.out.println("Sum: " + s);
        System.out.println("Numbers: " + c);
        System.out.println("Average: " + s * 1.0 / c);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
