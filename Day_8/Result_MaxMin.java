package Day_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Result_MaxMin {
    public static void main(String[] args) {
        System.out.println("-----We have to return the minimum possible unfairness-----");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the list");
        int n = in.nextInt();
        System.out.println("Enter the value of sub array");
        int k = in.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the elements of the list");
        for(int i = 0;i < n;i++){
            int g = in.nextInt();
            arr.add(g);
        }
        System.out.println(maxMin(k,arr));
    }
    public static int maxMin(int k, List<Integer> arr){
        Collections.sort(arr);
        int min_unfairness = Integer.MAX_VALUE;
        for(int i = 0;i <= arr.size()-k;i++){
            int cur_min_unfairness = arr.get(i+k-1) - arr.get(i);
            min_unfairness = Math.min(cur_min_unfairness,min_unfairness);
        }
        return min_unfairness;
    }
}
