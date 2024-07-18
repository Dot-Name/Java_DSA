import java.util.Scanner;

public class Kadane_Algo {
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
    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<arr.length;i++){
            cs = cs+arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        if(ms == 0){
            ms = Integer.MAX_VALUE;
            for(int i = 0; i<arr.length;i++){
                if(ms>arr[i]){
                    ms = arr[i];
                }
            }
        }
        System.out.println("Our max subarray sum is : "+ms);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in sub array max :) ");
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        inputArray(arr);
        printArray(arr);
        kadanes(arr);
    }
}
