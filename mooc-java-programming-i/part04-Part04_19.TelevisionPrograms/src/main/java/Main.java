import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Name: ");
            String name = sc.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int dur = Integer.valueOf(sc.nextLine()); 
            TelevisionProgram tp = new TelevisionProgram(name, dur);
            programs.add(tp);
            
        }
        System.out.println("Program's maximum duration? ");
        int max = Integer.valueOf(sc.nextLine());
        for(TelevisionProgram tp : programs) {
            if(tp.getDuration() <= max) {
                System.out.println(tp);
            }
        }
    }
}
