package RegexRepeatWord;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();
//            System.out.println("Initial input: " + input);

            Matcher m = p.matcher(input);
//            String originalInput = input;
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
//                int start = m.start();
//                int end = m.end();
//                System.out.println("begin substring: " + start + " end substring: " + end);
//                String currentSubString = originalInput.substring(start, end);
////                String currentSubString = input.substring(start, end);
//                System.out.println("currentString: " + currentSubString);
//                int newEnd = (end - start - 1)/2;
//                String replaceWith = currentSubString.substring(0, newEnd);
//                System.out.println("replaceWith: " + replaceWith);
////                input = input.replaceAll(/* The regex to replace */, /* The replacement. */)
//                System.out.println(("matcher group(): " + m.group() + "Matcher group(1): " + m.group(1)));
////                input = input.replaceAll(currentSubString, replaceWith);
//                //                m = p.matcher(input);
                input = input.replaceAll(m.group(), m.group(1));

//                System.out.println("New input: " + input);
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
