package Day_9;

import java.util.Scanner;

public class mergeSortedArray {
    public static void main(String[] args) {
        System.out.println("Should merge two sorted arrays");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int m = in.nextInt();
        int[] num1 = new int[m];
        System.out.println("Enter the elements of the first array");
        for(int i = 0;i < m;i++){
            num1[i] = in.nextInt();
        }
        System.out.println("Enter the size of second array");
        int n = in.nextInt();
        int[] num2 = new int[n];
        System.out.println("Enter the elements of second array");
        for (int i = 0;i < n;i++){
            num2[i] = in.nextInt();
        }
        merge(num1,m,num2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int g = m - 1;
        int h = n - 1;

        while (g >= 0 && h >= 0) {
            if (nums1[g] > nums2[h]) {
                nums1[i] = nums1[g];
                g--;
            } else {
                nums1[i] = nums2[h];
                h--;
            }
            i--;
        }

        while (h >= 0) {
            nums1[i] = nums2[h];
            h--;
            i--;
        }
    }
}
