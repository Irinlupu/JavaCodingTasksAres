package andriy.week6;

import java.util.Scanner;

public class PasswordValidation {

    public static boolean validPassword(String password) {

        if (password.contains(" ") || password.length() < 6) {
            return false;
        }
        char[] myPassword = password.toCharArray();
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;
        for (char eachChar : myPassword) {
            if (Character.isDigit(eachChar)) {
                hasDigit = true;
            } else if (Character.isLowerCase(eachChar)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(eachChar)) {
                hasUpperCase = true;
            } else {
                hasSpecialChar = true;
            }
        }
        return hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password:");
        String password = input.nextLine();
        input.close();
        System.out.println("Valid password: " + validPassword(password));
    }
}
/*
  String_PasswordValidation
Write a return method that can verify if a password is valid or not.
requirements:
Password MUST be at least have 6 characters and should not contain space
PassWord should at least contain one upper-case letter
PassWord should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false

 */