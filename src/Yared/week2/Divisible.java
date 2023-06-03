package Yared.week2;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int N = input.nextInt();

        String d15 = " Divisible By 15";
        String d3 = " Divisible By 3";
        String d5 = " Divisible By 5";
        for(int i = 1; i <= N; i++){
            if(i % 3 == 0 && i % 5 ==0){
                d15 = d15 +" " +i;
            }
            if(i %3== 0 && i % 5 != 0){
                d3 = d3 + " " +i;
            }
            if(i % 3 !=0 && i %5 == 0 ){
                d5 = d5 + " " +i;
            }
        }

        System.out.println(d3);
        System.out.println(d5);
        System.out.println(d15);

    }
}
