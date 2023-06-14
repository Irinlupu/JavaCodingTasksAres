package nataliia.week4;

public class RemoveDuplicates {
    /*String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC*/

    public static String RemoveDuplicates (String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
         if(!(result.contains("" + each))) {
             result += each;
            }
        }
            return result;
        }

       /* each character of the String str
        if the string result does not contain the character of the string yet, then we will add a character to a String str*/
       public static void main(String[] args) {
           String str = "aaaabbbdddrrrkkjh";
           String RemoveDuplicates = RemoveDuplicates(str);
           System.out.println(RemoveDuplicates);
       }
    }

