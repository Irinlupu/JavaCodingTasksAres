package Yared.week3;

public class FindPrimeNumber {


    public static void main(String[] args) {
        System.out.println(isPrime(15));
    }


    public static boolean isPrime (int number){

        if(number <= 1){ // less than or equal to 1/ prime are greater then 1
            return false;
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0){ // not prime number // if its even cant be prime
                return false;
            }

        }
        return true;
    }
}
