package cs2720.assignment1;

public class NodeType {

    public ItemType info;
    public NodeType next;

    public boolean hasNext() {
        if (next == null) {
            return false;
        } // if
        return true;
    } // hasNext

    public NodeType getNext(){
        return next;
    } // getNext

    public void setInfo(ItemType info) {
        this.info = info;
    } // setInfo
} // NodeType
