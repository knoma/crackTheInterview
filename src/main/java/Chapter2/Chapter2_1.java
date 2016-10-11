package Chapter2;

import Libary.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by knoma on 10/8/16.
 */
public class Chapter2_1 {

    public static void main(String[] args) {
        LinkedListNode node = new LinkedListNode(0);
        LinkedListNode next = null;

        LinkedListNode head = node;

        for (int i = 1; i < 10; i++) {
            next = new LinkedListNode(i % 2);
            node.next = next;
            node = next;
        }

        System.out.println(head.printForward());
        deleteDups3(head);
        System.out.println(head.printForward());
    }

    private static void deleteDups(LinkedListNode node) {

        Set<Integer> set = new HashSet<>();
        LinkedListNode previous = null;

        while (node != null) {
            if (set.contains(node.data)) {
                previous.next = node.next;
            } else {
                set.add(node.data);
                previous = node;
            }
            node = node.next;
        }

    }

    public static void deleteDups2(LinkedListNode head) {

        LinkedListNode current = head;

        while (current != null){
            LinkedListNode runner = current;
            while (runner.next != null){
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }


    public static  void deleteDups3(LinkedListNode head) {
        if(head == null) return;

        LinkedListNode previous = head;
        LinkedListNode current = previous.next;

        while (current !=null) {
            LinkedListNode runner = head;

            while (runner !=current){
                if (runner.data == current.data){
                    LinkedListNode tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    break;
                }
                runner = runner.next;
            }

            if(runner == current) {
                previous = current;
                current = current.next;
            }
        }
    }


}
