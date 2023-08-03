package Day_13;
import java.util.Scanner;
import java.lang.Integer;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println("Best time to buy and sell stock");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int k = in.nextInt();
        int[] Prices = new int[k];
        System.out.println("Enter the prices of the particular day");
        for(int i = 0;i < k;i++){
            Prices[i] = in.nextInt();
        }
        System.out.println(maxProfit(Prices));
    }
    public static int maxProfit(int[] Prices){
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < Prices.length;i++){
            if(min > Prices[i]){
                min = Prices[i];
            }
            int currProfit = Prices[i] - min;
            profit = currProfit > profit? currProfit : profit;

        }
        return profit;
    }
}
