
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> nums = new ArrayList<>();
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            nums.add(input);
        }
        double avgPos = nums.stream().mapToInt(s -> Integer.valueOf(s))
                .filter(n -> n > 0)
                .average()
                .getAsDouble();
        double avgNeg = nums.stream().mapToInt(s -> Integer.valueOf(s))
                .filter(n -> n < 0)
                .average()
                .getAsDouble();
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        if(choice.equals("n")) {
            System.out.println("average of the negative numbers: " + avgNeg);
        } else {
            System.out.println("average of the positive numbers: " + avgPos);
        }


    }
}
