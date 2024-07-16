import java.util.*;
public class palindrome {
    public static int reverse(int n){
        int rev = 0;
        for(int i = 1;n!=0;i++){
            int remainder = n%10;
            n /=10;
            rev = (rev*10) + remainder;
        }
        return rev;
    }
    public static boolean isPalindrome(int n){
        if(n == reverse(n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }
}
