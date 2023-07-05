package mehmet.week4;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBBCCCD45645646444466666667777"));

    }


    public static String removeDuplicates(String str) {

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {

            newStr = newStr + "" + str.charAt(i);

            for (int j = 1; j < str.length() - 1; j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    str = str.replace(str.charAt(j) + "", " ");
                }
            }
        }

        return newStr.replaceAll(" ", "");
    }
}
