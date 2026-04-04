package strings;

public class stringCharMethod {
    public static void printletters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[]args) {
        String firstname = "Devraj";
        String lastname = "Giri";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname.charAt(0));

        printletters(fullname);
    }
}
