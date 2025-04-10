package Masha;

public class PasswordValidationTask {

    public static void main(String[] args) {

        passVerify("124567ahp9!");

    }

    public static String passVerify(String password) {

        int l = password.length();

        if(l > 5 && !password.contains(" ")){
            System.out.println("Password");
        }

        return password;
    }
}



    /*
    1. Write a return method that can verify if a password is valid or not
       1.Pass must have atleast 6 chars and no space
       2.Pass should have atleast one uppercase
       3.Pass must have atleast one lowercase
       4.Pass must have atleast one special char
       5.Pass must have atleast one digit

     */

   
