package bitManipulation;

public class questionThree {
    public static void main(String[]args) {
        //Add 1 to an integer using Bit Manipulation.(Hint: try using Bitwise NOT Operator).

        
        //The expression -~x will add 1 to an integer x.We know that to get negative of a number,invert its bit and add 1 to it.(Remember negative numbers are represented/stored in 2's complement form)
        // -x = ~x+1;
        //-~x = x+1;(by replacing x by ~x)
        int x=6;
        System.out.println(x+" + "+1+" is "+-~x);
        x= -4;
        System.out.println(x+" + "+1+" is "+-~x);
        x=0;
        System.out.println(x+" + "+1+" is "+-~x);
    }
}
