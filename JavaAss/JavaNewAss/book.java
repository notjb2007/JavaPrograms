import java.util.Scanner;
public class book{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Title of the book: ");
        String title = sc.nextLine();
        
        String book1 = "Wings Of Fire";
        String author = "APJ Abdul Kalam";

        String book2 = "Theory of Gravity";
        String author2 = "Stephan Hawking";
        
        if(title.equals(book1)){
            System.out.println("The Book Is currently Not avaiable, Try Later");
        }
        else if(title.equals(book2)){
            System.out.println("The Book is Available");
        }
        else{
            System.out.println("Enter A valid Book Name");
        }
    }
}