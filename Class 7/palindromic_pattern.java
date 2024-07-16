import java.util.*;

public class palindromic_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int num ;
        for(int i = 1 ;i<=n ;i++){
            num = i;
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1 ; j<=((2*i)-1) ; j++){
                if(num <= 0){
                    System.out.print((num+j-i+1)+" ");
                }
                else{
                    System.out.print(num+" ");
                    num-=1;
                }
                
            }
            System.out.println();
        }
    }
}
