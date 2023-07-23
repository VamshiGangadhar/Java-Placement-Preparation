package Day_6;

import java.util.Hashtable;
import java.util.Scanner;

public class sliding_window_technique {
    public static void main(String[] args) {
        System.out.println("---Let's implement the sliding window technique---");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = in.nextLine();
        System.out.println("Enter number of replacements");
        int k = in.nextInt();
        System.out.println(characterReplacement(s,k));
    }
    public static int characterReplacement(String s, int k) {
        int maxLen = 0;
        int currentLen = 1;
        int limit = 0;
        int start = 0;
        Hashtable<Character, Integer> charCount = new Hashtable<Character, Integer>();
        charCount.put(s.charAt(0), 1);

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
            limit = Math.max(limit, charCount.get(currentChar));
            currentLen = i - start + 1;
            if (currentLen - limit > k) {
                char startChar = s.charAt(start);
                charCount.put(startChar, charCount.get(startChar) - 1);
                start++;
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }

}
