import java.util.*;
public class Reverse_Array {
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
    public static void reverseArray(int arr[]){
        int s = 0;
        int e = arr.length-1;
        System.out.println("Reversing the array");
        while(s<e){
            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
            e--;
            s++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in reversing the array :) ");
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        inputArray(arr);
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }
}
