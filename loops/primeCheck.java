package loops;
import java.util.Scanner;

public class primeCheck {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check :");
        int n = sc.nextInt();

        if(n==2) {
            System.out.println("The number is prime");
        } else {
            boolean isPrime = true;
            for(int i=2; i<Math.sqrt(n); i++) {
                if(n%i==0) {
                    isPrime = false;
                }
            }

            if(isPrime==true) {
                System.out.println("The number is a prime number");
            } else {
                System.out.println("The number is not a prime number");
            }
            sc.close();
        }
    }
}
        
