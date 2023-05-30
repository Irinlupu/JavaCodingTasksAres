package mehmet.week1;

public class DivisionWithoutOperator {
    /*
    Numbers -- Divide without / operator
            => Write a method that can divide two numbers without using division operator.
     */

    // Solution Below


    public static void main(String[] args) {
        System.out.println(divide(14, 3));
    }

    public static Double divide(int num1, int num2) {

        int remainder = 0, dividedInteger = 0, dividedDecimal = 0;

        while (num1 > 0 && num1 >= num2) {
            num1 -= num2;
            dividedInteger++;

        }

        remainder = num1 * 10;

        while (remainder > 0 && remainder >= num2) {
            remainder -= num2;
            dividedDecimal++;
        }

        return Double.valueOf(dividedInteger + "." + dividedDecimal);

    }


}
