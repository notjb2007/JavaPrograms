import java.util.Scanner;

class Customer {
    int customerId;
    String customerName;
    int unitsConsumed;
}

class ElectricityBill extends Customer {
    int billAmount;

    int calculateBill() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + (unitsConsumed - 100) * 7;
        } else {
            billAmount = (100 * 5) + (200 * 7) + (unitsConsumed - 300) * 10;
        }
        return billAmount;
    }

    void displayDetails() {
        System.out.println("ID of the Customer: " + customerId);
        System.out.println("Name of the Customer: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Final Bill Amount: ₹" + billAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElectricityBill eb = new ElectricityBill();

        System.out.print("Enter Your ID: ");
        eb.customerId = scanner.nextInt();

        System.out.print("Enter Your Name: ");
        eb.customerName = scanner.next();

        System.out.print("Enter the Number of Units: ");
        eb.unitsConsumed = scanner.nextInt();

        eb.calculateBill();
        eb.displayDetails();

        scanner.close();
    }
}
