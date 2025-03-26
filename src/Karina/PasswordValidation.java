package Karina;

/*
 String -- Password Validation Task
 1.Write a return method that can verify if a password is valid or not.
 Requirements:
 1.Password MUST be at least have 6 characters and should not contain spaces
 2.Password should at least contain one upper case letter
 3.Password should at least contain one lowercase letter
 4.Password should at least contain one special character
 5.Password should at least contain a digit

 If all requirements above are met, the method returns true, otherwise returns false.
  */


public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println(" Password is valid = " + isValid("Karina1!"));
    }

    public static boolean isValid(String password) {


        if (password.length() < 6 || password.contains(" ")) { //first requirement
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;  //second requirement
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;//third
            } else if (Character.isDigit(c)) {
                hasDigit = true;//fourth
            } else if (!Character.isLetterOrDigit(c)) { //fifth
                hasSpecialChar = true;
            }

        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar; //if all of these are true the password is valid

    }
}
