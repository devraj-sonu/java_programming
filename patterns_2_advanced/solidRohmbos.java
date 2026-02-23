package patterns_2_advanced;

import java.util.Scanner;
public class solidRohmbos {
    public static void solRoh(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to print : ");
        int rows = sc.nextInt();
        sc.close();
        solRoh(rows);
    }
}
