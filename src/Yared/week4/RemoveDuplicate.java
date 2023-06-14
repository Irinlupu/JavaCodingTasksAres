package Yared.week4;

public class RemoveDuplicate {
    public static String Duplicate(String str){

        String result = ""; //store

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i); // will get each string

            if(!(result.contains(""+each))){ // if the char is not contain it will be added to result if not it will skip it
                result+=each;
            }

        }
        return result;
    }
}
