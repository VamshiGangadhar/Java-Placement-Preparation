package Day_10;

import java.util.Scanner;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        System.out.println("Remove Duplicates from Sorted Array");
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = in.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        System.out.println(removeDuplicates(nums));
        for(int i = 0;i < n;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int j = 1;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
                count++;
            }
        }
        return count;
    }
}
