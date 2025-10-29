import java.util.Scanner;

// Abstract superclass
abstract class Liquid {
    double boilingPoint;
    double freezingPoint;

    public Liquid(double boilingPoint, double freezingPoint) {
        this.boilingPoint = boilingPoint;
        this.freezingPoint = freezingPoint;
    }

    abstract void evaporate();
    abstract void freeze();
}

// Subclass for Water
class Water extends Liquid {
    public Water(double boilingPoint, double freezingPoint) {
        super(boilingPoint, freezingPoint);
    }

    @Override
    void evaporate() {
        System.out.println("Water is evaporating at " + boilingPoint + " degrees Celsius.");
    }

    @Override
    void freeze() {
        System.out.println("Water is freezing at " + freezingPoint + " degrees Celsius.");
    }
}

// Main class
public class Experiment1_Liquid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double boilingPoint = sc.nextDouble();
        double freezingPoint = sc.nextDouble();
        Water w = new Water(boilingPoint, freezingPoint);

        System.out.println("Boiling Point: " + boilingPoint + " degrees Celsius.");
        System.out.println("Freezing Point: " + freezingPoint + " degrees Celsius.");
        w.evaporate();
        w.freeze();
    }
}
