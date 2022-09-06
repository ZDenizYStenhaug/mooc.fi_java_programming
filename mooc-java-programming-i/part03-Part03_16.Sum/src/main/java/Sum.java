
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i ++) {
            sum += numbers.get(i);
        }
        return sum;
    }

}
