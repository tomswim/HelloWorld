package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

//        String myVar = null;
//
//        if (myVar != null && !"".equals(myVar)) {
//            System.out.println("myVar is not blank");
//        }
//
//        if ("".equals(myVar)) {
//            System.out.println("myVar is blank");
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int i = scan.nextInt();
        System.out.println("Enter a float: ");
        double d = scan.nextDouble();
        System.out.println("Enter a String: ");
        scan.useDelimiter(System.lineSeparator());
        String s = "";
        s = scan.nextLine();
        s += scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
