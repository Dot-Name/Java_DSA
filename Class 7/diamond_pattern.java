import java.util.*;;

public class diamond_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int num = (2*n)-1;
        for(int i = 1; i<=n ;i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=((2*i) - 1) ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i<=n ;i++, num-=2){
            for(int j = 1; j<=i-1; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=num ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
