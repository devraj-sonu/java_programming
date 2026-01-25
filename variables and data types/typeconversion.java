import java.util.*;

public class typeconversion {
    public static void main(String args[]) {
        int a = 20;
        long b = a;
        // long a = 20;
        // int b = a;
        System.out.println(b);
        Scanner sc =  new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
        sc.close();
    }
}

//byte -> short -> int -> float -> long -> double
