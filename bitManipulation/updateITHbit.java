package bitManipulation;

public class updateITHbit {
    public static int clearithbit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int setithbit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int updateithBit(int n, int i, int newbit) {
        if(newbit == 0) {
            return clearithbit(n, i);
        } else {
            return setithbit(n, i);
        }
    }
    public static void main(String[]args) {
        System.out.println(updateithBit(10,3,1));
    }
}
