import java.util.*;
public class Sub_Arrays {
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
    public static void subArrays(int arr[]){
        int ts = 0;
        for(int i =0 ; i<arr.length; i++){
            for(int j = i; j< arr.length; j++){ 
                for(int k = i; k<=j ; k++){
                    System.out.print(arr[k]+" ");
                    
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total sub arrays is "+ts);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in sub array :) ");
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        inputArray(arr);
        printArray(arr);
        subArrays(arr);
    }
     
}