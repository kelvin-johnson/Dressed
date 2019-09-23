package com.acme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        try {
            Scanner scanner = new Scanner(System.in);
            Context context = Context.getInstance();
            System.out.print(">>> ");
            String commands = scanner.nextLine();

            for (int i = 0; i < commands.length(); i++) {
                context.evaluate(commands.charAt(i));
            }
        } catch (RuntimeException e) {
            System.out.println("Failed!");
        } finally {
            System.out.println("Exiting.");
        }

    }
}
