import java.util.*;
public class ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ternary Operator
        //Syntax
        //variable = contition? statement1 : statement2;
        // System.out.println("enter the two number: ");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int larger = (num1>num2) ? num1 : num2;
        // System.out.println(larger);
        System.out.println("enter your marks: ");
        int marks = sc.nextInt();
        String status = (marks>33)? "pass":"fail";
        System.out.println(status);
    }
}
