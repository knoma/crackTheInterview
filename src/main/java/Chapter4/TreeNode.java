package Chapter4;

import Libary.BTreePrinter;

/**
 * Created by knoma on 10/23/16.
 */
public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    private int size = 0;


    public TreeNode(int data) {
        this.data = data;
        size = 1;
    }


    private void setleftChild(TreeNode left) {
        this.left = left;
        if (left != null) {
            left.parent = this;
        }
    }

    private void setRightChild(TreeNode right) {
        this.right = right;
        if (right != null) {
            right.parent = this;
        }
    }

    public void insertInOrder(int d) {
        if (d <= data) {
            if (left == null) {
                setleftChild(new TreeNode(d));
            } else left.insertInOrder(d);
        } else {
            if (right == null) setRightChild(new TreeNode(d));
            else right.insertInOrder(d);
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isBST() {
        if (left != null) {
            if (data < left.data || !left.isBST()) return false;
        }

        if (right != null) {
            if (data > right.data || !right.isBST()) return false;
        }
        return true;
    }

    public int height() {
        int leftHeight = left != null ? left.height() : 0;
        int rightHeight = right != null ? right.height() : 0;

        return 1 + Math.max(rightHeight, leftHeight);
    }

    public TreeNode find(int d) {
        if (d == data) {
            return this;
        } else if (d <= data) {
            return left != null ? left.find(d) : null;
        } else return right != null ? right.find(d) : null;
    }

    private static TreeNode createMinimalBST(int[] array, int start, int end){
        if (end < start) return null;

        int mid = (start + end) /2;
        TreeNode n = new TreeNode(array[mid]);

        n.setleftChild(createMinimalBST(array, start, mid -1));
        n.setRightChild(createMinimalBST(array,  mid + 1, end));
        return n;
    }

    public static TreeNode createMinimalBST (int[] array){
        return createMinimalBST(array, 0, array.length -1);
    }

    public void print(){
        BTreePrinter.printNode(this);
    }
}
