package object_oriented_programming;

public class abstructClasses {
    public static void main(String[]args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        System.out.println(h.color);
    }
}

abstract class Animal {
    String color;
    Animal() {
        color = "brown";
    }
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void ChangeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}