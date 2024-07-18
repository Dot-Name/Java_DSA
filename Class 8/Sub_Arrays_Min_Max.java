import java.util.Scanner;

public class Sub_Arrays_Min_Max {
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
    // public static int maxArray(int arr[]){
    //     // int large = -999999999;
    //     // int large = Integer.MIN_VALUE
    //     int large = Integer.MIN_VALUE;
    //     for(int i = 0; i<arr.length; i++){
    //         if (large<arr[i]){
    //             large = arr[i];
    //         }
    //     }
    //     return large;
    // }
    // public static int minArray(int arr[]){
    //     // int min = 999999999;
    //     // int min = Integer.MAX_VALUE
    //     int min = Integer.MAX_VALUE;
    //     for(int i = 0; i<arr.length; i++){
    //         if (min>arr[i]){
    //             min = arr[i];
    //         }
    //     }
    //     return min;
    // }
    public static void subArraysMinMax(int arr[]){
        int maxSum = arr[0];
        int minSum = arr[0];
        for(int i =0 ; i<arr.length; i++){
            for(int j = i; j< arr.length; j++){ 
                int sum = 0;
                for(int k = i; k<=j ; k++){
                    sum +=arr[k];
                }
                if(maxSum < sum){
                    maxSum = sum;
                }
                if(minSum > sum){
                    minSum = sum;
                }
            }
        }
        System.out.println("Max : "+maxSum);
        System.out.println("Min : "+minSum);
    }
    /*
     Good for all positive integer but not for all integers
    public static void MinMaxSubArray(int arr[]){
        int min = arr[0];
        int max = 0;
        for (int i = 0; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            max += arr[i];
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in sub array min max :) ");
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        inputArray(arr);
        printArray(arr);
        subArraysMinMax(arr);

    }
}
