package HuyL.week1;

public class OddAndEven {

    public static void evenOrOdd(int number){

        if (number<=0){
            System.out.println("Number can not be zero or negative ");
            System.exit(1);
        }else {
            if (number%2 == 0){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
        }
    }
}
/*
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */
