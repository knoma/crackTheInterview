package Libary;

import java.util.Stack;

/**
 * Created by knoma on 10/16/16.
 */
public class StackWithMin2 extends Stack<Integer> {

    Stack<Integer> s2;


    public StackWithMin2() {
        this.s2 = new Stack<>();
    }

    public void push(int value){
        if (value <= min()){
            s2.push(value);
        }
        super.push(value);
    }

    public Integer pop(){
        int value = super.pop();
        if (value == min()){
            s2.pop();
        }
        return value;
    }

    public int min(){
        if(s2.isEmpty()){
            return Integer.MAX_VALUE;
        } else {
            return s2.peek();
        }
    }
}
