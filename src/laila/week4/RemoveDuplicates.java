package laila.week4;

public class RemoveDuplicates {
    /*String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

     */
    public static void main(String[] args) {
        System.out.println(frequency("shshsgyww"));
    }
    public static String frequency(String str) {

        String result = "";
        String[] array = str.split("");
        for(int i = 0; i < array.length; i++) {

            if (!(result.contains(array[i]))) {
                result += array[i];
            } else {
                continue;
            }
        }
        return result;
    }
}
