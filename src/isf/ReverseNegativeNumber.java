package isf;

public class ReverseNegativeNumber {

    /*
        Write a return method that can reverse digits of a negative number and return it as int
        input: -35  output: -53

         */
    public static void main(String[] args) {

        System.out.println(reverseNegative(-35)); // Output: -53
        System.out.println(reverseNegative(-122)); // Output: -21



        

    }

    public static int reverseNegative(int num) { // num = -35

        int reversed = 0; // Empty int variable for reverse

        num = Math.abs(num); // Remove negative sign for processing (abs = 35)

        while (num > 0) { // num = 35 (2nd -> num = 3, 3rd -> num = 0)
            int lastDigit = num % 10; // Extract last digit (1st -> 35 % 10 => 5), (2nd -> 3 % 10 = 3)

            reversed = reversed * 10 + lastDigit; // Build reversed number (1st -> 0 * 10 + 5 = 5), (2nd -> 5 * 10 + 3 = 53)

            num /= 10; // Remove last digit (1st -> 35/10 = 3), (2nd -> 3/10 = 0)
        }

        return -reversed; // Reapply the negative sign
    }

}



