package function_and_methods;

import java.util.Scanner;

public class parameterVSargument {
    

    public static void /*int*/calculateSum(int num1, int num2) {//parameters or formal parameters
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
        //return sum;
        
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int sum = calculateSum(a,b);
        calculateSum(a,b); //arguments or actual parameters
        //System.out.println("Sum is : " + sum);
        sc.close();
    }
    
}


//there are two types of parameters 
//formal parameters(known as parameters)//actual parametes(arguments)

//formal parameters difine in fuction definition
//actual parameter difine when function is calling

