package mehmet.week1;

import java.util.Arrays;

public class OddOrEven {

    /*
    Numbers -- odd & even
        => Write a method that can identify  a given number is even or odd.
            EX:
                identify(5) --> "Odd"
                identify(6) --> "Even"
     */

    // Solution below

    public static void main(String[] args) {
        isOddOrEven(-1);
    }

    public static int isOddOrEven(int number) {

        int status = -1;

        if (number % 2 == 0) {
            status = 0;
            System.out.println("Even");
        } else {
            status = 1;
            System.out.println("Odd");
        }

        return status;
    }


}
