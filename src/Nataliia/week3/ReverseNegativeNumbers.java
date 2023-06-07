package nataliia.week3;

import java.util.Scanner;

public class ReverseNegativeNumbers {
    public static CharSequence reverse (int num){
        String str = Integer.toString(num);
        String reverse = "";
        for (int i= str.length() - 1; i >=0  ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please, enter a negative number");
        int number = input.nextInt();
        number *= (-1);

        System.out.println("Reverse number " + "-" + reverse(number));
    }

}
