package recursion_basic_part_2;

public class binaryStringsproblemZero {
    public static void printbinarystrzero(int n,int lastplace,String str) {
        if(n==0) {
            System.out.println(str);
            return;
        }
        printbinarystrzero(n-1, 1, str+"1");

        if(lastplace==1) {
            printbinarystrzero(n-1, 0, str+"0");
        }
    }
    public static void main(String[]args) {
        printbinarystrzero(3,1,"");
    }
}
