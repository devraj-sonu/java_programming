//count the number of vowels in a word.


package strings;

import java.util.Scanner;
public class practiceqsOne {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("The number of count in the word is : " + count);
        sc.close();
    }
    
}
