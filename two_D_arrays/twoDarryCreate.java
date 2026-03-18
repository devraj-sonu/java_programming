package two_D_arrays;
import java.util.Scanner;

public class twoDarryCreate {
    public static boolean searching(int amtrix[][],int key) {
        for(int i=0; i<amtrix.length; i++) {
            for(int j=0; j<amtrix[0].length; j++) {
                if(amtrix[i][j] == key) {
                    System.out.print("found at cell : ("+ i +","+ j +")");
                    return true;
                }
            }
        }
        System.out.print("Element not found");
        return false;
    }
    public static void main(String[]args) {
        int matrix[][] = new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
    //output

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        sc.close();
        searching(matrix, 5);

    }

}


