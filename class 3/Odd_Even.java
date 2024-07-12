import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.err.println("Number is even: "+num);
        }
        else if(num%2!=0){
            System.err.println("Number is odd: "+num);
        }
        else{
            System.out.println("Invald input");
        }
    }
}
