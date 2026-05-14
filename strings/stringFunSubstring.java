package strings;

public class stringFunSubstring {
    public static String substringPrint(String str, int si, int ei) {
        String substring = "";
        for(int i=0; i<ei; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String[]args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0,5));
        System.out.println(substringPrint(str,0,5));
    }
}
