import java.util.*;
public class Area_of_Circle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle: ");
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();//float r = sc.nextDouble();
        Double area = 3.14*r*r;// float area = 3.14f *r*r;
        System.out.println("Area of Circle is "+area);
    }
}
