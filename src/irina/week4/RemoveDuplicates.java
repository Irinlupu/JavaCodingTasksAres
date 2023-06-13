package irina.week4;

public class RemoveDuplicates {

    /*
    String -- Remove Duplicates
        Write a return method that can remove the duplicated values from String
        Ex: removeDup("AAABBBCCC") ==> ABC

     */
    public static void main(String[] args) {

        String str = "11225586544445555AABBBCDDD";

        System.out.println(removeDuplicates(str));

    }
    public static String removeDuplicates(String str){

        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            if(!newString.contains(str.substring(i, i+1))){
                newString+= str.substring(i,i+1);
            }

        }



        return  newString;

    }
}
