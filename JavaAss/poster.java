import java.util.Scanner;
public class poster{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENter the total number of poster: ");
		int total = scanner.nextInt();
		System.out.print("Enter the number of poster to be removed: ");
		int removed = scanner.nextInt();
		System.out.print("Enter the number of new poster to be added: ");
		int neww = scanner.nextInt();
		
		total = total - removed;
		total = total + neww;
		System.out.println("The final count of the updated stock is: " + total);
		
		scanner.close();
	}
}

