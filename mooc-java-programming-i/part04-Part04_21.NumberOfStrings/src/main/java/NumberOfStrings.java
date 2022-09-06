
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while(true) {
            String s = sc.nextLine();
            if(s.equals("end")) {
                break;
            }
            counter ++;
        }
        System.out.println(counter);
    }
}
