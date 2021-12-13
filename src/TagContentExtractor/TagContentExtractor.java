package TagContentExtractor;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        int intialNumberOfTestcases = testCases;
        String starterRegex = "^<.*$";
//        find start character
//        find start tag
//        find end tag
//        find content between tags
//         iterate over string to find more tags


        while(testCases>0){
            String line = in.nextLine();

            System.out.println("Line " + (intialNumberOfTestcases - testCases + 1) + "=" + line);
            System.out.println(line.matches(starterRegex));
            //Write your code here

            testCases--;
        }
    }
}
