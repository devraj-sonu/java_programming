package arrays_part_1;

public class reverseArray {
    public static void swapArray(int numbers[]) {
        int first = 0, last = numbers.length-1;
        while(first<last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[]args) {
        int arr[] = {45,23,67,34,56};
        swapArray(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
