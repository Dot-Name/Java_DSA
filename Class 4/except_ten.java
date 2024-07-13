import java.util.*;
public class except_ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; ;i++){
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
            if(n%10==0 && n!=0){
                continue;
            }
            else if(n == 0){
                break;
            }
            else{
                System.out.println("Number is "+n);
            }
        }
    }
}
