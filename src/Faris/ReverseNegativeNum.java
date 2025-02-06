package Faris;
/*
 ✅ Reverse Negative Number

Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */
public class ReverseNegativeNum {
    public static void main(String[] args) {

        System.out.println("reverseNegativeNumber(-35) = " + reverseNegativeNumber(-35));

    }

    public static int reverseNegativeNumber (int num){

        String reversedNum= new StringBuilder(String.valueOf(Math.abs(num))).reverse().toString();
        return -Integer.parseInt(reversedNum);
    }
}
/*
Convert the negative number to a String without the minus sign.
Reverse the string using StringBuilder().reverse().
and converts the number to positive using Math.abs().
Convert it back to an int and add the negative sign.
 */