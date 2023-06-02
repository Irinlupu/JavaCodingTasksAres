package laila.week2;

public class Swap_Numbers {
    /*Numbers – Swap Numbers
Swap two variables' values without using a third variable.
     */
    public static void main(String[] args) {
        int a=5;
        int b=9;
      //  System.out.println(a);//a=5
      //  System.out.println(b);//b=9
        a=a+b;//b=14
       // System.out.println(a);//a=14
      //  System.out.println(b);//b=9
        b=a-b;//b=5
       // System.out.println(a);//a=14
       System.out.println(b);//b=5
        a=a-b;//a=9
        System.out.println(a);//a=9
      //  System.out.println(b);//b=5

        String h = "hello";
        String w = "world";

        h=h+w;
        w=h.substring(0,h.length()-w.length());
        h=h.substring(w.length());
        System.out.println("w "+w);
        System.out.println("h "+h);



    }
}
