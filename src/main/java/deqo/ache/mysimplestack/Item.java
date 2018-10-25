package deqo.ache.mysimplestack;

public class Item {
    private int value;
    private Item next;

    public Item(int value){
        this.value = value;
    }

    public Item getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setNext(Item next){
        this.next = next;
    }
}
