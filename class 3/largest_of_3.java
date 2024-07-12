import java.util.*;

public class largest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Number "+num1+" is greatest");
        }
        else if(num2>num1 && num2> num3){
            System.out.println("Number "+num2+" is greatest");
        }
        else{
            System.out.println("Number "+num3+" is greatest");
        }
    }
}
