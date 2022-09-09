
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println(date);
        SimpleDate newDate = date.afterNumberOfDays(7);
        System.out.println(newDate);
        
    }
}
