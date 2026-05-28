package object_oriented_programming;

public class getterAndSetter {
    public static void main(String[]args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.settip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());


    }

}
class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }
    void setColor(String newcolor) {
        color = newcolor;
    }

    void settip(int tip) {
        this.tip = tip;
    }
}

