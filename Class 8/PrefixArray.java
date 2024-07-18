import java.util.Scanner;

public class PrefixArray {
    // Optimized method
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
    public static int[] computePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for(int i=1; i<n ;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }
    public static void maxSubarraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = computePrefixSum(arr);
        for(int i = 0; i<arr.length ; i++){
            int start = i;
            for(int j = i; j<arr.length; j++){
                int end = j;
                currSum = start==0?prefixSum[end]:prefixSum[end] - prefixSum[start-1];
                if(maxSum<currSum){
                    maxSum = currSum;
                }
                
            }
        }
        System.out.println("max: "+maxSum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in sub array max :) ");
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        inputArray(arr);
        printArray(arr);
        maxSubarraySum(arr);

    }
}
