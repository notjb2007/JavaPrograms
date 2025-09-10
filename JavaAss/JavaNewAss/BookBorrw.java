import java.util.Scanner;

public class BookBorrw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = "Brief history of Time";
        String author = "Stephen hawking book";
        boolean available = true;

        System.out.println("Book: " + title + " by " + author);

        System.out.println("Do you want to borrow this book? (yes/no): ");
        String choice = sc.nextLine();

        if ("yes") {
            if (available == true) {
                System.out.println("The book is available. You can borrow it.");
                available = false;
            } else if (available == false) {
                System.out.println("Sorry, the book is already borrowed.");
            }
        } else if (choice.equalsIgnoreCase("no")) {
            System.out.println("You chose not to borrow the book.");
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
