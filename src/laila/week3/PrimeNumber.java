package laila.week3;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num){
        if(num ==1){
            return true;

        } else if(num >=2){
            for (int i = 2; i < num; i++) {
                if(num % i !=0) {
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("plz enter a number to check if its prime or not ");
        int num = input.nextInt();
        if(isPrime(num)){
            System.out.println("prime :" + num);
        } else{
            System.out.println("not prime :" + num);
        }
    }
}
/*Numbers -- Prime Number
Write a method that can check if a number is prime or not.

 */