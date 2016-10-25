package Chapter3;

import Libary.StackWithMin;
import Libary.StackWithMin2;

/**
 * Created by knoma on 10/16/16.
 */
public class Chapter3_2 {


    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin();
        StackWithMin2 stack2 = new StackWithMin2();

        int[] array = {2,3,1,4,5,1};

        for (int i = 0; i < array.length; i++) {
            int i1 = array[i];
            stack.push(i1);
            stack2.push(i1);
            System.out.println("Value "+ i1);
        }
        System.out.println("\n");

        for (int i = 0; i < array.length; i++) {
            System.out.println("POPPER " + stack.pop().value + " , " + stack2.pop());
            System.out.println("MIN " + stack.min() + " , " + stack2.min());
        }
    }
}
