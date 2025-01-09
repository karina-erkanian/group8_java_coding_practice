package aauganbaev;

public class Week01_OddOr_Even {
    //Numbers -- odd & even
    //Write a method that can identify  a given number is even or odd.
    //
    //EX:
    //       identify(5) --> "Odd"
    //       identify(6) --> "Even"
    public static void main(String[] args) {
       int num = 2;
        if( num%2 == 0) {
            System.out.println(num + " is even");
        }else{
            System.out.println(num + "is odd");}

    }
}
