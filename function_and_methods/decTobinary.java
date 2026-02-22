package function_and_methods;

public class decTobinary {
    public static void dectobin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n>0) {
           int rem = n % 2;
           binNum = binNum + (rem*(int)Math.pow(10,pow));
           pow++;
           n = n/2;
        }
        System.out.println("Binary form of the number "+ myNum + "=" + binNum);
    }
    public static void main(String[]args) {
        dectobin(7);
    } 
}
