import java.util.Scanner;
public class electricity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Units: ");
        int units = scanner.nextInt();
        if(units <= 50){
            int amount = units * 10;
            System.out.println("Your Amount for the Unit " + units + " is rupees: " + amount);
        }
        else if(units > 50 && units <=150){
            int amount =units * 20;
            System.out.println("Your Amount for the Unit " + units + " is rupees: " + amount);
        }
        else{
            int amount = units * 100;
            System.out.println("Your Amount for the Unit " + units + " is rupees: " + amount);
        }

        scanner.close();
    }
}
