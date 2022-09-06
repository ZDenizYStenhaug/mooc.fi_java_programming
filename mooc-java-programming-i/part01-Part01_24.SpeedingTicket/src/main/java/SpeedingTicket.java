
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give speed:");
        int speed = sc.nextInt();
        if(speed > 120)
            System.out.println("Speeding ticket!");
        
        // Write your program here. 
    }
}
