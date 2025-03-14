package moussa;

public class FundTheUnique {
    public static void main(String[] args) {
        /*
returm method that find out the unique charachters  from string
removeDup("AAABBBCCCDEF)---> DEF
 */

        String str1= "AABFBEBHCCCDEFGHA";

        System.out.println("remove duplicate characters from string :"+str1);
        findTheUnique(str1);
        System.out.println("find the unique charachters  from string :"+findTheUnique(str1));
    }
// The return method to find unique characters in the string
    private static String findTheUnique(String str1) {
        // Creating an empty string to store unique characters in it
        String str2 = "";
        // Counting the frequency of a character in the string intializing the counter to 0
        int count=0;

        for (int i = 0; i <str1.length() ; i++) {
            // iterating throw a string searching for more than one occurence of a character
            for(int j=0;j<str1.length();j++) {
                   if(((str1.charAt(i))==str1.charAt(j))){
                       count++;
                 }
            }
         // if the occurence of this character is still equal to one then add it to the second string
          if(count==1){
            str2+=str1.charAt(i);
          }
          // reinitializing the counter to 0 for the next character in the string
            count=0;
        }
            return str2;

    }
}
