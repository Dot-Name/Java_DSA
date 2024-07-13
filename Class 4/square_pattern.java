import java.util.*;

public class square_pattern {
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<=num ; i++){
            for(int j = 1; j<=num ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
