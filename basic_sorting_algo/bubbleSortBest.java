//this is the approach for bubble sort where the array is already in sorted no need to sorted it . if the array is already sorted and bubble sort applies the time complexity will remain also O(n^2) but in this case the time complexity for this approach will O(n).
package basic_sorting_algo;

public class bubbleSortBest {
    public static void bubblesortOptimize(int numbers[]) {
        for(int turn=0; turn<numbers.length-1; turn++) {
            boolean swapped = true; // important
            for(int j=0; j<numbers.length-1-turn; j++) {
                if(numbers[j] > numbers[j+1]) {
                    int swap = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = swap;

                    swapped = true; //swap happened
                }
            }
            if(swapped == false) {
                break;
            }
        }
    }
    public static void printArr(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args) {
        int arr[] = {5,4,1,3,2};
        bubblesortOptimize(arr);
        printArr(arr);
    }
}
