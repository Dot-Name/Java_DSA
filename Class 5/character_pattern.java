import java.util.*;
public class character_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        char ch = 'A';
        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=i; j++, ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
