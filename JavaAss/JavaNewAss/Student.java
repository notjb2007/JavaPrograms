import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Subject1 = 95;
        int Subject2 = 89;
        int Subject3 = 78;

        float average = (Subject1 + Subject2 + Subject3) / 3.0f;
        System.out.println("The Average Marks of 3 Subjects scored by the Student is: " + average);

        if(average < 0){
            System.out.println("The Average Cannot be zero, Give The correct Marks For Each Subjexts");
        }
        else if(average>0 && average <=50){
            System.out.println("Grade C");
        }
        else if(average>50 && average <=80){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade A");
        }

        scanner.close();
    }
}
