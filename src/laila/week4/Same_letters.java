package laila.week4;

public class Same_letters {

    public static boolean sameLetters(String str1, String str2){
        if(str1.length()== str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                char ch1 = str1.charAt(i);
                for (int j = 0; j < str2.length(); j++) {
                    char ch2 = str2.charAt(j);
                    if (!(str1.contains(ch2 + ""))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("abrrr", "arrrb"));
    }
}
/*
➡️ String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */