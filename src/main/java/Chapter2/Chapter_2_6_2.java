package Chapter2;

import Libary.LinkedListNode;

/**
 * Created by knoma on 10/10/16.
 */
public class Chapter_2_6_2 {

    public static class Result {
        public LinkedListNode node;
        public boolean result;

        public Result(LinkedListNode node, boolean result) {
            this.node = node;
            this.result = result;
        }


        public static void main(String[] args) {
            int length = 9;

            LinkedListNode[] nodes = new LinkedListNode[9];

            for (int i = 0; i < length; i++) {
                nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
            }

            for (int i = 0; i < length; i++) {
                if (i < length - 1) {
                    nodes[i].next = nodes[i + 1];
                }
                if (i > 0) {
                    nodes[i].prev = nodes[i - 1];
                }
            }


            LinkedListNode head = nodes[0];
            System.out.println(head.printForward());
            System.out.println(isPalindrome(head));

        }

        private static boolean isPalindrome(LinkedListNode head) {
            int length = lengthOfList(head);
            Result r = isPalindromeRecurse(head, length);
            return r.result;
        }

        private static Result isPalindromeRecurse(LinkedListNode head, int length) {
            if (head == null || length <= 0)
                return new Result(head, true);
            else if (length == 1)
                return new Result(head.next, true);

            Result res = isPalindromeRecurse(head.next, length - 2);

            if (!res.result || res.node == null) {
                return res;
            }

            res.result = (head.data == res.node.data);

            res.node = res.node.next;
            return res;
        }

        private static int lengthOfList(LinkedListNode node) {
            int size = 0;

            while (node != null) {
                size++;
                node = node.next;
            }
            return size;
        }
    }
}
