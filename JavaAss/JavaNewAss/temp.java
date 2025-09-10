import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahren");
        System.out.println("3. Fahren to Celsius");

        System.out.print("ENter your choice: ");
        int choice = sc.nextInt();

        double temp, Converted;
        switch (choice) {
            case 1:
                System.out.print("ENter temperatur in C: ");
                temp = sc.nextDouble();
                Converted = (temp * 9/5) + 32;
                System.out.println("Celcius: " + temp + " Fahrenheit: " + Converted);
                break;
            
            case 2:
                System.out.print("ENter temperatur in F: ");
                temp = sc.nextDouble();
                Converted = (temp - 32) * 5 / 9;
                System.out.println("Celcius: " + temp + " Fahrenheit" + Converted);
                break;
        
            default:
                System.out.println("ENter a valid Choice!.");
                break;
        }
        sc.close();
    }
}
