package bitManipulation;
//THe idea  to use XOR operaators to swap two numbers by their property ?
public class questionTwo {
    public static void main(String[]args) {
        int x = 3,  y =4;
        System.out.println("Before Swap : X = " + x + " and y =" + y);
        //swap using XOR operation
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap : X = "+ x + " and y =" + y);
    }
}
