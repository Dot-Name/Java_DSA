import java.util.*;
public class Relational_operator {
    public static void main(String[] args) {
        System.out.println("Enter the two number: ");
        Scanner sc = new Scanner(System.in);
        Double num1 = sc.nextDouble();
        Double num2 = sc.nextDouble();
        System.out.println("a==b : "+(num1==num2));
        System.out.println("a!=b : "+(num1!=num2));
        System.out.println("a>b : "+(num1>num2));
        System.out.println("a>=b : "+(num1>=num2));
        System.out.println("a<b : "+(num1<num2));
        System.out.println("a<=b : "+(num1<=num2));
    }
}
