package Chakar;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53
    public static void main(String[] args) {
        System.out.println(reverseNumber(-28));
        System.out.println("reverseNum(-35) = " + reverseNum(-35));


    }

    public static int reverseNumber(int number){
        // Handle the case where the number is a single digit
        if(number < 10 && number >= 0){
            return number * -1;  // If it's a single digit (positive or negative), return as is
        }

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10; // Reverse the digits
            number /= 10; // Remove the last digit
        }

        return result;
    }

    //alternative solution
    //converts&returns int num to a String so that we can handle -50 -> -5 issue because int does not have 0 before a number
    public static String reverseNum(int num) {

        String str = new StringBuilder("" + num).reverse().toString();
        //  We convert the absolute value of the number into a string and reverse it using StringBuilder.

        if (num < 0) {
            str = "-" + str.substring(0, str.length() - 1);
            //  str = "-" + str;
            //If the original number was negative, we prepend a negative sign "-" to the reversed string.

        }

        return str;
    }


}

