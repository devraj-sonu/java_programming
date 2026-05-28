package object_oriented_programming;

public class typesOfconstructor {
    public static void main(String[]args) {
        Student s1 = new Student();
        Student s2 = new Student("Devraj");
        Student s3 = new Student(123);
        System.out.println(s1.name);
        System.out.println(s2.roll);
        System.out.println(s3.name);
    }
}
class Student {
    String name;
    int roll;
    //non parameterized constructor or default constructor
    Student() {
        System.out.println("Constructor is called");
    }
    //parameterized constructor
    Student(String name) {
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }
}

