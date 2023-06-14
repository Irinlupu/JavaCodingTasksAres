package mehmet.week4;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(sameLetters("abcdfg","bcdfga"));
    }

    public static boolean sameLetters(String str1, String str2){
        int counter = str1.length();
        for (int i = 0; i < str1.length(); i++){
            if (str2.contains(str1.charAt(i) + "")){
                counter--;
            }
        }

        if (counter == 0){
            return true;
        }

        return false;
    }
}
