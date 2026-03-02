package arrays_part_2;

public class maxSubArrSum {
    public static void maxsubArrsum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                int currsum = 0;
                for(int k=start; k<=end; k++) {
                    currsum += numbers[k];
                }
                System.out.print(currsum+" ");
                if(maxSum<currsum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.print("maximum subarray sum is : "+maxSum);
    }
    public static void main(String[]args) {
        int arr[] = {3,5,7,8,9,2};
        maxsubArrsum(arr);
    }
}
