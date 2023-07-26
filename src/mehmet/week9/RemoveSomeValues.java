package mehmet.week9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveSomeValues {

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>(Arrays.asList(100, 1, 2, 4, 101, 105, 108));

        System.out.println(" " + removeValues(numbers));
    }

    public static List<Integer> removeValues(List<Integer> numbers) {

        numbers.removeIf(x -> x > 100);

        return numbers;
    }
}
