package sufyan.week8;

public class SumOfAll {

    //Question 1: Array - N unique integers that sum up to 0
    //Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    //The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5].
    // The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
    // For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).

    public static void main(String[] args) {


            int result ;
        int[] numArray = new int[4];


        do {
            result=0;
            for (int i = 0; i < numArray.length; i++) {
                numArray[i] =  (int)(Math.random()*(200 + 1)) - 100;
                result += numArray[i];

            }
        }while (result != 0);
        int sum = 0;

        for (int i = 0; i < numArray.length; i++) {
            System.out.println("numArray["+i+"] = " + numArray[i]);
            sum += numArray[i];
        }

        System.out.println("result = " + result);
        System.out.println("sum = " + sum);

    }





}
