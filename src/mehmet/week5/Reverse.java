package mehmet.week5;

public class Reverse {


//    String -- Reverse
// Write a function that can reverse String
// Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {
        System.out.println(reverseStrings("ABCDEFG"));
    }

    public static String reverseStrings(String str) {


        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += ("" + str.charAt(i));
        }

        return reversedString;
    }

}
