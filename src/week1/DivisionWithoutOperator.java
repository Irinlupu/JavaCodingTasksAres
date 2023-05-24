package week1;

public class DivisionWithoutOperator {
    /*
    Numbers -- Divide without / operator
            => Write a method that can divide two numbers without using division operator.
     */

    // Solution Below

    public int dividWithoutOeration(int number1 ,int number2){

        int resualt = 0;
        //sign variable is for converting numbers
        int sign = 1;
        if (number1 * number2 < 0 ) {
            sign = -1;
        }
        // convert the number to positive if the numbers is negative
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        //we can not divid by 0
        if ( number2 == 0){
            System.out.println("can't divid by 0");
            System.exit(-1);
        }

        while (number1 >= number2){
            number1 = number1 - number2;
            resualt++;
        }
        System.out.println("the remainder is  " + number1);
        return  resualt * sign;

    }






}
