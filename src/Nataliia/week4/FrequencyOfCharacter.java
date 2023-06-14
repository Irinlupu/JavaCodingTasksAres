package nataliia.week4;

public class FrequencyOfCharacter {
    /*String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static String FrequencyOfCharacter(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == character) {
                    count++;
                }
            }
                    if (result.contains(String.valueOf(character))) {
                    continue;
                }
                    result += character + "" + count + "; ";
                }
                return result;
        }

    public static void main (String[]args){
                String str = "AAABBCDD";
                String FrequencyOfCharacters = FrequencyOfCharacter(str);

                System.out.println(FrequencyOfCharacters);
            }
}
