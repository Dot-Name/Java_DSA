import java.util.*;
public class sumInt {
    public static int SumOfInt(int n){
        int sum = 0;
        for (int i = 1; n!=0 ; i++){
            int remainder = n%10;
            n /=10;
            sum+=remainder;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits of "+num+" is "+SumOfInt(num));
    }
}
