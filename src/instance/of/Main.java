package instance.of;
class Employee {
    // Base class
}

class Student extends Employee {
    // Student is a subclass of Person
}

public class Main {
    public static void main(String[] args) {
        Employee p1 = new Student();  // Upcasting Student to Person
        Employee p2 = new Employee();   // Just a Person

        // Check if p1 is a Student
        if (p1 instanceof Student) {
            System.out.println("p1 is a Student");
        }

        // Check if p2 is a Student
        if (p2 instanceof Student) {
            System.out.println("p2 is a Student");
        } else {
            System.out.println("p2 is NOT a Student");
        }
    }
}