package Yared.wee7;

public class FindMinArray {

    public static void main(String[] args) {
      int[] num = {5,4,3,2,1};

        System.out.println("minNumberArray(num) = " + minNumberArray(num));

    }


public static int minNumberArray(int[]  numbers){

        int min = numbers[0];

    for (int i = 0; i < numbers.length; i++) {

        if(numbers[i] < min){
            min = numbers[i];
        }
    }
         return min;
}


}
