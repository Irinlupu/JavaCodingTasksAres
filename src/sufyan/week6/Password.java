package sufyan.week6;

import java.util.regex.Pattern;

public class Password {
    // String_PasswordValidation
    //Write a return method that can verify if a password is valid or not.
    //requirements:
    //Password MUST be at least have 6 characters and should not contain space
    //PassWord should at least contain one upper-case letter
    //PassWord should at least contain one lowercase letter
    //Password should at least contain one special character
    //Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns  false

    public static void main(String[] args) {
        String passWord = "sasenE2@";
        //At least one upper case English letter, (?=.*?[A-Z])
        //At least one lower case English letter, (?=.*?[a-z])
        //At least one digit, (?=.*?[0-9])
        //At least one special character, (?=.*?[#?!@$%^&*-])
        //Minimum eight in length .{6,}

        String reg = "[A-Za-z\\d@$!%*?&]{6,}$";

        boolean flag = passWord.matches(reg);

        System.out.println(flag);


}
}
