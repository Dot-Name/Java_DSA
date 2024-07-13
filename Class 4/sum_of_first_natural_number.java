import java.util.*;

public class sum_of_first_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=num) {
            sum+=i;
            i++;
        }
        System.out.println("Sum of "+num+" number is "+sum);
    }
}
