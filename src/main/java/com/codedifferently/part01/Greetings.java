package com.codedifferently.part01;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
Scanner  scan = new Scanner(System.in);
System.out.println("Enter your name");
String name1 = scan.nextLine();
String name2 = scan.nextLine();
System.out.println("My name is " +name1 );
System.out.println("Hi " +name1 );
System.out.println("My name is " +name2 );
System.out.println("Hi " +name2 );
    }
}
