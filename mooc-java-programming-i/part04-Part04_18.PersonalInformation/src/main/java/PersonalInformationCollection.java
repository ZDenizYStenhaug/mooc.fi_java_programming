
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("First name: ");
            String firstName = sc.nextLine();
            if(firstName.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String lastName = sc.nextLine();
            
            System.out.print("Itentification number: ");
            String id = sc.nextLine();
            PersonalInformation pi = new PersonalInformation(firstName, lastName, id);
            infoCollection.add(pi);
        }
        System.out.println("");
        for (PersonalInformation pi : infoCollection) {
            System.out.println(pi.getFirstName() + " " + pi.getLastName());
        }
    }
}
