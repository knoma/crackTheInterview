package Libary;

/**
 * Created by knoma on 10/8/16.
 */
public class LinkedListNode {

    public LinkedListNode next;
    public LinkedListNode prev;
    public LinkedListNode last;
    public int data;

    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    public LinkedListNode(int data) {
        this.data = data;
    }

    public LinkedListNode() {
    }


    public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
        data = d;
        setNext(n);
        setPrevious(p);
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public String printForward(){
        if (next !=null) return data + "->" + next.printForward();
        else return String.valueOf(data);
    }

    public void setNext(LinkedListNode next) {
        this.next = next;

        if (this == last) {
            last = next;
        }
        if (next != null && next.prev != null) next.setPrevious(this);
    }

    public void setPrevious(LinkedListNode prev) {
        this.prev = prev;
        if (prev != null && prev.next != this) prev.setNext(this);
    }
}
