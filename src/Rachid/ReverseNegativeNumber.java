package Rachid;

public class ReverseNegativeNumber {
    public static int reverseNumber(int num) {
        int reversed = 0; // Step 1: Initialize reversed number

        while (num != 0) { // Step 2: Continue loop until num becomes 0
            int digit = num % 10;  // Step 3: Extract the last digit
            reversed = reversed * 10 + digit; // Step 4: Append digit to reversed number
            num /= 10; // Step 5: Remove the last digit from num
        }

        return reversed; // Step 6: Return the reversed number
    }

    public static void main(String[] args) {
        int num = -12345; // Input negative number
        int reversedNum = reverseNumber(num); // Call the function to reverse the number
        System.out.println("Reversed Number: " + reversedNum); // Print the result
    }
}
