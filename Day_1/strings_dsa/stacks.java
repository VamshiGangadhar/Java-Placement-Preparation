package Day_1.strings_dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class stacks {
    public static void main(String[] args) {
        System.out.println("-------------------------Stacks-------------------------");
        int arr[] = new int[5];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Character> string_stack = new ArrayList<Character>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter something in stack");
        String s = in.nextLine();
        string_stack.add(s.charAt(8));
        arrayList.add((int) s.charAt(8));
        System.out.println(string_stack);
        System.out.println(arrayList);

    }
}
