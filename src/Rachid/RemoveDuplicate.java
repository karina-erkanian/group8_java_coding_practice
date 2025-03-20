package Rachid;

public class RemoveDuplicate {
    public static String unique(String s) {
        // Step 1: Create a StringBuilder to store the unique characters
        StringBuilder uniqueChars = new StringBuilder();

        // Step 2: Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Step 3: Get the current character at position i
            char currentChar = s.charAt(i);

            // Step 4: Check if the character appears only once in the string
            if (s.indexOf(currentChar) == s.lastIndexOf(currentChar)) {
                // Step 5: If the character is unique, append it to the StringBuilder
                uniqueChars.append(currentChar);
            }
        }

        // Step 6: Convert the StringBuilder to a string and return it
        return uniqueChars.toString();
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Step 7: Test the method with an example string
        String input = "AAABBBCCCDEF";
        String result = unique(input); // Call the unique method
        System.out.println("Unique characters in \"" + input + "\": " + result); // Output: "DEF"
    }
}