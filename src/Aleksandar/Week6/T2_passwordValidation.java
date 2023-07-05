package Aleksandar.Week6;

import java.util.Scanner;

public class T2_passwordValidation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();


        int toLoverCase = 0;
        int toUpperCase = 0;
        int isDigit = 0;
        int isSpecialChar = 0;
        int space = 0;



        if (str.length() >= 6){
            for (int i = 0; i < str.length(); i++) {
              //  String eachI = str.charAt(i)+"";
                char ch = str.charAt(i);

                if (ch == 32){
                    space++;
                }

                if (ch >= 48 && ch <= 57){
                    isDigit++;
                }
                if (ch >= 97 && ch <= 122){
                    toLoverCase++;
                }
                if (ch >= 65 && ch <= 90){
                    toUpperCase++;
                }
                if (ch >= 33 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96){
                    isSpecialChar++;
                }


            }

        }else {
            System.out.println("Sorry, not enough characters");
            System.exit(1);
        }

        if (space > 0){
            System.out.println("Sorry, your password can not contain space character!");
            System.exit(0);
        }

        if (isDigit > 0 && isSpecialChar > 0 && toUpperCase >0 && toLoverCase > 0){
            System.out.println("Your password is valid");
        }else {
            System.out.println("Sorry, invalid password!!!");
        }

        input.close();
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