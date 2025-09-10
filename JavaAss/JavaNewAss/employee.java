import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grossSalary, tax = 0, netSal;

        System.out.print("Enter Gross Salary: ");
        grossSalary = sc.nextDouble();

        if (grossSalary <= 250000) {
            tax = 0;
        } 
        else if (grossSalary <= 500000) {
            tax = grossSalary * 0.05;
        } 
        else if (grossSalary <= 1000000) {
            tax = grossSalary * 0.20;
        } 
        else {
            tax = grossSalary * 0.30;
        }

        netSal = grossSalary - tax;

        System.out.println("Salary Details");
        System.out.println("Gross Salary: "  + grossSalary);
        System.out.println("Tax Deducted: " + tax);
        System.out.println("Net Salary: " + netSal);
    }
}
