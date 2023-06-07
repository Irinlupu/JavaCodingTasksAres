package Yared.week2;

public class swapVariables {
    public static void main(String[] args) {
        Swap(12,10);


    }

    public static void Swap(int a, int b){

        a = a + b; //40
        b = a - b; // 10
        a = a - b; // 30

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
