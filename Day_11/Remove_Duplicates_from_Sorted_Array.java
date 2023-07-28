package Day_11;

import java.util.Scanner;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        System.out.println("Remove duplicates from sorted array 2");
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
        if (nums.length <= 2) {
            return nums.length;
        }
        int count = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[count - 2]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
