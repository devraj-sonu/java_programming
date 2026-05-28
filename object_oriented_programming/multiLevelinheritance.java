package object_oriented_programming;

public class multiLevelinheritance {
    public static void main(String[]args) {
        Dog bobby = new Dog();
        bobby.eat();
        bobby.legs = 4;
        System.out.println(bobby.legs);
    }
}

class animal {
    String color;
    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammals extends animal{
    int legs;
}

class Dog extends Mammals {
    String breed;
}