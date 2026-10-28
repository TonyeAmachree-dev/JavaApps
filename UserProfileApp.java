import java.util.Scanner;

public class UserProfileApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Please Enter Your Details ===");
        
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Email Address: ");
        String email = scanner.nextLine();

        System.out.print("Height (e.g., 5.9 ft or 175 cm): ");
        String height = scanner.nextLine();

        System.out.print("Eye Colour: ");
        String eyeColour = scanner.nextLine();

        scanner.close();

        System.out.println("\n");
        System.out.println("========================================");
        System.out.println("          USER PROFILE SUMMARY          ");
        System.out.println("========================================");
        System.out.printf(" %-15s : %s%n", "Full Name", fullName);
        System.out.printf(" %-15s : %s%n", "Address", address);
        System.out.printf(" %-15s : %s%n", "Phone Number", phoneNumber);
        System.out.printf(" %-15s : %s%n", "Email", email);
        System.out.printf(" %-15s : %s%n", "Height", height);
        System.out.printf(" %-15s : %s%n", "Eye Colour", eyeColour);
        System.out.println("========================================");
    }
}