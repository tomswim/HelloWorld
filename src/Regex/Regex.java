package Regex;

//https://www.regular-expressions.info/numericranges.html

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 1;
        while(in.hasNextLine()){
            String IP = in.nextLine();
            System.out.print(count + " ");
            System.out.println(IP.matches(new MyRegex().pattern));
            count++;
        }

    }
}

class MyRegex {
//    String find255 = "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-4][0-9]|25[0-5])";
//    String findPeriod = "[.]";
//    String pattern = find255 + findPeriod + find255 + findPeriod + find255 + findPeriod + find255;

//    String pattern ="(?i)\\b(\\w+)(\\s+\\1\\b)+"; //Finding multiple similar words, case insensitive

//    String pattern ="^([a-zA-Z])([a-zA-Z0-9_]){7,29}"; //Finding 8 to 30 characters, with first character a letter

    String pattern ="^<.*$"; //Finding 8 to 30 characters, with first character a letter
}