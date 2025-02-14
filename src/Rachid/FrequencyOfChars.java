package Rachid;

public class FrequencyOfChars {

    public static String frequencyOfChars(String str) {
        StringBuilder result = new StringBuilder(); // Stores the final output

        while (!str.isEmpty()) { // Continue until all characters are counted
            char ch = str.charAt(0); // Get the first character
            int count = 0; // Initialize count for this character

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++; // Increment count when the same character is found
                }
            }

            result.append(ch).append(count); // Append character and its count to result
            str = str.replace(String.valueOf(ch), ""); // Remove all occurrences of this character
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD")); // Expected output: A3B2C1D2
    }
}
