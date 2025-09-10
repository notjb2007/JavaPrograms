import java.util.Scanner;
public class donation{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("ENter the number of sponcers: ");
	int Spon = sc.nextInt();

	System.out.print("Enter the donations per sponcer: ");
	int donamt = sc.nextInt();

	System.out.print("Enter the extra sponcer: ");
	int ext = sc.nextInt();

	int total = Spon*donamt;
	System.out.println("The donations made by the sponcer are(before adding exrtra): " + total);

	total = total + ext*Spon;
	System.out.println("The final total donations are: " + total);

	sc.close();
	
	}	
}