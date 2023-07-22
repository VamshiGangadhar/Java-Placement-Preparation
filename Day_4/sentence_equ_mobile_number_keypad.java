package Day_4;

import java.util.ArrayList;
import java.util.Scanner;

public class sentence_equ_mobile_number_keypad {
    public static void main(String[] args) {
        System.out.println("--Convert a sentence into its equivalent mobile numeric keypad sequence--");
        String[] num = {"2","22","222","3","33","333","4","44","444","5","55","555",
                "6","66","666","7","77","777","7777","8","88","888","9",
                "99","999","9999"};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = in.nextLine();
        System.out.println(sentenceToNumber(s,num));

    }
    public static String sentenceToNumber(String s,String[] num){
        StringBuilder ans = new StringBuilder();
        ans.append("");
        s = s.toUpperCase();
        char A = 'A';
        for(int i = 0;i < s.length();i++){
            ans.append(num[(int)(s.charAt(i))-(int)(A)]);
        }
        return (String.valueOf(ans));
    }
}
