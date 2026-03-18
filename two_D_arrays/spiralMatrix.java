package two_D_arrays;

public class spiralMatrix {
    public static void printSpiral(int arr[][]) {
        int stRow = 0,stcol = 0;
        int endRow = arr.length-1,endCol = arr[0].length-1;

        while(stRow<=endRow  &&  stcol<=endCol) {
            //for top row
            for(int j=stRow; j<=endCol; j++) {
                System.out.print(arr[stRow][j]+" ");
            }
            //for right col
            for(int i=stRow+1; i<=endRow; i++) {
                System.out.print(arr[i][endCol]+" ");
            }
            //for bottom row
            for(int j=endCol-1; j>=stRow;j--) {
                if(stRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }
            //for left column
            for(int i=endRow-1; i>=stRow+1; i--) {
                if(stcol == endCol) {
                    break;
                }
                System.out.print(arr[i][stRow]+" ");
            }
            stRow++;
            endCol--;
            endRow--;
            stcol++;
        }
        
    }
    public static void main(String[]args) {
        int matrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        printSpiral(matrix);
    }
}
