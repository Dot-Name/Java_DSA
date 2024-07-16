import java.util.*;
public class isEven {
    public static boolean IsEven(int n){
        if(n%2!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(IsEven(num)){
            System.out.println("Even hai");
        }
        else{
            System.out.println("Odd hai");
        }
    }
}
