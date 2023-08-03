package Day_13;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        System.out.println("Enter the rotation number");
        int k = in.nextInt();
        rotate(nums,k);
        for(int l = 0;l < nums.length;l++){
            System.out.print(nums[l]+" ");
        }
    }
    public static void rotate(int[] nums,int k){
        int j = nums.length;
        k = k % j;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = k;
        for (int l = j - k; l < j; l++) {
            arr.add(nums[l]);
        }
        for(int l = 0;l < nums.length-k;l++){
            arr.add(nums[l]);
        }
        for(int l = 0;l < nums.length;l++){
            nums[l] = arr.get(l);
        }
    }
}
