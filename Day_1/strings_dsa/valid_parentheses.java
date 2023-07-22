package Day_1.strings_dsa;

import java.awt.*;
import java.util.Scanner;

public class valid_parentheses {
    public static void main(String[] args) {
        System.out.println("Valid Parentheses");
        System.out.println("Enter the string to check for parenthesis");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        System.out.println(s);
        int b = (int)(s.charAt(0));
        int c = (int)(s.charAt(1));
        int count = 0;
        for (int i = 0;i < s.length();i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(c);
        return true;
    }
}
