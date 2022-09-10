
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JokeManager manager = new JokeManager();
        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}
