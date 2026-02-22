package patterns_2_advanced;

import java.util.Scanner;
public class invertHalfPyraNum {
    public static void invHalPyr(int n) {
        for(int i=1; i<=n; i++) {
            int num = 1;
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(num);
                num++;
            }
            for(int j=1; j<=i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of rows : ");
        int n = sc.nextInt();
        sc.close();
        invHalPyr(n);
    }
}
