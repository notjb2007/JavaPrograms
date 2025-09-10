import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("\nATM Machine");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Check");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter your amount: ");
                int amount = sc.nextInt();
                if (amount > 0) {
                    balance += amount;  
                    System.out.println("Amount deposited successfully!");
                } else {
                    System.out.println("Invalid deposit amount!");
                }

            } else if (choice == 2) {
                System.out.print("Enter your amount for withdrawal: ");
                int with = sc.nextInt();
                if (with > 0 && with <= balance) {
                    balance -= with;
                    System.out.println("Amount withdrawn successfully!");
                } else {
                    System.out.println("Insufficient balance or invalid amount!");
                }

            } else if (choice == 3) {
                System.out.println("Your Current Balance is: ₹" + balance);

            } else if (choice == 4) {
                System.out.println("Thanks For Using ATM!");
                break;

            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        
        sc.close();
    }
}
