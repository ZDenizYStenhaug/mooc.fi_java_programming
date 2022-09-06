
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = "Caput Draconis";
        String str = scan.nextLine();
        if(str.equals(pass)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
        // Write your program here 
    }
}
