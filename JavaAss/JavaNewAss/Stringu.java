import java.util.Scanner;
public class Stringu{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		boolean b = true;
		
		for(int i = 0; i<str.length() / 2; i++){
			if(str.charAt(i)!=str.charAt(str.length() - 1 - i)){
				b = false;
				break;
			}
		}
		if(b)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not palindrome");
	}
}