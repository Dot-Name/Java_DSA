import java.util.*;

public class oneton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        int i = 1;
        while (i<=num) {
            System.out.print(i+" ");
            i++;
        }
    }
}
