package function_and_methods;

import java.util.Scanner;
public class factorialN {
    public static int Factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number to calculate Factorial: ");
        int number = sc.nextInt();
        int calculateFactor = Factorial(number);
        System.out.println("The factorial of the number is : "+calculateFactor);
        sc.close();
    }
}
