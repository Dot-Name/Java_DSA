import java.util.*;

public class linearSearch {
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
    public static int LinaerSearch(int arr[], int key){
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to linear Search :)");
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        inputArray(arr);
        printArray(arr);
        System.out.print("Which one element do you want to find: ");
        int key = sc.nextInt();
        if(LinaerSearch(arr, key) == -1){
            System.out.println("not found");
        }
        else{
            System.out.println(key+" is at index "+LinaerSearch(arr , key));
        }

        
    }
}
