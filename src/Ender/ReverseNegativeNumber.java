package Ender;
public class ReverseNegativeNumber {
    public static int reverseNegative(int num) {
        int reversed = 0;
        num = Math.abs(num); // Convert to positive

        while (num > 0) {
            reversed = reversed * 10 + num % 10; // Build reversed number
            num /= 10;
        }

        return -reversed; // Convert back to negative
    }

    public static void main(String[] args) {
        System.out.println(reverseNegative(-35));  // Output: -53
    }
}
