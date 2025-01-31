package Rachid;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(identify(9));
        System.out.println(identify(10));
    }

    // Using a ternary operator for a concise solution
    public static String identify(int number) {
        return "Number " + number + " is " + (number % 2 == 0 ? "even" : "odd");
    }
}
