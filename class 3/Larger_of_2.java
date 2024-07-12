import java.util.*;
public class Larger_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("Number 1 is greater than Number 2");
        }
        else if(num1 == num2){
            System.out.println("Number 1 is equal to Number 2");
        }
        else{
            System.out.println("Number 2 is greater than Number 1");
        }
    }
}
