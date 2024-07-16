import java.util.*;
public class Hallow_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        for(int i =1; i<=b; i++){
            for(int j = 1; j<=l ; j++){
                if(i == 1 || j == 1 || i == b || j == l ){
                    System.out.print("* ");
                }
                else{
                    System.err.print("  ");
                }
            }
            System.out.println();
        }
    }
}
