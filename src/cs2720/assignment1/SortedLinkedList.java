package cs2720.assignment1;

public class SortedLinkedList {

    private NodeType head;
    private boolean shouldPrintMessages = true; // control flag

    public SortedLinkedList() {
        head = null;

    } //  SortedLinkedList

    public int getLength() {
        int length = 0;
        NodeType temp = head;
        while (temp != null){
            length++;
            temp = temp.getNext();
        } // while
        return length;
    } // getLenght

    // TODO: all methods below
    // TODO: make sure that linked list initalizes correctly
    public void insertItem(ItemType item){

        if (item == null) {
            if(shouldPrintMessages) {
                System.out.println("Item is null, cannot insert.");
            }
            return;
        }

        // creation of new node
        NodeType newNode = new NodeType();
        newNode.setInfo(item);
        newNode.next = null;

        // check if list is empty or inserting the first element
        if (this.head == null ) {
            this.head = newNode;
            this.head.setInfo(item);
            return;
        } // if

        if (this.head.info == null) {
            System.out.println("Head node's info is null.");
            return;
        }

        // if Item is smaller than head
        if (item.compareTo(this.head.info) < 0) {
            newNode.next = this.head;
            this.head = newNode;
            return;
        } // if

        NodeType location = this.head;
        NodeType prevLocation = null;

        while (location != null && item.compareTo(location.info) >= 0) {
            // check for duplicate item
            if (item.compareTo(location.info) == 0) {
                if(shouldPrintMessages) {
                    System.out.println("Item already exists");
                }
                return;
            } // if
            prevLocation = location;
            location = location.next;
        } // searches for correct location
        prevLocation.next = newNode;
        newNode.next = location;

    } // insertItem

    // To prevent from printing certain messages
    public void setShouldPrintMessages(boolean shouldPrint) {
        this.shouldPrintMessages = shouldPrint;
    } // setShouldPrintMessages

    public void deleteItem(ItemType item){

        NodeType previousList = this.head;
        if (this.head == null) {
            System.out.println("You cannot delete from an empty list");
            return;
        } // null check

        NodeType location = this.head;
        NodeType previous = null;

        if (item.compareTo(location.info) == 0) {
            if (location.next == null) {
                this.head = null;
            } else {
                this.head = location.next;
            } // if
            return;
        } // check if head is item to be deleted

        // traverse the list
        while (location != null && item.compareTo(location.info) != 0) {
            previous = location;
            location = location.next;
        } // while

        if (location == null) {
            System.out.println("The item is not present in the list");
            return;
        } // if

        previous.next = location.next;
    } // deleteItem

    // Return the index of the item if found, otherwise returns -1
    public int searchItem(ItemType item) {
        NodeType current = this.head;
        int index = 0;

        // Transverse the list until the end
        while (current != null) {
            // matches the current node's info with the item
            if (current.info.compareTo(item) == 0) {
                System.out.println("The item is present at index " + index);
                return index;
            }
            // move to the next node
            current = current.next;
            index++;
        }
        System.out.println("Item is not present in the list.");
        return -1;
    } // searchItem

    public void printList() {
        if (this.head == null) {
            System.out.print(" ");
        } // if

        NodeType current = this.head;
        while (current != null) {
            System.out.print(current.info.getValue() + " ");
            current = current.next;
        } // while
        System.out.println("");
    } // printList

    public void mergeList(SortedLinkedList listToAdd) {
        NodeType current = listToAdd.head;
        while(current != null) {
            insertItem(current.info);
            current = current.next;
        } // while
    } // mergeList

    public void deleteAltNodes() {

        NodeType current = this.head;

        if (current == null) {
            System.out.println("The list is empty");
            return;
        } // if

        //traverse list
        while (current != null && current.next != null) {
            NodeType nodeToDelete = current.next;
            // make current node skip the next node
            current.next = nodeToDelete.next;
            // move current to the next nod that was not deleted
            current = current.next;
        } // while
    } // deleteAltNodes

   public void  intersection(SortedLinkedList list2) {
        NodeType head1 = this.head;
        NodeType head2 = list2.head;

        SortedLinkedList intersectionList = new SortedLinkedList();

        // transverse both lists until one of them reaches the end
        while (head1 != null && head2 != null) {
            int comparison = head1.info.compareTo(head2.info);

            // if nodes are equal, adds the value to the intersection list
            if (comparison == 0) {
                intersectionList.insertItem(head1.info);
                head1 = head1.next;
                head2 = head2.next;
            } else if (comparison < 0) { // if head1's value is smaller, moves head1 to next node
                head1 = head1.next;
            } else { // if head2's value is smaller, moves head2 to next node
                head2 = head2.next;
            } // if
        } // while

        intersectionList.printList();
    } // intersection

} // SortedLinkedList
