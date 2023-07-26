package Yared.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRemoveNameAhmed {

    public static void main(String[] args) {

       ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed","Ahmed","John","Eric","Ahmed","Ahmed"));

       ArrayList<String> namesWithout = new ArrayList<>(); // stores only uniuq elements

        for (int i = 0; i < names.size(); i++) {

            if(!namesWithout.contains(names.get(i))){
                namesWithout.add(names.get(i));
            }

            if(namesWithout.contains("Ahmed")){
                namesWithout.remove("Ahmed");
            }

        }

        System.out.println(namesWithout);

    }
}
