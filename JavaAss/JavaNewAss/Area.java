import java.util.*;
public class Area {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Find the Area for the Shapes: ");
        System.out.println("1. Area of Square");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Circle");

        System.out.print("Enter the Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the Side of Square: ");
                float side = scanner.nextFloat();
                float area = side * side;
                System.out.print("Area of the Square is: " + area);
                break;
            
                case 2:
                System.out.print("Enter the length of rectangle: ");
                float length = scanner.nextFloat();
                System.out.print("Enter the width of rectangle: ");
                float width = scanner.nextFloat();
                float area1 = length * width;
                System.out.print("Area of the Rectangle is: " + area1);
                break;
            
            case 3:
                System.out.print("Enter the radius of the Circle: ");
                float radius = scanner.nextFloat();
                double area3 = Math.PI * (radius * radius);
                System.out.print("Area of the Circle is: " + area3);
                break;

            default:
                System.out.println("Enter the Correct Choice!");
                break;
        }
    }
}
