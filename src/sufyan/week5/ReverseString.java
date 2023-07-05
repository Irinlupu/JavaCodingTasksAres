package sufyan.week5;

public class ReverseString {

public static StringBuilder reverse(String word){
    StringBuilder str = new StringBuilder(word);
    return  str.reverse();

}
    //➡️ String -- Reverse
    // Write a function that can reverse String
    // Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {


        System.out.println(reverse("youssra"));

    }
}
