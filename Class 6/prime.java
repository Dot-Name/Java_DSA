import java.util.*;
public class prime {
    public static boolean isprime(int n){
        if (Math.abs(n)==1||n==0){//corner case
            // flag = 0;
            return false;
        }
        for (int i = 2; i<=Math.sqrt(Math.abs(n)) ; i++){
            if(n%i==0){                
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        System.out.println(isprime(n));
    }
}
