package recursion_basic_part_2;

public class tilingProblem {
    public static int tilingproblem(int n) {//2 X n (floor size)
        //base case
        if(n==0 || n==1) {
            return 1;
        }
        //kaam
        //vertical choise
        int fnm1 = tilingproblem(n-1);

        //horizontal choise
        int fnm2 = tilingproblem(n-2);

        int totalWay = fnm1 + fnm2;
        return totalWay;
    }
    public static void main(String[]args) {
        int n = 3;
        System.out.println(tilingproblem(n));
    }
}
