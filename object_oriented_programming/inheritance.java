package object_oriented_programming;

public class inheritance {
    public static void main(String[]args) {
        Fish shark = new Fish();
        shark.eat();
    } 
}


//base class
class animal {
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breathe () {
        System.out.println("breathes");
    }
}

//derived class / sub class
class Fish extends animal {
    int fins;

    void swim() {
        System.out.println("It can also swim in water");
    }
}
