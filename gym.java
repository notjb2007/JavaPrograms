import java.util.Scanner;
public class gym{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("ENter the number of Pushups: ");
	int push = sc.nextInt();
	
	System.out.print("ENter the number of situps: ");
	int sit = sc.nextInt();
	
	System.out.print("ENter the number of squats: ");
	int squ = sc.nextInt();
	

	int total = push + sit + squ;
	System.out.println("Your Total Exercise count that you have done today is: " + total);

	sc.close();
	
	
	}
}