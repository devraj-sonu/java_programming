package patterns_1;
import java.util.Scanner;

public class invertedStarpatt {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for star pattern :");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
