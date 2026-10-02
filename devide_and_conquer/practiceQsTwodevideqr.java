package devide_and_conquer;

public class practiceQsTwodevideqr {
    private static int countINrange(int nums[], int num, int lo, int hi) {
        int count = 0;
        for(int i=lo; i<=hi; i++) {
            if(nums[i] == num) {
                count ++;
            }
        }
        return count;
    }
    public static int majorityElrec(int[]nums, int lo, int hi) {
        int mid = (hi-lo)/2;
        int left = majorityElrec(nums, lo, mid);
        int right = majorityElrec(nums,mid+1,hi);

        if(left == right) {
            return left;
        }

        int leftCount = countINrange(nums, left,lo,hi);
        int rightCount = countINrange(nums, right,lo,hi);

        return leftCount > rightCount ? left : right;
    }
    public static int majorityEl(int[]nums) {
        return majorityElrec(nums, 0,nums.length-1);
    }
    public static void main(String[]args) {
        int arr[] = {1,2,1,3,5,3,5,1,1,1,1};
        System.out.print(majorityEl(arr));
    }
}
