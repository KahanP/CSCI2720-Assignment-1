package cs2720.assignment1;

public class SortedLinkedList {

    private NodeType head;

    public SortedLinkedList() {
        head = null;
        head = new NodeType();
    } //  SortedLinkedList

    public int getLength() {
        int length = 0;
        NodeType temp = head;
        while (temp.hasNext()){
            length++;
            temp = temp.getNext();
        } // while
        return length;
    } // getLenght

    // TODO: all methods below
    // TODO: make sure that linked list initalizes correctly
    public void insertItem(ItemType item){

        if (getLength() == 0) {


        } // if

        for(int i=0; i < getLength(); i++) {

        } //


    } // insertItem

    public void deleteItem(ItemType item){

    } // deleteItem

    public int searchItem(ItemType item) {
        return 1; //  1 is placeholder
    } // searchItem


} // SortedLinkedList
