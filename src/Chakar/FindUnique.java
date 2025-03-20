package Chakar;


import java.util.Arrays;
import java.util.Collections;

public class FindUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {
      //  System.out.println(Unique("AAABBBCCCDEF"));
       // System.out.println(unique("AAABBBCCCDEF"));
        System.out.println(findUniqueCharacters("AAABBBCCCDEF"));
    }


    public static String Unique(String str) {
        String result = ""; // // Initialize an empty result string to hold the unique characters.
        // // Split the string into individual characters using str.split("") (empty string splits by each character)
        for (String each : str.split(""))
            // // Collections.frequency checks how many times the character 'each' appears in the string
            result += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1) ? each : "";
        return result; //// Return the string with only unique characters.
    }

    public static String unique(String str) {
        String[] arr = str.split(""); //Step1: Split the string into an array of characters
        String unique1 = ""; //// Initialize an empty string to store the unique characters

        for (int j = 0; j < arr.length; j++) { //// Step 2: Loop through each character in the array
            int num = 0; // This variable will hold the count of the occurrences of arr[j]
            for (int i = 0; i < arr.length; i++) { // // Step 3: Loop through the array again to count occurrences
                if (arr[i].equals(arr[j]))  // Compare each character with arr[j]
                    // If they are equal, increment the count (num)
                    num++;
            }
            if (num == 1) // Step 4: If the character occurs exactly once
                unique1 += arr[j]; // Add it to the result string unique1
        }
        return unique1;  // Step 5: Return the result string with unique characters
    }

    public static String findUniqueCharacters(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) { // Step 1: Loop through each character in the string
            char each = str.charAt(i); // Get the character at index 'i'

            // Step 2: Check if the character appears only once in the string
            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each; // If it appears only once, add it to the result string 'unique'
            }
        }
        return unique;  // Return the result string with unique characters
    }

}