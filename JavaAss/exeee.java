import java.util.*;
public class exeee{
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the number of pushups: ");
			int push = scanner.nextInt();
			
			System.out.print("Enter the number of Situps: ");
			int sit = scanner.nextInt();
			
			System.out.print("Enter the number of Squats: ");
			int squat = scanner.nextInt();
			
			int total = push + sit + squat;
			System.out.println("The Total number of exercise that you have done today is: " + total);
			
			scanner.close();
	}
}