
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int g = scan.nextInt();
        if(g < 0) {
            System.out.println("impossible!");
        } else if (g < 50) {
            System.out.println("failed");
        } else if (g < 60) {
            System.out.println("1");
        } else if (g < 70) {
            System.out.println("2");
        } else if (g < 80) {
            System.out.println("3");
        } else if (g < 90) {
            System.out.println("4");
        } else if (g <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
    }
}
