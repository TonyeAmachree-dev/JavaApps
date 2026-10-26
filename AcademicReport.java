public class AcademicReport {
    public static void main(String[] args) {
        String name = "Tonye";
        int age = 16;
        double score = 85.75;
        char grade = 'A';
        boolean passed = true;

        System.out.printf("STUDENT ACADEMIC REPORT%n");
        System.out.printf("%n");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Score: %.2f%n", score);
        System.out.printf("Grade: %c%n", grade);
        System.out.printf("Passed: %b%n", passed);
    }
}