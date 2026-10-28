import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your full Name: ");
		String fullName = scan.nextLine();
		
		System.out.print("Enter your gender:");
		String gender = scan.next();
		System.out.print("How old are you? ");
		int age = scan.nextInt();
		
		
		System.out.println("----------------------------------------------");
		
		System.out.printf("Hello %s, how are you today?%n",fullName);
		System.out.printf("Oh %s, you are a %s%n", fullName,gender);
		System.out.printf("%s you are %d years old%n",fullName,age);
		
		System.out.println("----------------------------------------------");
	}
}