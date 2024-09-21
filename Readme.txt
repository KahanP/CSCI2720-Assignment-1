# CSCI2720-Assignment-1

Contributors:
    Naveen Seedani - merge, search, lenght, github configuration
    Kahan Patel - print, insert, delete, deleteAlt, intersection

Compile:
    javac -d bin src/cs2720/assignment1/*.java

Run:
    java -cp bin cs2720.assignment1.LinkedListDriver input.txt
    ./run.sh also works to compile and run code with input.txt


    Complexity of Merge - O(m*n) m is length of listToAdd and n is length of original list

function mergeList(listToAdd):
    current_node = head of listToAdd

    while current_node is not null:
        insert the current_node's item into the current list (handle duplicates silently)
        move to the next node in listToAdd


    Complexity of intersection - O(n+m) n is length of original list, m is legnth of list2

function intersection(list2):
    head1 = head of this list
    head2 = head of list2
    create an empty intersectionList

    while head1 is not null and head2 is not null:
        comparison = compare head1's item with head2's item

        if comparison == 0:
            add head1's item to intersectionList
            move both head1 and head2 to their next nodes
        else if comparison < 0:
            move head1 to its next node
        else:
            move head2 to its next node

    print intersectionList
