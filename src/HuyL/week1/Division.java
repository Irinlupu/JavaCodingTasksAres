package HuyL.week1;

public class Division {

    public static void DivisionWithoutDivisionOperator(int num1, int num2){

        if (num1 > 0 && num2 > 0 ){

            int division = 0;

            while (num1 >= num2){
                if (num1>0 && num2>0) {
                    num1 = num1 - num2;
                    division = division + 1;
                }else {
                    System.out.println("Invalid number");
                    System.exit(1);
                }
            }
            System.out.println("Division = "+division);
        }else {
            System.out.println("Invalid numbers");
            System.exit(1);
        }

    }
}
/*
Write a method that can divide two numbers without using division operator.
 */
