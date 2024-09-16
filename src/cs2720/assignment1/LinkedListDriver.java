package cs2720.assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LinkedListDriver {

    private static  boolean quit;

    public static void main(String[] args) {


        if (args.length != 1) {
            System.out.println("add input text file, exiting...");
            return;
        } // if

        //TODO: take args[0] and turn it into linked list

        Scanner scanner = new Scanner(System.in);

        System.out.print(
            "Commands:\n" +
            "(i) - Insert value\n" +
            "(d) - Delete value\n" +
            "(s) - Search value\n" +
            "(a) - Delete alternate nodes\n" +
            "(m) - Merge lists\n" +
            "(t) - Find intersection\n" +
            "(p) - Print list\n" +
            "(l) - Print length\n" +
            "(q) - Quit program\n\n");
        // shows the example inputs

        quit = false;
        // TODO: fix the condition to start loop "quit"
        while (!quit) {
            System.out.println("Enter a command: ");
            String command = scanner.nextLine();
            process(command);
        } // while
        // loops the program until quit
    } // main

    // processes the command
    private static void process(String command) {

        switch (command) {
        case "i": // insert

            break;
        case "d": // delete

            break;
        case "s": // search

            break;
        case "a": // del alt

            break;
        case "m": // merge

            break;

        case "p": // print all

            break;
        case "l": // length

            break;
        case "q": // quit
            System.out.println("Exiting the program");
            quit = true;
            System.exit(0);
            break;
        default:
            System.out.println("Invalid command try again");
            break;
        } // switch

    } // process

} // Driver
