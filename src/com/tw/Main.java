package com.tw;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Enter your name:");

        Console c = System.console();

        String name = c.readLine();

        System.out.println("Hello " + name);
    }
}
