
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fn = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int count = 0;
        int wins = 0;
        int losses = 0;
        try {
            Scanner rd = new Scanner(Paths.get(fn));
            while (rd.hasNextLine()) {
                String[] d = rd.nextLine().split(",");

                if(d[0].equals(team)) {
                    count ++;
                    if(Integer.valueOf(d[2]) > Integer.valueOf(d[3])) {
                        wins ++;
                    } else {
                        losses ++;
                    }
                } else if (d[1].equals(team)) {
                    count++;
                    if(Integer.valueOf(d[3]) > Integer.valueOf(d[2])) {
                        wins ++;
                    } else {
                        losses ++;
                    }
                }
            }
       
        } catch(Exception e) {
            
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
