import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StudentSort {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Arun", 22));
        list.add(new Student("Bala", 20));
        list.add(new Student("Charan", 24));

        // Comparator for sorting by age
        Comparator<Student> sortByAge = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.age - s2.age;   // ascending by age
            }
        };

        Collections.sort(list, sortByAge);

        System.out.println("Sorted by age: " + list);
    }
}
