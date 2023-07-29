package Day_12;

import java.util.Arrays;
import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        System.out.println("Print the majority element");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int val = 0;
        int prev_count = 0;
        if(nums.length == 1){
            val = nums[0];
        }
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count > nums.length/2){
                    if(count > prev_count){
                        val = nums[i];
                    }
                }
            }
            else{
                prev_count = count;
                count = 1;
            }
        }
        return val;
    }
}
