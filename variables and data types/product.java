import java.util.*;

public class product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a : ");
        int a = sc.nextInt();
        System.out.println("Enter the number b :");
        int b = sc.nextInt();
        int multiple = a*b;
        System.out.println(multiple);
        sc.close();
    }
}
