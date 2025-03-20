package Karina;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        ReverseNegativeNumber rn = new ReverseNegativeNumber(); // Create an instance of the class
        int num = -1234; // You can change this number to test other cases
        int reversedNum = rn.reverseNegativeNumber(num); // Call the method
        System.out.println("Reversed number: " + reversedNum); // Print the result
    }

    public int reverseNegativeNumber(int n) {

        boolean isNegative = n < 0;
        if (isNegative) {
            n = -n; // Make n positive for reversal
        }
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return isNegative ? -reversed : reversed;
    }
}
