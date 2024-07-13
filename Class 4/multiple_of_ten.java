import java.util.*;

public class multiple_of_ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1; ;i++){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            else{
                System.out.println("Your number is "+n);
            }
        }
    }
}
