package Day_2;

import java.util.ArrayList;
import java.util.Scanner;

public class stack_learning {
    public static void main(String[] args) {
        ArrayList<Integer> learn = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to add in to stack");
        int s = in.nextInt();
        learn.add(s);
        System.out.println(learn);
        learn.size();
        System.out.println(learn);
        learn.add(s);
        System.out.println(learn);
        System.out.println(learn.contains(3));
        learn.clear();
        System.out.println(learn);
        System.out.println(learn.contains(3));


    }
}
