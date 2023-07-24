package Day_7;

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println("Let's find the maximum of a sub array");
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n;i++){
            nums[i] = in.nextInt();
        }
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
