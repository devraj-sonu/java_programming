package patterns_2_advanced;

import java.util.Scanner;
public class hollowREcTriang {
    public static void hollow_rectangle(int toRows, int toCol) {
        for(int i=1; i<=toRows; i++) {
            for(int j=1; j<=toCol; j++) {
                if(i==1||i==toRows||j==1||j==toCol) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of rows : ");
        int toRows = sc.nextInt();
        System.out.println("Enter the total no of cols : ");
        int toCols = sc.nextInt();
        sc.close();
        hollow_rectangle(toRows, toCols);
    }
}
