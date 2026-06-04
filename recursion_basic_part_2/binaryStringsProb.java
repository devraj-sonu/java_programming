package recursion_basic_part_2;

public class binaryStringsProb {
    public static void printBinarystr(int n,int lastplace, String str) {
        //kaam
        // if(lastplace == 0) {
        //     //sit 0 on chair n
        //     printBinarystr(n-1, 0, str.append("0"));
        //     printBinarystr(n-1, 1, str.append("1"));
        // } else {
        //     printBinarystr(n-1, 0, str.append("0"));
        // }
        if(n==0) {
            System.out.println(str);
            return;
        }
        printBinarystr(n-1, 0, str+"0");

        if(lastplace == 0) {
            printBinarystr(n-1,1,str+"1");
        }

    }
    public static void main(String[]args) {
        printBinarystr(3, 0,"");
    }
}
