package andriy.week4;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class SameLetters {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first String:");
        String str1 = input.next();

        System.out.println("Enter your second String:");
        String str2 = input.next();

        System.out.println(sameLetters(str1,str2));
    }

    // First approach
    public static boolean sameLetter2( String str1, String str2) {

        str1= str1.replace(" ","").trim();
        str2 = str2.replace(" ","").trim();

     // List<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        TreeSet<String> sortedList1 = new TreeSet<>(Arrays.asList(str1.split("")));

      //  List<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
        TreeSet<String> sortedList2 = new TreeSet<>(Arrays.asList(str2.split("")));

        String sortedStr1 = String.join("",sortedList1);
        String sortedStr2 = String.join("",sortedList2);

        return sortedStr1.equals(sortedStr2);
    }

    //Second approach
    public static boolean sameLetters(String str1, String str2){

       String [] arrStr1 =  str1.split("");
       String [] arrStr2 = str2.split("");

        Collections.sort(Arrays.asList(arrStr1));
        Collections.sort(Arrays.asList(arrStr2));

       String newStr1= Arrays.toString(arrStr1);
       String newStr2= Arrays.toString(arrStr2);

        return newStr1.equals(newStr2);
    }
}
/*
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */