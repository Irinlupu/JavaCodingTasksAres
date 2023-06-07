package HuyL.week3;

public class PrimeNumber {

    public static boolean isPrimeNumber(int num){
        if (num<=1){ // to check if num less than or equal to 1
            return false; // return false if number less than or equal to 1
        }else {
            for (int i = 2; i < num; i++) { // to check from 2 to num-1
                if (num%i==0){ // checks if nums are even number
                    return false;
                }
            }
        }
        return true; // returns true
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(11));
    }

}
//Write a method that can check if a number is prime or not.
