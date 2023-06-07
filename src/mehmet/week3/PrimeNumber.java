package mehmet.week3;

public class PrimeNumber {


    public static void main(String[] args) {

        System.out.println(findPrimeNumber(-79));
    }

    public static boolean findPrimeNumber(int num) {

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            } else {
                continue;
            }
        }

        return isPrime;
    }
}

/*Numbers -- Prime Number
Write a method that can check if a number is prime or not. */