package Chapter4;

/**
 * Created by knoma on 10/23/16.
 */
public class Chapter_4_2 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};

        TreeNode root = TreeNode.createMinimalBST(array);
        root.print();

        System.out.println("Root? " + root.data);
        System.out.println("Created BST? " + root.isBST());
        System.out.println("Height: " + root.height());
    }
}
