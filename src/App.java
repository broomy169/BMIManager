import java.util.Scanner;

/**
 * Created by jc258876 on 16/03/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("BMI Manager");
        Patient patient = new Patient();
        running: while (true) {
            System.out.println("PLease select from the " +
                    "following menu options:\n" +
                    "\t1. Add new patient\n" +
                    "\t2. View Patient\n" +
                    "\t3. Exit\n");

            System.out.print("Enter choice:");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter name:");
                    String name = scanner.nextLine();
                    patient.setName(name);
                    System.out.print("Enter age:");
                    int age = scanner.nextInt();
                    patient.setAge(age);
                    System.out.print("Enter weight:");
                    double weight = scanner.nextDouble();
                    System.out.print("Enter height:");
                    double height = scanner.nextDouble();
                    patient.setDetails(weight, height);
                    break;
                }
                case 2: {
                    System.out.println(String.format("\nName: %s Age: %d BMI: %f\n",
                            patient.getName(),
                            patient.getAge(),
                            patient.getBMI())
                    );
                    break;
                }
                case 3: {
                    System.out.println("Good bye!");
                    break running;
                }
            }
        }
    }
}