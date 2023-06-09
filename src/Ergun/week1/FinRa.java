package Ergun.week1;

public class FinRa {
/*
    Numbers -- FINRA
        => Write a method that prints out the numbers from 1 to 30 but;
            - for numbers which are multiple of 3 print "FIN" instead of the number,
            - for numbers which are multiple of 5, print "RA" instead of the number,
            - and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    // Solution below

    public static void finra(){
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i+ "- FINRA");
            } else if (i % 3 == 0){
                System.out.println(i+ "- FIN");
            }else if (i % 5 == 0){
                System.out.println(i+ "- RA");
            }
        }
    }

    public static void main(String[] args) {
        finra();
    }
}
