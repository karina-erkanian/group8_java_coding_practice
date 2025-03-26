package Karina;

//String--Find the unique
//
//    Write s return method that can find the unique characters from the String
//    Ex: unique("AAABBBCCCDEF")--->"DEF";
public class FindTheUnique {

    public static void main(String[] args) {

        System.out.println("Unique letters = " + findUnique("AAABBBCCCDEFGGGGGG"));
    }

    public static String findUnique(String str) {

            if (str == null || str.isEmpty()) {  //returns empty string if string is empty or null
                return "";
            }

            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                boolean isUnique = true;
                for (int j = 0; j < str.length(); j++) {       //his loop checks whether the character stored in currentChar
                    if (i != j && currentChar == str.charAt(j)) {//appears anywhere else in the string at a different position.
                        isUnique = false;                         //It compares the current character with all the other characters in the string.
                        break;
                    }
                }
                if (isUnique) {
                    boolean alreadyAdded = false;
                    for(int k=0; k < result.length(); k++){
                        if(result.charAt(k) == currentChar){
                            alreadyAdded = true;
                            break;
                        }
                    }
                    if(!alreadyAdded){
                        result += currentChar;
                    }
                }
            }
            return result;
        }
        }



