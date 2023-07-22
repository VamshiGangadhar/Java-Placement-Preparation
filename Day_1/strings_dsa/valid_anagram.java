package Day_1.strings_dsa;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class valid_anagram {
    public static void main(String[] args) {
        System.out.println("Valid anagram");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two words to be compared");
        String s = in.nextLine();
        String t = in.nextLine();
        System.out.println(isAnagram(s,t));
    }

    // this would fail as different words with dif letters can sum up to similar ascii values

//    public static boolean isAnagram(String s,String t){
//        boolean ans = true;
//        int a = s.length()-1;
//        int b = t.length()-1;
//        if(a != b){
//            return ans = false;
//        }
//        int count = 0;
//        int c_count = 0;
//        while(a >= 0){
//            count = count + (int)(s.charAt(a));
//            a--;
//        }
//        while(b >= 0){
//            c_count = c_count + (int)(t.charAt(b));
//            b--;
//        }
//        if(count != c_count){
//            ans = false;
//        }
//        System.out.println(count+ " "+ c_count);
//        return ans;
//    }

    //anagram means two words or strings should have every letter in each other so let's sort them
    public static String sort_string(String s){
        char[] b = s.toCharArray();
        Arrays.sort(b);
        return new String(b);
    }
    public static boolean isAnagram(String s, String t){
        s = sort_string(s);
        t = sort_string(t);
        if(!s.equals(t)){
           return false;
        }
        return true;
    }
}
