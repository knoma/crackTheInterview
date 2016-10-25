package com.app.crack;

import javax.swing.*;
import java.util.*;

/**
 * Created by knoma on 10/15/16.
 */
public class Test {

    public static void main(String[] args) {
        int[] array = {1,2,2,3,3,6,8,8};
        int[] ints = Arrays.copyOf(array, array.length);

        List dub2 = findDub2(ints);
        System.out.println(dub2);

        List dub = findDub(array);

        System.out.println(dub);


        int length= 10;
        for (int i = 0; i < length; i++) {
            int i1 = length - i - 1;
            System.out.println( i >= length / 2 ? i1 : i);
        }

    }

    private static List findDub2(int[] ints) {
        Arrays.sort(ints);
        List list = new ArrayList();
        int seen = 0;
        for (int i = 1; i < ints.length; i++) {
            int prev = ints[i - 1];
            if ((prev != ints[i] && prev !=seen)) list.add(prev);

            seen = prev;
        }
        return list;
    }

    private static List findDub(int[] array) {
        List list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            boolean dub = false;
            for (int j = 1; j < array.length; j++) {
                if(array[i]== array[j] && i !=j){
                    dub = true;
                    break;
                } else {
                    dub = false;
                }
            }
            if (!dub) list.add(array[i]);
        }
        return list;
    }
}
