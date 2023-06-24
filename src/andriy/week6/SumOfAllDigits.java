package andriy.week6;



public class SumOfAllDigits {

    public static int sumOfAllDigits(String str) {
        int sumOfDigits = 0;
        String newStr = "";
        String[] strArr = str.split(" ");
        for (String eachElement : strArr) {
            String strOfNum = "";
            for (int i = 0; i < eachElement.length(); i++) {
                if (Character.isDigit(eachElement.charAt(i))) {
                    strOfNum += eachElement.charAt(i);
                }
            }
            newStr += strOfNum + " ";
        }
        System.out.println(newStr);

        for (String each : newStr.split(" ")) {
            if (each.equals("")){
                continue;
            }
            sumOfDigits+=Integer.parseInt(each);
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {

        String str = "120 java 5 apple 3";
        System.out.println("Sum of digits = " + sumOfAllDigits(str));
    }

    }

/*
String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */