package If_Else;
import java.util.Scanner;

public class Biodata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println(" ");
System.out.println("         please Enter your personal details for Bio-data. ");
System.out.println(" ");

        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your Qualification:");
        String Qualification = scanner.nextLine();

        System.out.print("Enter your occupation:");
        String occupation = scanner.nextLine();

        System.out.print("Enter your hobbies:");
        String hobbies = scanner.nextLine();

        System.out.print("Enter your contact number:");
        String contactNumber = scanner.nextLine();

        System.out.println("\n*******************************************");
        System.out.println("__________________ BIO-DATA ___________________");
        System.out.println(" ");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " +Qualification);
        System.out.println("Occupation: " + occupation);
        System.out.println("Hobbies: " + hobbies);
        System.out.println("Contact Number: " + contactNumber);

        System.out.println("*******************************************\n");
        System.out.println("\n*******************************************");
    }
}
