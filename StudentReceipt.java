public class StudentReceipt {
    public static void main(String[] args) {
        
        
        String studentName = "David James";
        int registrationNumber = 20261025;
        int age = 18;
        String course = "Java Programming";
        double courseFee = 150000.50;
        char genderInitial = 'M';
        int numberOfCourses = 3;
        boolean registered = true;
        char symbol = '\u20A6';

       
        System.out.print("================================\n");
        System.out.print("    STUDENT REGISTRATION RECEIPT\n");
        System.out.print("================================\n\n");

        
        System.out.printf("Student Name: %s%n", studentName);
        System.out.printf("Registration Number: %,d%n", registrationNumber);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Course: \"%s\"%n", course);
		System.out.printf("Course Fee: \u20A6%,.2f%n", courseFee);
        System.out.printf("Gender Initial: %c%n", genderInitial);
        System.out.printf("Number of Courses: %d%n", numberOfCourses);
        System.out.printf("Registered: %b%n", registered);

        
        System.out.println("\nThank you for registering!");
    }
}