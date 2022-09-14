
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 100;
        int first = 0;
        int second = 0;
        
        
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] values = input.split(" ");
            int val = Integer.valueOf(values[1]);
            if(val < 0) {
                continue;
            }
            String command = values[0];
            if(command.equals("add")) {
                if(first + val > max) {
                    first = max;
                } else {
                    first += val;
                }
            } else if(command.equals("move")) {
                if(val > first) {
                    second = first;
                    first = 0;
                } else {
                    first -= val;
                    second += val;
                }
                if(second > max) {
                    second = max;
                }
            } else if (command.equals("remove")) {
                if(val > second) {
                    second = 0;
                } else {
                    second -= val;
                }
            }
         }
    }
}
