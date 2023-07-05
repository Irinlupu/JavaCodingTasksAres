package mehmet.week6;

import java.sql.Struct;
import java.util.Arrays;

public class String_PasswordValidation {

    //Write a return method that can verify if a password is valid or not.
    //requirements:
    //Password MUST be at least have 6 characters and should not contain space
    //PassWord should at least contain one upper-case letter
    //PassWord should at least contain one lowercase letter
    //Password should at least contain one special character
    //Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns  false

    public static void main(String[] args) {
        System.out.println(isValidPassword("mj2asb Md?f3"));
    }

    public static boolean isValidPassword(String password) {

        boolean atLeast6Character = false,
                oneUpperCase = false,
                oneLowerCase = false,
                oneSpecialCharacter = false,
                oneDigit = false;

        if (password.length() > 6 && !password.contains(" ")) {
            atLeast6Character = true;
        }

        for (int i = 0; i < password.length(); i++){

            if (Character.isDigit(password.charAt(i))){
                oneDigit = true;

            }

            if (Character.isUpperCase(password.charAt(i))){
                oneUpperCase = true;
            }

            if (Character.isLowerCase(password.charAt(i))){
                oneLowerCase = true;
            }

            if (!Character.isLetterOrDigit(password.charAt(i))){
                oneSpecialCharacter = true;
            }
        }

        return atLeast6Character
                && oneDigit
                && oneLowerCase
                && oneUpperCase
                && oneSpecialCharacter;

    }
}
