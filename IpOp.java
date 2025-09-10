import java.util.Scanner;
class IpOp{
    public static void main(String[] args) {
        int id;
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextInt();
        System.out.println("Id Of the student: " + id);
        
        String name = scanner.nextLine();
        System.out.println("\nName of the student: " + name);
    }
}