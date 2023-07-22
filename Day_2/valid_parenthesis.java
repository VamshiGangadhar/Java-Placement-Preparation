package Day_2;

import java.util.ArrayList;
import java.util.Scanner;

public class valid_parenthesis {
    public static void main(String[] args) {
        System.out.println("---------valid Parenthesis----------");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        ArrayList<Character> check_stack = new ArrayList<Character>();
        char[] b = s.toCharArray();
        for(char i : b) {
            if(i == '[' || i == '{' || i == '('){
                check_stack.add(i);
            } else if (i == ')' && !check_stack.isEmpty() && check_stack.get(check_stack.size()-1) == '(') {
                check_stack.remove(check_stack.size()-1);
            }
            else if (i == '}' && !check_stack.isEmpty() && check_stack.get(check_stack.size()-1) == '{') {
                check_stack.remove(check_stack.size()-1);
            }
            else if (i == ']' && !check_stack.isEmpty() && check_stack.get(check_stack.size()-1) == '[') {
                check_stack.remove(check_stack.size()-1);
            }
            else{
                return false;
            }
        }
        return check_stack.isEmpty();
    }
}
