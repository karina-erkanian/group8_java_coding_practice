package moussa;

public class CharacterFrequency {
    public static void main(String[] args) {

        //Write a return method that can find the frequency of characters
        //
        //         Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String str = "AAABBrRfCDD";

        frequencyOfChars(str);
        System.out.println(frequencyOfChars(str));
    }

    // The return method to find unique characters in the string
    public static String frequencyOfChars(String str1) {
        // Creating an empty string to store unique characters in it
        String str2 = "";
        // Counting the frequency of a character in the string intializing the counter to 0
        int count=0;

        for (int i = 0; i <str1.length() ; i++) {

            if (!(str2.contains(str1.substring(i,i+1)))){
                str2+=str1.charAt(i);

                // iterating throw a string searching for more than one occurence of a character
                for (int j = 0; j < str1.length(); j++) {
                    if (((str1.charAt(i)) == str1.charAt(j))) {
                        count++;
                    }

                }
                str2 += count;
                // reinitializing the counter to 1 for the next character in the string
                count = 0;
            }

        }
        return str2;
    }
}
