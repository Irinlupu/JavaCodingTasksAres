package Ergun.week1;

public class DivisionWithoutOperator {
    /*
    Numbers -- Divide without / operator
            => Write a method that can divide two numbers without using division operator.
     */

    // Solution Below

    // need to work on this task

    public static void withOutOperator(int divided, int divider) {

        int division = 0;

        while (divided >= divider) {
            divided = divided - divider;
            division++;
        }
        System.out.println(division);
    }

    public static void main(String[] args) {

        withOutOperator(12,5);




    }

}





