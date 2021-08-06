package PlacesRegex;

import java.util.Scanner;

public class Placesregex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 1;
        while(in.hasNext()){
            String IP = in.next();
            System.out.print(count + " ");
            System.out.println(IP.matches(new MyRegex().pattern));
            count++;
        }

    }
}

class MyRegex {
    String pattern = "^\\b(?!batchUpdate\\b).*$"; // works, only rejects batchUpdate
//    String pattern = "\\b(?!batchUpdate\\b)\\w+"; // works, only rejects batchUpdate unless has a -
//    String pattern = "\\b(batchUpdate)\\b"; // finds only batchUpdate

//    String pattern = "^((?!batchUpdate).)*$"; // reject anything with batchUpdate in it.

//    String pattern = "\\b(?!batchUpdate\\b)\\w+"; // works, only rejects batchUpdate unless has a -

//    String pattern = "^((?!batchUpdate).)*$"; // rejects sequences that include batchUpdate (.i.e. 123batchUpdate123)
}