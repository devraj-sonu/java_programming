package patterns_2_advanced;

import java.util.Scanner;
public class diamondPatt {
    public static void diamopatt(int n) {
        if(n <= 0) {
        System.out.println("Enter positive number");
        return;
        }
        //for the first half
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=2*(i-1)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //for the second half
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=2*(i-1)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        sc.close();
        diamopatt(rows);
    }
}
