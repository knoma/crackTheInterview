package Libary;

import java.util.Stack;

/**
 * Created by knoma on 10/16/16.
 */
public class StackWithMin extends Stack<NodeWithMin> {

    public void push(int value) {
        int newMin = Math.min(value, min());
        super.push(new NodeWithMin(value, newMin));
    }

    public int min() {
        if(this.isEmpty()){
            return Integer.MAX_VALUE;
        } else {
            return this.peek().min;
        }

    }
}
