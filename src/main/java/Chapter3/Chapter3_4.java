package Chapter3;

import Libary.MyQueue;

import java.util.LinkedList;
import java.util.Queue;

import static Libary.Helper.randomIntInRange;

/**
 * Created by knoma on 10/15/16.
 */
public class Chapter3_4 {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<Integer>();
        Queue<Integer> testQueue = new LinkedList<Integer>();

        for (int i = 0; i < 100; i++) {
            int choice = randomIntInRange(0, 10);
            if(choice <= 5){
                int element = randomIntInRange(1, 10);
                testQueue.add(element);
                myQueue.add(element);
                System.out.println("Enqueued " + element);
            } else if(testQueue.size() > 0){
                int top1 = testQueue.remove();
                int top2 = myQueue.remove();

                if(top1 != top2){
                    System.out.println("diff between " + top1 +" "+ top2 );
                }
                System.out.println("Dequeued " + top1);
            }

            if(testQueue.size() == myQueue.size()){
                if(testQueue.size() > 0 && testQueue.peek() != myQueue.peek()){
                    System.out.println("@@@@@@@@@ Problem " + testQueue.peek() +" " + myQueue.peek());
                }
            } else {
                System.out.println("@@@@@@@@@@@");
            }
        }

    }




}
