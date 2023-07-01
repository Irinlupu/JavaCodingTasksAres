package andriy.week7;

public class ArrayMinNum {
    /*
    Question1: Array - Find Minimum
Write a method that can find the minimum number from an int Array
     */

    public static int array_min_num(int[] num){
        int min = Integer.MAX_VALUE;
        for (int eachNum : num) {
            if (min > eachNum ){
                min = eachNum;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] num = {-5,5,9,7,3,-9};

        System.out.println(array_min_num(num));
    }
}
