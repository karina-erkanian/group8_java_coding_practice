package Faris;

//Numbers -- odd & even
//Write a method that can identify  a given number is even or odd.
//
//EX:
//       identify(5) --> "Odd"
//       identify(6) --> "Even
public class Week01OddEven {
    public static void main(String[] args) {

        oddEven(10);

    }

    public static void oddEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
