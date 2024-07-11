import java.util.*;
public class Assignment_operator {
    public static void main(String[] args) {
        System.out.println("enter the Number: ");
        Scanner sc = new Scanner(System.in);
        Double num = sc.nextDouble();

        System.out.println("A+= 10 -> "+(num+=10));
        System.out.println("A-= 10 -> "+(num-=10));
        System.out.println("A*= 10 -> "+(num*=10));
        System.out.println("A/= 10 -> "+(num/=10));
        System.out.println("A%= 10 -> "+(num%=10));
    }
}
