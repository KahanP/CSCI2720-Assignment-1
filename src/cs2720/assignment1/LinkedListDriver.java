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

        String fileName = args[0];
        SortedLinkedList list = new SortedLinkedList();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            // turn file into a SortedLinked List
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                ItemType item = new ItemType();
                item.initialize(num);

                list.insertItem(item);
            } // while

            fileScanner.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } // catch



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
        Scanner inputScanner = new Scanner(System.in);
        while (!quit) {
            System.out.print("Enter a command: ");
            String command = inputScanner.nextLine();
            process(command);

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
                list.printList();

                break;
            case "l": // length
                int length = list.getLength();
                System.out.println("The length of the list is "+ length);
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


        } // while
        // loops the program until quit




    } // main

    // processes the command
    private static void process(String command) {


    } // process

} // Driver
