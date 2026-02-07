package conditionalstatements;

public class switchStatement {
    public static void main(String[]args) {
        char ch = 'a';
        switch(ch) {
            case 'b' : System.out.println("Mango");
                        break;
            case 'a' : System.out.println("juice");
                        break;
            case 'r' : System.out.println("potato");
                        break;
            default  : System.out.println("Dream"); 
        }
    }
}
