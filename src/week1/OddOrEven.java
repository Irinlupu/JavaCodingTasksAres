package week1;

public class OddOrEven {


    /*
    Numbers -- odd & even
        => Write a method that can identify  a given number is even or odd.
            EX:
                identify(5) --> "Odd"
                identify(6) --> "Even"
     */

    // Solution below

    public static void oddOrEven(int num){

        if (num % 2 == 0){
            System.out.println("Given number "+ num+ " is even");
        }else {
            System.out.println("Given number "+ num+ " is odd");
        }
    }

    public static void main(String[] args) {

    /*
    identify(5) --> "Odd"
    identify(6) --> "Even"
     */
        oddOrEven(5); // Odd
        oddOrEven(6); //even
    }
}
