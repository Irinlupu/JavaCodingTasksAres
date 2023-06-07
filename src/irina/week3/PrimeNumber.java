package irina.week3;

public class PrimeNumber {
    /*
    Numbers -- Prime Number
        Write a method that can check if a number is prime or not.
     */
    public static void main(String[] args) {
        isPrime(1);
    }

    public static void isPrime(int num){
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if(num % i == 0 ){
                isPrime = false;

            }
        }

        System.out.println(num + " isPrime = " + isPrime);



    }

}
