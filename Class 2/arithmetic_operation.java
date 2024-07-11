import java.util.*;
public class arithmetic_operation {
    public static void main(String[] args) {
        // binary
        System.out.println("Binary operator :) ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Addition of two number is "+(num1+num2));
        System.out.println("Substraction of two number is "+(num1-num2));
        System.out.println("Multiplication of two number is "+(num1*num2));
        System.out.println("division of two number is "+(num1/num2));
        System.out.println("Modulus of two number is "+(num1%num2));

        // Unary
        System.out.println("Unary operator :) ");
        // a++ , ++a , a--, --a
    }
}
