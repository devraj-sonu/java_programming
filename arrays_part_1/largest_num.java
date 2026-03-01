package arrays_part_1;
import java.util.Scanner;

public class largest_num {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(largest<numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {2,5,8,9,4};
        System.out.println("The largest number is : " + getLargest(numbers));
        sc.close();
    }
    
}
