import java.util.*;
public class average {
    public static double Average(double num1, double num2, double num3){
        return ((num1+num2+num3)/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Average of "+a+" , "+b+" and "+c+" is "+Average(a, b, c));
    }
}
