
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if(s.isEmpty()) {
                break;
            }
            String[] st = s.split(" ");
            for (int i = 0; i < st.length; i++) {
                if(st[i].contains("av")){
                    System.out.println(st[i]);
                }
            }
        }

    }
}
