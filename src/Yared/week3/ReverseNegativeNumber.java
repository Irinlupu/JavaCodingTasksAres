package Yared.week3;

public class ReverseNegativeNumber {



    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-25));
    }

    public static int reverseNegativeNumber(int num) {
        int reversed = 0;
        while (num != 0 && num != -0) {
            int digit = num % 10; // gives me the last digit
            reversed = reversed * 10 + digit; // multiply by ten and adding to current value/ shifts the digit
            num /= 10;// divide by 10 to remove last digit
        }

        return reversed;
    }}
