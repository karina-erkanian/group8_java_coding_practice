package moussa;

import java.util.Scanner;

public class Week01_OddOr_Even {
    //Numbers -- odd & even
    //Write a method that can identify  a given number is even or odd.
    //
    //EX:
    //       identify(5) --> "Odd"
    //       identify(6) --> "Even"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
       identify(number);
    }

    private static void identify(int number) {
        if(number<=0){
            System.out.println("the number is cannot be zero or negative");
            return;
        }

        if(number % 2 == 0 ){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }

}
