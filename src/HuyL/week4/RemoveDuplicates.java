package HuyL.week4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = scan.next();

        System.out.println(removeDup(str));
    }

    public static String removeDup(String str){

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString(); // I assign LinkedHashSet class of Collection which is to not allow duplicate and keep values insertion order to String str and use toString() method to convert it to string



        return str.replace(",","").replace("[","").replace("]",""); // returns str array, I use replace() method to get rid of square bracket, and comma as well
    }
}
