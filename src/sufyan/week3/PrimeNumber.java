package sufyan.week3;

import java.util.Scanner;

class PrimeNumber{

    public static boolean prime(int num){

        //prime numbers
        int[] primeNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        boolean bool = true;

        System.out.println(Math.sqrt(num));

        double sqrNum = Math.sqrt(num);

        int nnum = (int) Math.round(sqrNum);

        System.out.println(nnum);

        for (int i = 0; i < primeNumber.length ; i++) {
            if (primeNumber[i] <  nnum) {
                if (num % primeNumber[i] == 0) {
                    bool = false;
                    break;
                }
            }
        }
        return bool;


    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please give a number to check it if it's Prime");
        int num = in.nextInt();
        System.out.println(prime(num));
        in.close();


    }
}

/*
*
* how to check for prime number
* 1 = find te squre root of number
* 2 = find all the prime number smaller than the squre number
* 3 = if the number is not divisible by any of those prime number than the number is prime
* */