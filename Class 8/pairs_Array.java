import java.util.Scanner;

public class pairs_Array {
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
    public static void pairsArray(int arr[]){
        System.out.println("Pairs of Array");
        int tp = 0;
        for( int i = 0 ; i<arr.length; i++){
            for( int j = i+1; j<arr.length; j++){
                System.out.print("( "+arr[i]+" , "+arr[j]+" )");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are "+tp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in reversing the array :) ");
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        inputArray(arr);
        printArray(arr);
        pairsArray(arr);
    }
}
