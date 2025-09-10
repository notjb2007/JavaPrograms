import java.util.Scanner;
public class poster{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the total posters: ");
	int tpos = scanner.nextInt();
	
	System.out.print("Enter the Removed posters: ");
	int rempos = scanner.nextInt();
	
	System.out.print("Enter the new posters: ");
	int nppos = scanner.nextInt();
	


	tpos = tpos - rempos;
	System.out.println("The Total posters before adding new posters: " + tpos);

	tpos = tpos + nppos;
	System.out.println("THe total number of poster are: " + tpos);

	scanner.close();
	
	
	
	
	
	}	
}