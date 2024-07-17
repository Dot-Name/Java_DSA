import java.util.*;

public class LargestNumber {
    public static void inputArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number at "+i+" index : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }
    public static void printArray(int arr[]){
        System.out.println("Your array is : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int largestArrayElemetn(int arr[]){
        // int large = -999999999;
        // int large = Integer.MAX_VALUE
        int large = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if (large<arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Largest element of Array :)");
        System.out.println("enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        inputArray(arr);
        printArray(arr);
        System.out.println("Largest number in array is : "+largestArrayElemetn(arr));
    }
}
