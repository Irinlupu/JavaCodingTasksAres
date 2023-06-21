package irina.week5;

public class UniqueCharacters {

        /*
        String - Find the unique
         Write a return method that can find the unique characters from the String
         Ex: unique("AAABBBCCCDEF") ==> "DEF";
         */

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println("uniqueCharacter(str) = " + uniqueCharacter(str));


    }

    public static String uniqueCharacter(String str){
        String uniqueCharacters = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                char eachLetter = str.charAt(j);
                if(each == eachLetter){
                    count++;
                }

            }
            if (count == 1){
                uniqueCharacters+= each;

            }
        }
        return uniqueCharacters;

    }
}
