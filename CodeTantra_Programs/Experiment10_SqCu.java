import java.util.Scanner;

// The NumberTransformer interface
interface NumberTransformer {
    void transform(int num);
}

// SquareTransformer class
class SquareTransformer implements NumberTransformer {
    public void transform(int num) {
        int square = num * num;
        System.out.println("Square: " + square);
    }
}

// CubeTransformer class
class CubeTransformer implements NumberTransformer {
    public void transform(int num) {
        int cube = num * num * num;
        System.out.println("Cube: " + cube);
    }
}

// Main class
public class Experiment10_SqCu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        NumberTransformer transformer;

        transformer = new SquareTransformer();
        transformer.transform(input);

        transformer = new CubeTransformer();
        transformer.transform(input);
    }
}
