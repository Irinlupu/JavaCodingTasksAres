package irina.week6;

public class PasswordValidation {
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

    public static void main(String[] args) {
        String str = "1hed!";
        System.out.println("isPasswordValid(str) = " + isPasswordValid(str));
    }

    public static boolean isPasswordValid(String str) {
        // setting up the boolean variable to false
        boolean isValid = false;
        // initializing the counters for each type of character
        int countUpper = 0;
        int countLower = 0;
        int countSpecialChar = 0;
        int countDigit = 0;
        // setting up the initial condition that specifies that the password must be at least 6 characters or more and it should't contain any spaces, if this condition is true, the following block code gets executed
        if ((str.length() >= 6) && !(str.contains(" "))) {
            // we run a loop, which allows us to verify each character against each condition, and if the condition is met, the counter for that condition is increased by 1;
            for (int i = 0; i < str.length(); i++) {
                Character each = str.charAt(i);
                if (Character.isDigit(each)) {
                    countDigit++;
                }
                if (Character.isLowerCase(each)) {
                    countLower++;
                }
                if (Character.isUpperCase(each)) {
                    countUpper++;
                }
                if (!Character.isLetterOrDigit(each)) {
                    countSpecialChar++;
                }


            }
        }
        // we need to use counter final values to verify that each character that is required is encountered at least once in our give password
        if (countLower >= 1 && countUpper >= 1 && countDigit >= 1 && countSpecialChar >=1){
            isValid = true;
        }

            return isValid;

    }
}
