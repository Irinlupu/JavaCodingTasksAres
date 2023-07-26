package mehmet.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNameAhmed {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron", "Osman", " "));
        System.out.println("removeAhmed(names) = " + removeAhmed(names));
    }

    public static List<String> removeAhmed(List<String> list) {

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equalsIgnoreCase("ahmed")) {
                iterator.remove();
            }
        }

        return list;
    }
}
