import java.util.Scanner;

// Abstract class Animal
abstract class Animal {
    String name;
    String color;
    int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    abstract void sleep();
}

// Dog class extending Animal
class Dog extends Animal {
    String breed;

    public Dog(String name, String color, int age, String breed) {
        super(name, color, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    @Override
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Main class
public class Experiment2_Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String color = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String breed = sc.nextLine();

        Dog d = new Dog(name, color, age, breed);

        System.out.println("Dog Details:");
        System.out.println("Name: " + d.name);
        System.out.println("Color: " + d.color);
        System.out.println("Age: " + d.age);
        System.out.println("Breed: " + d.breed);
        d.eat();
        d.bark();
        d.sleep();
    }
}
