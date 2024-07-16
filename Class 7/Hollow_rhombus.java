import java.util.*;

public class Hollow_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n ;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1 ; j<=n;j++){
                if(i == n || j == n || j == 1 || i ==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
