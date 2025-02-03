package Karina;

//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
//print "FIN" instead of the number and
//for numbers which are a multiple of 5, print "RA" instead of the number.
//for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number

public class FinRa {
    public static void main(String[] args) {

        printFinRa(25);
    }
        public static void printFinRa (int a) {
            // Loop through numbers from 1 to given number(int a)
            for (int i = 1; i <= a; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FINRA");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("FIN");
                }
                // Check if the number is divisible by 5
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




