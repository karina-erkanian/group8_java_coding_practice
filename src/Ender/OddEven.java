package Ender;

public class OddEven {

     /*Write  a method which can identify given int number is even or odd
 Output ex:
 identify(5); ->"Odd"
 identify(6); ->"Even"*/

    public static void main(String[] args) {
        // Test the method with example inputs
        System.out.println(identify(5)); // Output: "Odd"
        System.out.println(identify(6)); // Output: "Even"
    }

    // Method to identify if a number is even or odd
    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even"; // Return "Even" if divisible by 2
        } else {
            return "Odd"; // Return "Odd" if not divisible by 2
        }
    }
}
