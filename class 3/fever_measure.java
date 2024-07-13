import java.util.*;
public class fever_measure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature (in Ferhenhite): ");
        Double temp = sc.nextDouble();
        if(temp>100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You are fine");
        }
    }
}
