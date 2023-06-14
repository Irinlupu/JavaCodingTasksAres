package laila.week4;

import com.sun.source.tree.BreakTree;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        String result = "";
        int count = 0;
        String [] array =str.split("");
        for (int i = 0; i < str.length(); i++) {
            if(!(result.contains(str.charAt(i)+""))){

            }

            for (int j = 0; j < array.length; j++) {
                if(result.contains(str.charAt(j)+"")){

                }

            }
        }

    }

}
/*➡️ String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

chatGPT :
public static String getFrequencyOfChars(String str) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Build the result string
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            result.append(c).append(count);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String frequency = getFrequencyOfChars(input);
        System.out.println(frequency); // Output: A3B2C1D2
    }
 */