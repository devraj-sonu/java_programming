package recursion_basic;

public class printXtopowerN {
    public static int printpower(int x,int n) {
        if(n == 0) {
            return 1;
        }
        int xnm1 = printpower(x,n-1);
        int xn = x * xnm1;
        return xn;

    }
    public static void main(String[]args) {
        int n = 2;
        int pow = 10;
        System.out.println(printpower(n,pow));
    }
}
