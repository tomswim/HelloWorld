package Randomizer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Randomize {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String name = in.next();
            names.add(name);
        }
        Random randomNumber = new Random();
        int numberOfNames = names.size();

        for (int i = 0; i < numberOfNames; i++) {
            int nextRandom = randomNumber.nextInt(names.size());
            System.out.println(names.get(nextRandom));
            names.remove(nextRandom);
        }


    }
}
