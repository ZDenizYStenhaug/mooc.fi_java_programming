
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name of the file:");
        String str = scanner.nextLine();
        try {
            Scanner rd = new Scanner(Paths.get(str));
            while(rd.hasNextLine()) {
                String[] d = rd.nextLine().split(",");
                if (Integer.valueOf(d[1]) == 1) {
                    System.out.println(d[0] + ", age: " + d[1] + " year");
                } else {
                    System.out.println(d[0] + ", age: " + d[1] + " years");
                }
            }
        } catch (Exception e) {
            
        }

    }
}
