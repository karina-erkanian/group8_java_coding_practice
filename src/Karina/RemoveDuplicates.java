package Karina;
/*
    Write a return method that can remove duplicated values
    from String

    Example: removeDup("AAABBBCCC") -----> ABC
     */
public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println("result = " + removeDup("AAABBBCCCDDDEE"));

    }

    static String removeDup(String given){

        String result = "";
        for (int i = 0; i < given.length(); i++) {
            if(!result.contains(String.valueOf(given.charAt(i)))){
            result += given.charAt(i);
            }
        }return result;
    }
}
