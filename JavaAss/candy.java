import java.util.Scanner;
public class candy{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENter the number of students: ");
		int stude = scanner.nextInt();
		
		System.out.print("ENter the number of PackOfCandies: ");
		int POC = scanner.nextInt();
		System.out.print("ENter the number of candyPerPack: ");
		int COP = scanner.nextInt();
		
		System.out.print("ENter the number of extracandy: ");
		int extra = scanner.nextInt();
		
		int totalcandy = (POC * COP) + extra;
		int avg = totalcandy / stude;
		
		System.out.println("The Total number of candy: " + totalcandy);
		System.out.println("Average Distribution of candy among the students are: " + avg);
		
		scanner.close();
	}
}