package Chakar;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {
        System.out.println(removeDup("aaabbbccc"));

    }

    public static String removeDup(String str) {

        String result = ""; // Initialize an empty string to hold the result

        for (int i = 0; i < str.length(); i++) // Loop through each character of the input string

            if (!result.contains("" + str.charAt(i))) // If the character is not already in the result string

                result += "" + str.charAt(i); // // Add the character to the result string
        return result; // Return the result string without duplicates
    }
}