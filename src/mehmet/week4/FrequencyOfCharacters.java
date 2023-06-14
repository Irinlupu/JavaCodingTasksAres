package mehmet.week4;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println("frequencyOfCharacters(\"AAABBBCCCD\") = " + frequencyOfCharacters("AAABBBCCCD"));
    }

    public static String frequencyOfCharacters(String str) {

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            int counter = 0;

            if (result.contains(str.charAt(i) + "")) {
                continue;
            } else {
                result += str.charAt(i) + "";
                for (int j = 0; j < str.length(); j++){
                    if (str.charAt(i) == str.charAt(j)){
                        counter++;
                    }
                }
                result += counter;
            }
        }
        return result;
    }
}
