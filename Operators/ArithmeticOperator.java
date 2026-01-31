package operators;

import java.util.Scanner;

public class Arithmeticoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 10;
        int B = 20;

        System.out.println("Add = " + (A+B));
        System.out.println("Sub = " + (A-B));
        sc.close();
    }
}
