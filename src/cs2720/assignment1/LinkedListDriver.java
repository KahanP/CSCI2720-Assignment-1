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

        while (!quit) {
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter a command: ");
            String command = inputScanner.nextLine();

            switch (command) {
            case "i": // insert
                System.out.print("Enter a number to insert: ");
                int intToInsert = inputScanner.nextInt();
                System.out.print("Original List: ");
                list.printList();
                ItemType itemToInsert = new ItemType();
                itemToInsert.initialize(intToInsert);
                list.insertItem(itemToInsert);
                System.out.print("New List: ");
                list.printList();

                break;
            case "d": // delete
                System.out.print("Enter a number to delete: ");
                int deleteInt = inputScanner.nextInt();
                System.out.print("Original List: ");
                list.printList();
                ItemType deleteItem = new ItemType();
                deleteItem.initialize(deleteInt);
                list.deleteItem(deleteItem);
                System.out.print("New List: ");
                list.printList();

                break;
            case "s": // search
                System.out.print("Enter a number to search: ");
                int numToSearch = inputScanner.nextInt();
                inputScanner.nextLine();
                System.out.print("Orignal list : ");
                list.printList();
                ItemType itemToSearch = new ItemType();
                itemToSearch.initialize(numToSearch);
                list.searchItem(itemToSearch);

                break;
            case "a": // del alt
                System.out.print("Orignal list : ");
                list.printList();
                list.deleteAltNodes();
                System.out.print("New List: ");
                list.printList();
                break;
            case "t": // intersection
                System.out.print("Enter the length of the new list: ");
                int lengthOfNewList = inputScanner.nextInt();
                inputScanner.nextLine();

                System.out.print("Enter the numbers ");
                String newList = inputScanner.nextLine();
                String [] numsInList2 = newList.split("\\s+");

                // new list to intersect
                SortedLinkedList list2 = new SortedLinkedList();
                for (int i = 0; i < lengthOfNewList; i++) {
                    int intForList2 = Integer.parseInt(numsInList2[i]);
                    ItemType itemForList2 = new ItemType();
                    itemForList2.initialize(intForList2);
                    list2.insertItem(itemForList2);
                } // whil

                System.out.print("List 1: ");
                list.printList();
                System.out.print("List 2: ");
                list2.printList();
                System.out.print("Intersection of lists: ");
                list.intersection(list2);


                break;
            case "m": // merge
                System.out.print("Enter the length of the new list: ");
                int lenOfList = inputScanner.nextInt();
                inputScanner.nextLine();

                System.out.print("Enter the numbers ");
                String inputList = inputScanner.nextLine();
                String [] numsInList = inputList.split("\\s+");

                // new list to merge
                SortedLinkedList newList = new SortedLinkedList();

                for(int i = 0; i < lenOfList; i++) {
                        int num = Integer.parseInt(numsInList[i]);
                        ItemType newItem = new ItemType();
                        newItem.initialize(num);
                        newList.insertItem(newItem);
                }

                System.out.print("List 1: ");
                list.printList();
                System.out.print("List 2: ");
                newList.printList();
                list.mergeList(newList);
                System.out.print("Merged list: ");
                list.printList();
                break;
            case "p": // print all
                System.out.print("The list is: ");
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


} // Driver
