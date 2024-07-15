import java.util.*;
public class BinToDecimal {
    public static int BinToDecimal(int bin){
        int ans = 0;
        for(int i=0; bin!=0;i++){
            int bit = bin%10;
            bin /=10;
            if(bit == 1){
                ans += Math.pow(2, i);
            } 
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int bin = sc.nextInt();
        System.out.println("Decimal value of "+bin+" is " +BinToDecimal(bin));
    }
}
