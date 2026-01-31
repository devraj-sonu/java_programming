package operators;

import java.util.Scanner;


public class unaryoperators {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = 10;
    int b = ++a;
    System.out.println(a);
    System.out.println(b);
    sc.close();
    }
}
