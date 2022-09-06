
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a string:");
        String s = sc.nextLine();
        System.out.println("Give an integer:");
        int i = Integer.valueOf(sc.nextLine());
        System.out.println("Give a double:");
        double d = Double.valueOf(sc.nextLine());
        System.out.println("Give a boolean:");
        boolean b = Boolean.valueOf(sc.nextLine());
        System.out.println("You gave the string " + s);
        System.out.println("You gave the integer " + i);
        System.out.println("You gave the double " + d);
        System.out.println("You gave the boolean " + b);
        
        // Write your program here

    }
}
