import java.util.*;
//bin = (digit*10^i)+bin;
public class decimalToBin {
    public static int DeciToBin(int n){
        int ans = 0;
        for(int i=0; n!=0; i++){
            int remainder = n%2;
            n /=2;
            ans = (remainder*(int)(Math.pow(10, i))) + ans;
            if (i == 0 && remainder == 0){
                ans *= 10;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(In integer) : ");
        int deci = sc.nextInt();
        System.out.println("Binary of "+deci+" is "+DeciToBin(deci));

    }
}
