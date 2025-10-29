interface NumberTransformer {
    void transform(int number);
}

class SquareTransformer implements NumberTransformer {
    public void transform(int number) {
        int square = number * number;
        System.out.println("Square: " + square);
    }
}

class CubeTransformer implements NumberTransformer {
    public void transform(int number) {
        int cube = number * number * number;
        System.out.println("Cube: " + cube);
    }
}

public class NumberTransform10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number ");
        int inputNumber = scanner.nextInt();
        NumberTransformer squareTransformer = new SquareTransformer();
        squareTransformer.transform(inputNumber);
        NumberTransformer cubeTransformer = new CubeTransformer();
        cubeTransformer.transform(inputNumber);
        scanner.close();
    }
}
