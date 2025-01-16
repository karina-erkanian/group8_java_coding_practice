package isf;

public class Week01_OddOr_Even {
    //Numbers -- odd & even
    //Write a method that can identify  a given number is even or odd.
    //
    //EX:
    //       identify(5) --> "Odd"
    //       identify(6) --> "Even"

    public static void main(String[] args) {
        // my solution is here

     oddAndEven(6);
     oddAndEven(7);
     oddAndEven(121);
     oddAndEven(51);

    }

    public static void oddAndEven(int num){
        if (num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
