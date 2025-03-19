package moussa;

public class Reverse_String {

    // Write a return method that reverse the string
    // Ex: reverse(ABCD)---> DCBA

    public static void main(String[] args) {

        String str= "ABCDEFGHI";
        System.out.println("reverse string : ABCD is) = " + reverse_string(str));
    }

    private static String reverse_string(String str) {

        // option1:
        //StringBuilder sb = new StringBuilder();
        //sb.append(str);
        //return sb.reverse().toString();

        // option 2:
        String str2="";
        for(int i = str.length()-1; i >= 0; i--) {

            str2+=str.charAt(i);

        }
        return str2;


    }

}
