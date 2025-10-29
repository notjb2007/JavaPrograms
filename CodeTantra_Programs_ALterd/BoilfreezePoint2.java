import java.util.Scanner;

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

class Water extends Liquid {
    public Water(double boilingPoint, double freezingPoint) {
        super(boilingPoint, freezingPoint);
    }

    public void evaporate() {
        System.out.println("Water is evaporating at " + boilingPoint + " degrees Celsius.");
    }

    public void freeze() {
        System.out.println("Water is freezing at " + freezingPoint + " degrees Celsius.");
    }
}

public class BoilfreezePoint2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double boilingPoint = scanner.nextDouble();
        double freezingPoint = scanner.nextDouble();
        Water water = new Water(boilingPoint, freezingPoint);
        System.out.println("Boiling Point: " + water.boilingPoint + " degrees Celsius.");
        System.out.println("Freezing Point: " + water.freezingPoint + " degrees Celsius.");
        water.evaporate();
        water.freeze();
        scanner.close();
    }
}
