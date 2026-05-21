package bitManipulation;

public class clearITHbit {
    public static int clearithBit(int n, int i) {
        int bitMask = ~(i<<1);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearithBit(10, 1));
    }
}
