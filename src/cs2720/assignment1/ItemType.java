package cs2720.assignment1;

public class ItemType {

    private int value;

    public int compareTo(ItemType item) {
        if (item == null) {
            throw new NullPointerException("Compared item is null");
        } // check if item is null

        if (this.value == item.value) {
            return 0; // item parameter is EQUAL
        } else if (this.value < item.value) {
            return -1; // item parameter is LESS
        } else {
            return 1; // item parameter is GREATER
        } // if/else

    } // compareTo

    public int getValue(){
        return this.value;
    } // getValue

    public void initialize(int num) {
        this.value = num;
    } // initalize

} // ItemType
