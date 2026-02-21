package function_and_methods;

import java.util.Scanner;
public class syntaxWithparameter {

    public static void printHelloworld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void /*int*/calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
        //return sum;
        
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int sum = calculateSum(a,b);
        calculateSum(a,b);
        //System.out.println("Sum is : " + sum);
        sc.close();
    }
    
}
