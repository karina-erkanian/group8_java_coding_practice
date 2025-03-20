package Faris;

/*
// Write a return method that reverse the string
    // Ex: reverse(ABCD)---> DCBA

 */
public class reverse_String {
    public static void main(String[] args) {
        String example = "FariS";
        System.out.println("Original: " + example);
        System.out.println("Reversed: " + reverse(example));
    }


    //Method to reverse a given string
    public static String reverse(String input) {
        //create an empty string to sore the reversed result
        String reversed = "";

        //loop through the original string from the end to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            //add each character to the reversed string
            reversed += input.charAt(i);
        }
        return reversed;
    }

}
