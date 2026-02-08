package loops;
import java.util.Scanner;
public class reverseLast {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entert the number to reverse : ");
        int number = sc.nextInt();
        int reverse = 0;
        System.out.println("The reverse number is : ");
        while(number>0) {
            int lastdigit = number%10;
            reverse = ((reverse*10) + lastdigit);
            number = number/10;
        }
        System.out.println(reverse);
        sc.close();
    }

}
