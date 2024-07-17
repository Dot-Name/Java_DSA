import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int marks[] = new int[5];
        //static hota hai array, array ka size change nhi hota runtime par
        int numbers[] = {1,2,3,4};
        int morenumbers[] = {5,6,7};
        String fruits[] = {"apple", "mango", "orange"};
         */
        int marks[] = new int[30];
        for(int i=0; i<3 ; i++){
            marks[i] = sc.nextInt();
        }
        marks[2] = 100;
        int per=0;
        for(int i=0; i<3 ; i++){
            per =per+ marks[i];
            System.out.println("marks at "+i+" index :"+marks[i]);
        }
        per /= 3;
        System.out.println("percentage: "+per);
        System.out.println("Length of array: "+marks.length);
        
        

    }
}
