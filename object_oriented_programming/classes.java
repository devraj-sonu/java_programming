package object_oriented_programming;

public class classes {
    public static void main(String[]args) {
        Pen p1 = new Pen(); //create a pen object called P1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    //prop + function
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int math, int eng) {
        percentage = (phy + math + eng) / 3;
    }
}
