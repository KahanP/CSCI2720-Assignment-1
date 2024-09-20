package cs2720.assignment1;

public class SortedLinkedList {

    private NodeType head;

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
            System.out.println("Item is null, cannot insert.");
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
                System.out.println("Item already exists");
                return;
            } // if
            prevLocation = location;
            location = location.next;
        } // searches for correct location
        prevLocation.next = newNode;
        newNode.next = location;

    } // insertItem

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

    public int searchItem(ItemType item) {
        return 1; //  1 is placeholder
    } // searchItem

    public void printList() {
        if (this.head == null) {
            System.out.print(" ");
        } //if

        NodeType current = this.head;
        while (current != null) {
            System.out.print(current.info.getValue() + " ");
            current = current.next;
        }
        System.out.println("");
    } // printList

} // SortedLinkedList
