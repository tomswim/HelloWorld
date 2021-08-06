package StringReverse;

import java.util.Scanner;

public class StringReverse {
    public class Solution {
        public void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String A = sc.next();
            // sc.close();
            int lengthOfA = A.length();
            String reverseA = "";
            for (int i = 0; i < lengthOfA; i++) {
                reverseA = reverseA + A.charAt(lengthOfA - 1 - i);
            }

            if (A.compareTo(reverseA) == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
