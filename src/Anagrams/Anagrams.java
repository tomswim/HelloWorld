package Anagrams;

import java.util.Scanner;

public class Anagrams {
    public static boolean isAnagram(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();

        // if not same length return false
        if (lengthA != lengthB) {
            return false;
        }

        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();
        System.out.println(lowerA + " " + lowerB);
        // if same string return true
        if (lowerA.compareTo(lowerB) == 0) {
            return true;
        }
        String compareString = lowerB;

        // removes each character that is in string a from string b, if b is 0 length at end then they are anagrams
        for (int i=0; i<lengthA; i++) {
            for (int j=0; j<compareString.length(); j++) {
                if (lowerA.charAt(i) == compareString.charAt(j)) {
                    String tempString = compareString.substring(0,j);
                    if (j != compareString.length() - 1) {
                        tempString = tempString + compareString.substring(j+1);
                    }
                    compareString=tempString;
                    System.out.println("CompareString: " + compareString);
                    break;
                }
            }
        }

        System.out.println("CompareString: " + compareString);

        if (compareString.length() == 0) {
            return true;
        } else {
            return false;
        }

        //simpler way, but need to import Arrays
//        char aArray[] = lowerA.toCharArray();
//        Arrays.sort(aArray);
//        char bArray[] = lowerB.toCharArray();
//        Arrays.sort(bArray);
//
//        if (Arrays.equals(aArray, bArray)) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
