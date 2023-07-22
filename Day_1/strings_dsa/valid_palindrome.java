package Day_1.strings_dsa;

import java.util.Locale;
import java.util.Scanner;

public class valid_palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string to check");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        System.out.println(s);
        s = s.replaceAll("[^a-z0-9]", "");
        int a = (s.length());
        System.out.println(s);
        int i = 0, j = a-1;
        boolean ans = true;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                ans = false;
            }
            i++;
            j--;
        }
        return ans;
    }
}
