import java.util.*;

public class reverse_of_number {
    public static void main(String[] args) {
        System.out.println("Enter the number; ");
        Scanner sc = new Scanner(System.in);
        //my way
        /*
        String num = sc.next();
        int length = num.length();
        String reverse = "";
        int n = Integer.parseInt(num);
        for (int i = 1; i<=length; i++){
            int digit = n%10;
            reverse = reverse + digit;
            n = n/10;
        }
        int reverseNumber = Integer.parseInt(reverse);
        System.out.println(reverseNumber);
         */

        //cheap way
        /* 
        int num = sc.nextInt();
        while (num>0) {
            int digit = num%10;
            System.out.print(digit);
            num/=10;
        }
        */

        //pro way
        // formula rev = (rev*10) + lastDigit

        int n = sc.nextInt();
        int rev=0;
        while (n>0) {
            int digit = n%10;
            rev = (rev*10)+digit;
            n/=10;
        }
        System.out.println(rev);
        // topic - do while loop, break, continue
    }
}
