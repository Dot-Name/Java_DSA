import java.util.*;
public class Set_of_integer_oddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int OddSum = 0;
        int choice;
        do{
            System.out.println("Enter the Number: ");
            int num = sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }
            else{
                OddSum+=num;
            }
            System.out.println("Do you want to enter more number(1-yes, 0-no): ");
            choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("Sum of Even number is "+evenSum);
        System.out.println("Sum of Odd number is "+OddSum);
    }
}
