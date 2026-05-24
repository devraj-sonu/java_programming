package bitManipulation;

public class clearRangeofBits {
    public static int clearrangeofbits(int n, int st, int end) {
        int a = (~0)<<end+1;
        int b = (1<<st)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[]args) {
        System.out.println(clearrangeofbits(10, 2, 4));

    }
}
