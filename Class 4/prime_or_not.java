import java.util.*;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        //bhai ka tarika
        
        int flag = 1;
        if (n==1||n==0){
            flag = 0;
        }
        for (int i = 2; i<=n ; i++){
            if(n%i==0){
                flag = 0;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Not prime");
        }
        else{
            System.out.println("Prime");
        }        
    }
}
