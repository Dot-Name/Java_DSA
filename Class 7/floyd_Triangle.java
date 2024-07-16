import java.util.*;;

public class floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int x =1;
        for(int i = 1 ;i<=n; i++){
            for(int j = 1; j<=i; j++,x++){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
