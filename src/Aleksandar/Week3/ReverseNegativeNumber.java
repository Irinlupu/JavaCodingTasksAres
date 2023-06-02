package Aleksandar.Week3;

public class ReverseNegativeNumber {


    public static int Reverse (int num){

        if (num >= 0){
            System.err.println("Invalid number");
            System.exit(-1);
        }

        String str = String.valueOf(num);
        str = str.substring(0,1) + str.substring(2)+ str.substring(1,2);
        int print = Integer.parseInt(str);

        return print;

    }

    public static void main(String[] args) {


        System.out.println(Reverse(-35));

    }
}
/*
Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */
