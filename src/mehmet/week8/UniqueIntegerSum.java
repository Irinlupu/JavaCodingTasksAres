package mehmet.week8;

import java.util.Arrays;

public class UniqueIntegerSum {

    //1️⃣ Question 1: Array - N unique integers that sum up to 0
    //Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    //The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5].
    // The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
    // For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }


    public static int[] sumZero(int n) {
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = i * 2 - n + 1;
        }
        return ans;
    }
}
