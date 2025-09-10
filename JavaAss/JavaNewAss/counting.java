import java.util.*;
public class counting {
    public static void main(String[] args){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.err.println("The Number of digits are: " + count);

        scanner.close();
    }
}
