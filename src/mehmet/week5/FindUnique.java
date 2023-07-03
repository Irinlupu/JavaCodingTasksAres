package mehmet.week5;

public class FindUnique {

    public static void main(String[] args) {
        System.out.println(uniqueChar("XXXCCCDDDSDG"));
    }

    //String - Find the unique
    // Write a return method that can find the unique characters from the String
    // Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static String uniqueChar(String str) {

        String uniqueCharacter = "";

        for (int i = 0; i < str.length() - 1; i++) {

            for (int j = 1; j < str.length(); j++) {


                if (str.charAt(i) == str.charAt(j)) {
                    str = str.replace(str.charAt(i) + "", "");
                    break;
                }
            }
        }
        return str;
    }

}
