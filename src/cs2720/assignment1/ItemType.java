package cs2720.assignment1;

public class ItemType {

    private int value;

    public int compareTo(ItemType item) {

        if (this.value == item.value) {
            return 0;
        } else if (this.value < item.value) {
            return -1;
        } else {
            return 1;
        } // if/else

    } // compareTo

    public int getValue(){
        return this.value;
    } // getValue

    public void initialize(int num) {
        this.value = num;
    } // initalize

} // ItemType
