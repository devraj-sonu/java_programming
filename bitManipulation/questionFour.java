package bitManipulation;

public class questionFour {
    public static void main(String[]args) {
        //This question is based on a trick, pleasedirectly look at the solution.Convert uppercase characters to lowercase using bits.

        //convert uppercase character into lowercase 
        for(char ch = 'A'; ch<='Z'; ch ++) {
            System.out.println((char)(ch | ' '));
            //prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
