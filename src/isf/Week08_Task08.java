package isf;

public class Week08_Task08 {

/*
Write a String Method that can reverse a given String
 */
    public static void main(String[] args) {

        // Calling the Method
         reverseString("abcd");

         // Assign to Local Variable
        String reverse = reverseString("abcd");
        System.out.println("result = " + reverse);

    }

    public static String reverseString(String str){

       // A new String to add chars from the end
        String result = "";

        // Loop should iterate from then end
        for (int i = str.length() - 1; i >= 0; i--) { // abcd

            result += str.charAt(i); // i = 3, i = d

        }

        return result;
    }
}
