import java.util.*;
public class YearUtility{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 400 == 0) || year % 100 != 0){
            System.out.println("The Year " + year + " Is a leap year");
        }
        else{
            System.out.println("It is not Leap Year");
        }

        scanner.close();
    }
}