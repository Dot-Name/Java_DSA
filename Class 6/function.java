
import java.util.*;
public class function {
    //function
    /*
    public static void printHelloWorld(){
        System.out.println("Hello World !!");
    }
    */
    /*public static int SumOfab(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
    public static void printHelloWorld(){
        System.out.println("Hello World !!");
        System.out.println("Hello World !!");
        System.out.println("Hello World !!");
        return;
    }*/
    // call by value
    /* 
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("(in function) after swaping a is "+a+" b is "+b);
    }*/
    /* 
    public static int prod(int a, int b){
        return (a*b);
    }*/

    // factorial
    public static int fact(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static int binomial_Coefficent(int n, int r){
        return ((fact(n))/(fact(r)*fact(n-r)));
    }
    public static void main(String[] args) {
        // printHelloWorld();
        Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the two Number: ");
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // System.out.println("Sum is "+SumOfab(x, y));
        
        // swap
        /* 
        int a = 5;
        int b = 10;
        System.out.println("before swaping a is "+a+" b is "+b);
        swap(a, b);
        System.out.println("after swaping a is "+a+" b is "+b);*/
        /* 
        int a =3;
        int b = 5;
        int mul = prod(a, b);
        System.out.println("product of a and b is "+mul);*/

        //factorial
        /* 
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));*/

        //binomial Coefficent
        int n = 5;
        int r = 2;
        System.out.println("binomial Coefficent: "+binomial_Coefficent(n, r));
    }
}
