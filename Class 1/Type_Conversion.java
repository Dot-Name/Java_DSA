import java.util.*;
public class Type_Conversion {
    public static void main(String[] args) {
        /*
         * 
         int a = 25;
         long b = a;
         System.out.println(b);
         */
        // float a = 25.9999999f;//it will give 26 ?? 
        // float a = 25.99f;//it will give 25
        // int b = a;will give error
        // char ch = 'a';
        // int b = ch;
        // System.out.println(b);
        char a = 'a';
        char b = 'b';
        char c = (char)(a-b);
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(a);
        System.out.println(b-a);
        System.out.println(c);
    }
}
