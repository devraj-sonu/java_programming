package function_and_methods;

public class callByvalue {

    public static void swap(int a, int b) {
        //swap - value exchane method
        

        //swapping
        int temp = a;
        a = b;
        b = temp;

        
    }
    public static void main(String[]args) {
        int a = 10;
        int b = 5;
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
        swap(a,b);
    } 
}
