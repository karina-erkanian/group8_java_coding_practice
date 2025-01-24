package Ender;

public class FinRaTest {

    public static void main(String[] args) {
        printFinRa();
    }

    public static void printFinRa() {
        // Loop through numbers from 1 to 30
        for (int i = 1; i <= 30; i++) {
            // Check if the number is a multiple of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            }
            // Check if the number is a multiple of 3
            else if (i % 3 == 0) {
                System.out.println("FIN");
            }
            // Check if the number is a multiple of 5
            else if (i % 5 == 0) {
                System.out.println("RA");
            }
            // If none of the above, print the number itself
            else {
                System.out.println(i);
            }
        }
    }
}
//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
//print "FIN" instead of the number and
//for numbers which are a multiple of 5, print "RA" instead of the number.
//for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number


