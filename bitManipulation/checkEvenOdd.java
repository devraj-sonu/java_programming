package bitManipulation;

public class checkEvenOdd {
    public static void oddOReven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {
        oddOReven(19);
        oddOReven(20);
        oddOReven(21);
    }
}
