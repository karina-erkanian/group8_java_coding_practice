package Karina;

public class OddOrEven {

    //Numbers -- odd & even
    //Write a method that can identify  a given number is even or odd.
    //
    //EX:
    //       identify(9) --> "Odd"
    //       identify(10) --> "Even"
    public static void main(String[] args) {
        System.out.println(identify(9));
        System.out.println(identify(10));
    }

    // Method to identify if a number is even or odd
    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Number "+number+" is even";
        } else {
            return "Number "+number+" is odd";
        }
    }
}
