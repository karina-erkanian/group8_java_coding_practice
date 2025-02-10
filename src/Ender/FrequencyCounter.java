package Ender;

public class FrequencyCounter {
    public static String frequencyOfChars(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            if (!result.contains(String.valueOf(ch))) { // Check if already counted
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) count++;
                }
                result += ch + String.valueOf(count);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD")); // Output: A3B2C1D2
    }
}
