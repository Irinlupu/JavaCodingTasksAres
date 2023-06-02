package sufyan.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       String number = in.nextLine();
        List<String> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(number.split("")));
        System.out.print( arr.get(0));
        for (int i = arr.size()-1 ; i >= 1; i--) {
            System.out.print( arr.get(i));
        }




        }

    }

