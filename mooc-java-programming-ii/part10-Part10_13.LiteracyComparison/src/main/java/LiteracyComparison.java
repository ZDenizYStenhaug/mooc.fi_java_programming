
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String fn = "literacy.csv";
        ArrayList<Literacy> lit = new ArrayList<>();
        try {
            Scanner reader = new Scanner(Paths.get(fn));
            while(reader.hasNextLine()) {
                String[] row = reader.nextLine().split(",");
                
                lit.add(new Literacy(row[3], row[2].substring(0, row[2].length() - 4).trim(), Integer.valueOf(row[4]), Double.valueOf(row[5])));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        lit.stream().sorted().forEach(l -> System.out.println(l));
    }
}
