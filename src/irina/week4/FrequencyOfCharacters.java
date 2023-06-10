package irina.week4;

public class FrequencyOfCharacters {
    /*
    String -- Frequency of Characters
        Write a return method that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        String str = "AAABBCDD";
        frequencyOfCharacters(str);
    }

    public static void frequencyOfCharacters(String str) {

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char each = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char other = str.charAt(j);
                if(each == other){
                    count++;
                }
            }

            if(newStr.contains("" + each)){
                continue;
            }

            newStr+= each;
            newStr+= count;

        }


        System.out.println(newStr);

    }


}

