package Day_5;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class DuplicateInputsString {
    public static void main(String[] args) {
        System.out.println("Print Duplicate inputs in strings");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = in.nextLine();
        printDuplicates(s);
    }
    public static void printDuplicates(String s){
        Hashtable<Character, Integer> ans = new Hashtable<Character, Integer>();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        ans.put(charArray[0],1);
        for(int i =1;i < s.length();i++){
            if(charArray[i] != charArray[i-1]){
                ans.put(charArray[i],1);
            }
            else{
                int value = ans.get(charArray[i]);
                ans.put(charArray[i],value+1);
            }
        }
        for(Character key : ans.keySet()){
            if(ans.get(key) > 1){
                int val = ans.get(key);
                System.out.println(key+",count = "+val);
            }
        }
    }
}
