package Day_8;

import java.util.Scanner;

public class Result_caesarCipher {
    public static void main(String[] args) {
        System.out.println("We are going to encrypt the Sting using caesar cipher");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = in.nextLine();
        System.out.println("Enter the key value");
        int k = in.nextInt();
        System.out.println(caesarCipher(s,k));
    }
    public static String caesarCipher(String s, int k) {
        StringBuilder encryptedString = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                int asciiOffset = Character.isUpperCase(ch) ? 65 : 97;
                char encryptedChar = (char) (((ch - asciiOffset + k) % 26) + asciiOffset);
                encryptedString.append(encryptedChar);
            } else {
                encryptedString.append(ch);
            }
        }
        return encryptedString.toString();
    }
}
