package StringTokens;

import java.io.*;
import java.util.*;

public class Tokens {

    static char[] tokenSplitters = new char[]{' ','!',',','?','.','_','\'','@'};

    public static boolean isTokenSplitter(char charToCheck) {
        for (char ch : tokenSplitters) {
            if (ch == charToCheck) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        ArrayList<String> tokens =new ArrayList<String>();

        String nextToken = "";
        for (int i = 0; i < s.length(); i++) {
            char nextChar = s.charAt(i);
            if (isTokenSplitter(nextChar)) {
                if (nextToken != "") {
                    tokens.add(nextToken);
                }
                nextToken = "";
                continue;
            } else {
                nextToken += nextChar;
            }
            if (i == s.length() - 1) {
                tokens.add(nextToken);
            }
        }
        System.out.println(tokens.size());
        for (int i = 0; i < tokens.size(); i++){
            System.out.println(tokens.get(i));
        }

        // Create array, iterate through s to find letters between other characters, when found add to array. print array length and each item in array.

        scan.close();
    }
}
