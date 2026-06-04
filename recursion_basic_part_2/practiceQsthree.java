//find the length of the string using recursion function

package recursion_basic_part_2;

public class practiceQsthree {
    public static int lengthOfstring(String str) {
        if(str.length()==0) {
            return 0;
        }
        return lengthOfstring(str.substring(1)) + 1;
    }
    public static void main(String[]args) {
        System.out.println(lengthOfstring("hello world"));
    }
}

