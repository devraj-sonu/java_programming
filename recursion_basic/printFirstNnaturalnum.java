package recursion_basic;

public class printFirstNnaturalnum {
    public static int sum(int n) {
        if(n==1) {
            return 1;
        }
        int plus = n + sum(n-1);
        return plus;
    }
    public static void main(String[]args) {
        int n=5;
        System.out.println(sum(n));
    }
}
