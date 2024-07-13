import java.util.*;
public class positive_negetive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        Double num1 = sc.nextDouble();
        if(num1>0){
            System.out.println("Positive");
        }
        else if(num1<0){
            System.out.println("Negetive");
        }
        else if(num1 == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("invalid input");
        }
    }
}
