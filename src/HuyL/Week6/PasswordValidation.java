package HuyL.Week6;

public class PasswordValidation {

    public static void main(String[] args) {

        System.out.println(isValidPassword("Hello123@"));
    }

    public static boolean isValidPassword(String password){

        boolean isValidPassword = false;
        int countUppercaseChars = 0;
        int countLowercaseChars = 0;
        int countSpecialChars = 0;
        int countDigits = 0;

        if (password.length() >= 6 && !(password.contains(" "))){

            for (int i = 0; i < password.length(); i++) {

                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)){
                    countUppercaseChars++;
                } else if (Character.isLowerCase(ch)) {
                    countLowercaseChars++;
                } else if (!(Character.isLetterOrDigit(ch))) {
                    countSpecialChars++;
                } else if (Character.isDigit(ch)) {
                    countDigits++;
                }
            }
        }

        if (countUppercaseChars >= 1 && countLowercaseChars >= 1 && countSpecialChars >= 1 && countDigits >= 1){
            isValidPassword = true;
        }

        return isValidPassword;
    }
}
/*
Write a return method that can verify if a password is valid or not.
requirements:
Password MUST be at least have 6 characters and should not contain space
PassWord should at least contain one upper-case letter
PassWord should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
 */
