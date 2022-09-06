
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s = sc.nextLine();
            if(s.equals("end")) {
                break;
            }
            int num = Integer.valueOf(s);
            System.out.println(num * num * num);
        }
    }
}
