package recursion_basic;

public class printXtopowerNoptimized {//O(logn)
    public static int optimizedPower(int a, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPow = optimizedPower(a, n/2);
        int halfpowerSquare = halfPow*halfPow;
        // if n is a odd number
        if(n%2!=0) {
            halfpowerSquare = a * halfpowerSquare;
        }
        return halfpowerSquare;
    }
    public static void main(String[]args) {
        int a = 2;
        int n = 10;
        System.out.println(optimizedPower(a,n));
    }
}
