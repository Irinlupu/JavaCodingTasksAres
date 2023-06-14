package mehmet.week3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-1234));
    }

    public static int reverseNegativeNumber(int number) {

        String newNumber = "";

        if (number < 0) {
            int lastIndex = -1 * number % 10;
            int middleIndex = -1 * number / 10;
            newNumber = "-" + lastIndex + middleIndex;

        } else
            System.exit(0);


        return Integer.parseInt(newNumber);
    }
}

/*
Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
*/