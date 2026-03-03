package arrays_part_2;

public class buyAndsellStock {
    public static int buyAndsellShares(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<price.length; i++) {
            if(buyPrice<price[i]) {//profit
                int profit = price[i] - buyPrice;//todays profit
                maxprofit = Math.max(maxprofit,profit);
            } else{
                buyPrice = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[]args) {
        int prices[] = {7,1,5,3,6,4};
        int ans = buyAndsellShares(prices);
        System.out.println("Maximum profit is : "+ans);
    }
}
