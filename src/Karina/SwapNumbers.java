package Karina;

/*
    Swap two integer variable values
    (including both ways; with using a third variable and without it)
    */

public class SwapNumbers {

    public static void main(String[] args) {
        
        int a = 20;
        int b = 30;

        System.out.println("Before swap a = " + a +", b = " + b);

        //Swapping numbers without using a third variable

        //We use arithmetic operators

        a = a + b; //a holds the sum of a and b (50)
        b = a - b; //b holds the original value of a (20)
        a = a - b; //a now holds the original value of b (30)


        System.out.println("After swap a = " + a + ", b = " + b);
        //swap(a,b);

    }

    //Custom method that takes two integers as input parameters

    public static void swap(int a, int b){

        int temp = a; //temporary variable to hold the value of a --> temp = 20
        a = b;        //assigning the value of b to a --> a = 30
        b = temp;     //assigning the value of b to a --> b = 20

        System.out.println("After swap a = " + a +", b = "+ b);
    }

    
    
}
