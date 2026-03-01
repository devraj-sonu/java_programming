package arrays_part_1;

import java.util.Scanner;
public class arraysInputoutput {
    public static void main(String[]args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//math
        marks[2] = sc.nextInt();//che

        System.out.println("phy : "+ marks[0]);
        System.out.println("math : "+ marks[1]);
        System.out.println("che : "+ marks[2]);

        marks[1] = 100;
        System.out.println("math : "+ marks[1]);

        marks[1] = marks[1] + 1;

        int parcentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("parcentage is : " + parcentage + "%");


        System.out.println("length of array is : "+ marks.length);
        sc.close();
    }
}
