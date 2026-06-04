package recursion_basic_part_2;

public class friendsPairingProb {
    public static int friendsPairing(int n) {
        //base case
        if(n==1||n==2) {
            return n;
        }
        //choise
        //single
        int fnm1 = friendsPairing(n-1);
        //pairing
        int fnm2 =friendsPairing(n-2);
        int pairways = (n-1) * fnm2;
        //calculate the total ways to pair
        int totalways = fnm1 + pairways;
        return totalways;
    }
    public static void main(String[]args) {
        int totalFriends = 3;
        System.out.println(friendsPairing(totalFriends));
    }
}
