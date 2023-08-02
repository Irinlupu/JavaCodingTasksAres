package mehmet.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingDesc {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5,2,8,1,3));
        System.out.println("Original List: " + numbers);
        sortDescending(numbers);
        System.out.println("Sorted List: " + numbers +
                "\n-------------------------------------------------------------------------------");



        List<String> words = new ArrayList<>(Arrays.asList("Muhtar","Saim","Bryan","Gurhan","Mehmet"));
        System.out.println("Original List: " + words);
        sortDescending(words);
        System.out.println("Sorted List: " + words);
    }


    public static<T extends Comparable<T>> List<T> sortDescending(List<T> list){

        T tempValue ;

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i).compareTo(list.get(j)) > 0){
                    tempValue = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tempValue);
                }
            }
        }

        return list;
    }
}
