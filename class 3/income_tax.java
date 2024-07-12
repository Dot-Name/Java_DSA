import java.util.*;

public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        Double salary = sc.nextDouble();
        if(salary<500000){
            System.out.println("Your income with 0% tax is "+salary);
        }
        else if(salary>=500000 && salary<1000000){
            System.out.println("Your income with 20% tax is "+(salary-(salary*0.2)));
        }
        else{
            System.out.println("Your income with 30% tax is "+(salary-(salary*0.3)));
        }

    }
}
