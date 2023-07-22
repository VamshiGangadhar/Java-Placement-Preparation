package Day_3;

import java.util.*;

public class Removing_Consecutive_character {
    public static void main(String[] args) {
        System.out.println("Let's remove consecutive characters");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(removeConsecutiveCharacter(s));
    }
    public static String removeConsecutiveCharacter(String s){
        int a = s.length();
        char[] char_array = new char[a];
        StringBuilder ans = new StringBuilder();
        char_array = s.toCharArray();
        ans.append(String.valueOf(char_array[0]));
        for(int i = 1; i < char_array.length;i++){
            if(char_array[i] == char_array[i-1]){
                continue;
            }
            else {
                ans.append(String.valueOf(char_array[i]));
            }
        }
        return ans.toString();
    }
}
