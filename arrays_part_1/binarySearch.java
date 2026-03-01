package arrays_part_1;

public class binarySearch {
    public static int binarYsearch(int numbers[],int key) {
        int start = 0,end = numbers.length-1;

        while(start<=end) {
            int mid = (start+end)/2;

            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid]<key) {//right
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[]args) {
        int arr[] = {45,78,23,56,34,89};
        int key = 23;
        int answer = binarYsearch(arr, key);
        System.out.println("Key found at index : "+answer);
    }
}
