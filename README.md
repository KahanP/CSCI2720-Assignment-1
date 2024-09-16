# CSCI2720-Assignment-1
CSCI2720 - Assignment 1 Sorted Linked List

You can complete this assignment individually or as a group of two students.
In this assignment, you will create a Sorted Singly-Linked List that performs basic list
operations using JAVA programming language. We are going to use some of the discussion in the
class about linked list to do this assignment.
1. The linked list should not allow duplicate elements.
2. Elements of the list should be of type ‘ItemType’. ‘ItemType’ class should have a private
integer variable with the name ‘value’.
3. Elements in the linked list should be sorted in the ascending order according to this ‘value’
variable.
You should create a command-line application (main or driver file) to utilize the linked list. This
application should take a single command-line parameter. This parameter should be a path to a
plain text file that contains a space-separated list of positive integer numbers in an unsorted
order. The main application should read this text file and insert the values into the sorted linked
list.
The command-line application should provide an interactive command-line interface to allow
users to perform operations on the list. You must implement all the operations that are shown
in the example output. And the command-line interface must be exactly like the example
output provided at the end of this document.
You must create the following files to implement the program.
● ItemType.java
● SortedLinkedList.java
● NodeType.java
● LinkedListDriver.java
You must create the following mandatory variables and functions in the above files. You may
add your own functions and variables in addition to the following functions.
ItemType.java
Private Data Members:
● int value
Public Functions:
● int compareTo( ItemType item ) - Compares the value of item with the current object's
value and return -1 if value of the current object is less than value in item , 0 if equal and
1 if greater.
● int getValue( ) - Returns the value instance variable.
● void initialize( int num ) - Initializes the data member by variable num
Note: If you want to use a constructor instead of function initialize then you can do that too.
NodeType.java
You should create a class called NodeType to create nodes in the linked list.
Public Data Members:
● ItemType info
● NodeType next
Note: The data members of the above class are public to mimic structures in C/C++.
SortedLinkedList.java
Private Data Members:
● NodeType head
Public functions:
● SortedLinkedList( ) - Initialize a sorted linked list object.
● int getLength( ) - Return the length of the linked list. You need to do a loop over the list
and get the number of nodes in the list.
● void insertItem( ItemType item ) - item should be inserted to the linked list maintaining
the ascending sorted order.
○ General Case: Insert at the middle or end.
○ Special Cases:
■ Insert the first element
■ Insert in an empty list
■ Print “Sorry. You cannot insert the duplicate item” when the user tries to
insert duplicate item
● void deleteItem( ItemType item ) – The node in the list that contains an item equal to
the item parameter should be removed. You should handle all cases of deleting an
element.
○ General Case: Deleting the last element or an element in the middle.
○ Special Cases:
■ Deleting the first element.
■ Deleting the only element.
■ Attempt to delete a non-existing item should print.
■ Attempt to delete from an empty list should print.
● int searchItem( ItemType item ) - Search the linked list that contains an item equal to
the parameter item and return its index. Print a message, as shown in sample output
below, if the item is not present in the list.
The three functions below can be implemented however you like. However, you should
make sure that their input and output formatting match the sample output below.
Implement following functions as functions in your single linked list class.
● mergeList - This function should merge two lists and not include any duplicate items in
the list. If there are duplicates in the two lists, the merge function should keep only one of
the duplicate instances in the resulting list.
○ Example:
List 1: 9 13 45 36 47 89
List 2: 3 45 89 96
Merged list: 3 9 13 36 45 47 89 96
○ See sample output below for more examples.
○ In the readme file give the pseudo code (steps) for your merge operation. Using
this pseudocode, explain the complexity (big O) of your merge operation.
Note: We are not looking for the best or the most efficient solution for the merge
problem. We just want a solution, but you should comment on its complexity.
● Delete Alternate Nodes - This function will delete alternate nodes from the list. It should
skip the first node, delete the second, skip the third, delete the fourth and so on. You are
not allowed to create a new list in this function. Just modify the original list by
deleting the nodes in it.
○ Example:
List before alternate delete: 3 7 14 26 74 78
List after alternate delete: 3 14 74
○ See sample output below for more examples.
○ The complexity of this function should not be more than O(n).
● Intersection - This function uses another list, finds the common elements between input
list and original list, and then prints the result.
○ Example:
List 1: 2 4 14 16 35 47 54 83
List 2: 1 3 4 15 35 54 74 91
Intersection: 4 35 54
○ See sample output below for more examples.
○ Like the merge function in the readme file, give the pseudo-code (steps) for the
‘Intersection’ function. Using this pseudocode, explain the complexity (big O) of
your 'Intersection’ function.
● Note: We are not looking for the best or most efficient solution for the
intersection problem. We just want a solution, but you should comment on its
complexity.
In function merge and intersection you need to read a second list from the user. You don’t need to
read the inputs of this second list from a text file, read the inputs directly from the user as shown
in the sample output below.
