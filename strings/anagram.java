package strings;
import java.util.Arrays;
//ANAGRAM == if two strings have same characters but in different order they can be said to an anagram.Consider race and care in this case race's character can be formated into a study.or care's characters can be formated into race.Here is the java programm to seee---
public class anagram {
    public static void main(String[]args) {
        String str1 = "earth";
        String str2 = "heart";

        //convert strings into lowercase why? so that we can check all uppercase letter to lowercase for checking same
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //first check the length of the two strings are same
        if(str1.length()==str2.length()) {
            //converts string into character array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            //sort the character array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //if the sorted two arrays are identical or equal then the two strings are anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result) {
                System.out.println(str1 + " and " + str2 + "are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 +"are not anagrams of each other.");
            }
        } else {
            //case when the length are not equal
            System.out.println(str1 + " and " + str2 + "are not anagram of each other.");
        }
    }
}
