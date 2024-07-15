import java.util.*;
public class prime_Range {
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
    public static void primesInRange(int n){
        for(int i=1; i<=n; i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        primesInRange(n);
    }
}
