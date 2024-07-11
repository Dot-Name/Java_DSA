import java.util.*;
public class product_of_A_and_B {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers : ");
        Scanner sc = new Scanner(System.in);
        Double num1 = sc.nextDouble();
        Double num2 = sc.nextDouble();
        Double prod = num1*num2;
        System.out.println("Product of two numbers is : " +prod);
    }
}
