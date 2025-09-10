import java.util.Scanner;
public class really{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENter the value for a: ");
		int a = scanner.nextInt();
		System.out.print("Enter the value for b: ");
		int b = scanner.nextInt();
		
		int c = a + b;
		System.out.println("The sum of a and b is: " + c);


		int d = a - b;
		System.out.println("The Difference between the two numbers are: " + d);

		int e = a * b;
		System.out.println("THe Product of two numbers are: " + e);

		

		int f = a / b;
		System.out.println("The division of integer and another integer is said to be a integer:(which is) " + f);

		
		System.out.println("ENter you name: ");
		String name = scanner.nextLine();
		// System.out.println("Hello " + " You are a Developer");

		
		
		scanner.close();
	}	
}