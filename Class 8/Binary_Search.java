import java.util.*;
public class Binary_Search {
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
    public static int BinarySearch(int arr[], int key){
        int mid = arr.length/2;
        int s = 0;
        int e = arr.length -1;
        while(s<=e){
            if(key > arr[mid]){
                s = mid+1;
                mid = (s+e)/2;
            }
            else if(key < arr[mid]){
                e = mid-1;
                mid = (s+e)/2;
            }
            if(key == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in Binary Search :) ");
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        inputArray(arr);
        printArray(arr);
        System.out.println("What do you want to search: ");
        int key = sc.nextInt();
        if (BinarySearch(arr, key) == -1){
            System.out.println("not found !!");
        }
        else{
            System.out.println(key+" is at index: "+BinarySearch(arr, key));
        }
    }
}
