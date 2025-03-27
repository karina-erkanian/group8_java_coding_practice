package moussa;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "passwOrduu8!";
        passwordIsValid(password);
        System.out.println("The password is it valid = " + passwordIsValid(password));

    }

    private static Boolean passwordIsValid(String psword) {
        // the result of string if it is valid
        Boolean result = false;

        Boolean isDigit = false;
        Boolean isUpper = false;
        Boolean isLower = false;
        Boolean isSpecial = false;
        Boolean isSpace = false;

        if(psword.length() < 8) {
            result = false;
            return result;
        }
        for(int i = 0; i < psword.length(); i++) {
            if (Character.isDigit(psword.charAt(i))) {
                isDigit = true;
                continue;
            }

            else if(Character.isUpperCase(psword.charAt(i))) {
                isUpper = true;
                continue;
            }
            else if(Character.isLowerCase(psword.charAt(i))) {
                isLower = true;
                continue;
            }
             else if(Character.isSpaceChar(psword.charAt(i))) {
               isSpace = true;
               continue;
            }
             if(!Character.isLetterOrDigit(psword.charAt(i))) {
                isSpecial = true;
                continue;
            }
        }

        if((isDigit&&isUpper&&isLower&&isSpecial)&&!isSpace) {
            result = true;
        }
        else {
            result = false;
        }

        return result;
    }
}
