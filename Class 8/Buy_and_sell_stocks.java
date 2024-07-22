import java.util.Scanner;

public class Buy_and_sell_stocks {
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
    public static int buyAndSellProfit(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<arr.length;i++){
            if(buyPrice<arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        /*
        Buy And Sell Stock
        You are given an array prives where prices[i] is the prive of a given stock on the ith day, you want to maximize your profit by choosing a single day to but one stock and choosing a different day in the future to seell that stock. Return the maximum profit you can achieve form this transaction. if you cannot achieve any profit, return 0.
        prices = {7,1,5,3,6,4}

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Buy and Sell stock Question :) ");
        System.out.println("Enter the days of stock");
        int days = sc.nextInt();
        int arr[] = new int[days];
        inputArray(arr);
        printArray(arr);
        System.out.println("Profit of stocks: "+buyAndSellProfit(arr));
    }
}
