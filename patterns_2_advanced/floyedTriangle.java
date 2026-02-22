package patterns_2_advanced;

import java.util.Scanner;
public class floyedTriangle {
    public static void floytri(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of rows : ");
        int rows = sc.nextInt();
        sc.close();
        floytri(rows);
    }
}
