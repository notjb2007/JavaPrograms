import java.util.Scanner;

abstract class Animal {
    String name, color;
    int age;
    public Animal(String n, String c, int a) {
        name = n; color = c; age = a;
    }
    public void eat() {
        System.out.println(name + " is eating");
    }
    abstract void sleep();
}

class Dog extends Animal {
    String breed;
    public Dog(String n, String c, int a, String b) {
        super(n, c, a); breed = b;
    }
    public void bark() {
        System.out.println(name + " is barking");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

public class Animalclass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String color = scanner.nextLine();
        int age = scanner.nextInt(); scanner.nextLine();
        String breed = scanner.nextLine();
        Dog dog = new Dog(name, color, age, breed);
        System.out.println("Dog Details:");
        System.out.println("Name: " + dog.name);
        System.out.println("Color: " + dog.color);
        System.out.println("Age: " + dog.age);
        System.out.println("Breed: " + dog.breed);
        dog.eat();
        dog.bark();
        dog.sleep();
        scanner.close();
    }
}
