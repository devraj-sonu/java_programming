package strings;

public class stringFunCompare {
    public static void main(String[]args) {
        String s1 = "TONY";
        String s2 = "TONY";
        String s3 = new String("TONY");

        if(s1==s2) {
            System.out.println("The strings s1 and s2 are equal");
        }else{
            System.out.println("The strings s1 and s3 are not eqal");
        }

        if(s1==s3) {
            System.out.println("The strings s1 and s2 are equal");
        }else{
            System.out.println("The strings s1 and s3 are not eqal");
        }

        if(s1.equals(s3)) {
            System.out.println("The both strings are equal");
        }
    }
}
