package Yared.week2;

import java.util.Scanner;

public class PrintConsecutiveNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean check = false;
        int N = 0;
        System.out.println("Please enter a number");
        while (check == false) {
            N = input.nextInt();
            if (N > 0) { // users input cant be a negative number
                check = true;
            } else {
                System.out.println("Invalid try again");
            }
        }

        consecutive(N);

    }


    public static void consecutive(int N) {
        for (int i = 1; i <= N; i++) {

            if(i %2==0){
                if(i %3 ==0){
                    if(i %5 ==0){//2 3 amd 5 are true
                        System.out.println("codeality test coders");
                    }else{//2 and 3 are true
                        System.out.println("codeality test");
                    }

                }else if(i % 5 ==0){//2 amd 5 are true
                    System.out.println("codeality coders");
                }else{ //only 2 is true
                    System.out.println("codeality");
                }
            }else if(i %3 ==0){
                if(i % 5 ==0 ){//3 and 5 is true
                    System.out.println("test coders");
                }else{//on;y 3 is true
                    System.out.println("test");
                }
            }else if(i %5 ==0){//only 5 is true
                System.out.println("coders");
            }else{//none are true
                System.out.println(i);
            }


        }


    }
}
