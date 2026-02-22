package function_and_methods;

import java.util.Scanner;
public class findProduct {
    public static int multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        int product = a * b;
        sc.close();
        return product;   
    }
    public static void main(String[]args) {
        int prod = multiply();
        System.out.println("The product is : " +prod);
    
    }
    
}
