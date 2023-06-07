package irina.week3;

public class ReverseNegativeNumber {
    /*
    Numbers -- Reverse negative number
        Write a return method that can reverse digits of a negative number and return it as int
        input: -35  output: -53

     */
    public static void main(String[] args) {
       int x =  reverseNegative(-58);
        System.out.println("x = " + x);

    }
    public static int reverseNegative(int num){

        int reversed = 0;

        while(num != 0){

            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;
        }


        return reversed;
    }





}


