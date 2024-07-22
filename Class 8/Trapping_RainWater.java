import java.util.*;
public class Trapping_RainWater {
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
    public static int trapRainWater(int arr[]){
        int height = arr.length;
        int leftMax[] = new int[height];
        int rightMax[] = new int[height];
        leftMax[0] = arr[0];
        int max = leftMax[0];
        rightMax[height-1] = arr[height-1];
        int min = arr[height-1];
        for(int i=1; i<height; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            leftMax[i] = max;
            // leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        for(int i=height-2; i>=0; i--){
            if(min<arr[i]){
                min = arr[i];
            }
            rightMax[i] = min;
        }
        // for(int i = height-2; i>=0; i--){
        //     rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        // }
        int waterStored=0;
        for (int i = 0; i<height; i++){
            int wL = Math.min(leftMax[i],rightMax[i]);
            int vol = (wL-arr[i])*1;
            waterStored += vol;
        }
        return waterStored;
    }
    public static void main(String[] args) {
        /*
        Trap Rain water
        -> Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining. 
        h = [4,2,0,6,3,2,5]
        ans = 11
        Hint: 1). auxilary array
            2). (waterlevel-barlevel)*width
            3). waterlevel = min(leftMax, rightMax)

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Trap water Question :) ");
        System.out.println("Enter the height of building");
        int height = sc.nextInt();
        int arr[] = new int[height];
        inputArray(arr);
        printArray(arr);
        System.out.println("RainWater stored : "+trapRainWater(arr));
    }
}
