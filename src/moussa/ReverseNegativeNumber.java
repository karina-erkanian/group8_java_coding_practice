package moussa;

import java.util.Scanner;

public class ReverseNegativeNumber {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a negative integer: ");
        int negativeNumber = sc.nextInt();
        System.out.println("negativeNumber = " + negativeNumber);
        System.out.println(reverseNegativeNumber(negativeNumber));

    }
    public static int reverseNegativeNumber(int num) {
        int numReversed = 0;
        num = Math.abs(num); // Convert to positive

        while (num > 0) {
            numReversed = numReversed * 10 + num % 10; // reversing the number
            num /= 10;
        }

        return -numReversed; // get finnaly the number reversed
    }
}
