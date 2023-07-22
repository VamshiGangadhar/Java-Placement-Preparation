package Day_3;

import java.util.Scanner;

public class longest_common_prefix {
    public static void main(String[] args) {
        System.out.println("Want longest common prefix");
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements of the string array");
        a = in.nextInt();
        in.nextLine();
        String[] strs = new String[a];
        System.out.println("Enter the string array elements");
        for (int i = 0; i < a; i++) {
            System.out.println("Enter element"+i);
            strs[i] = in.nextLine();
        }
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder ans = new StringBuilder();
        int b = strs[1].length() > strs[0].length() ? strs[0].length() : strs[1].length();
        for (int j = 0; j < b; j++) {
            if (strs[0].charAt(j) == strs[1].charAt(j)) {
                ans.append(strs[0].charAt(j));
            } else {
                j = b;
            }
        }
        for (int i = 2; i < strs.length; i++) {
            int c = strs[i].length() > ans.length() ? ans.length() : strs[i].length();
            for (int j = 0; j < c; j++) {
                if (strs[i].charAt(j) != ans.charAt(j)) {
                    ans.delete(j, ans.length());
                }
            }

        }
        return ans.toString();
    }

//    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) {
//            return "";
//        }
//
//        String shortest = Arrays.stream(strs)
//                .min(Comparator.comparingInt(String::length))
//                .orElse("");
//
//        for (int i = 0; i < shortest.length(); i++) {
//            char c = shortest.charAt(i);
//            for (String str : strs) {
//                if (str.charAt(i) != c) {
//                    return shortest.substring(0, i);
//                }
//            }
//        }
//
//        return shortest;
//    }
}
