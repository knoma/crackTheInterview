package Sorting;

import java.util.Arrays;

/**
 * Created by knoma on 10/17/16.
 */
public class BubbleSort {


    public static void main(String[] args) {
        int[] array = {12,1212,233,3,45,65,1};


        buubleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void buubleSort(int[] array) {
            int length = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < length; j++) {
                if (array[i] > array[j]){
                    swap(array, i, j);
                }
            }
            length--;
        }
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
