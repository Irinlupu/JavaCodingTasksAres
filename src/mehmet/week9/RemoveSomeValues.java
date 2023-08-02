package mehmet.week9;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveSomeValues {

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>(Arrays.asList(100, 1, 2, 4, 101, 105, 108));

        System.out.println(" " + removeValues3(numbers));
    }

    public static List<Integer> removeValues(List<Integer> numbers) {

        numbers.removeIf(x -> x > 100);

        return numbers;
    }

    public static List<Integer> removeValues3(List<Integer> numbers) {


        return numbers.stream().filter(x -> x <= 100).collect(Collectors.toList());

    }

}
