
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeBook gb = new GradeBook();
        UserInterface ui = new UserInterface(scanner, gb);
        ui.start();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
