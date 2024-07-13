import java.util.*;
public class leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not Leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not Leap year");
        }
    }
}
