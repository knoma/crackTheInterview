package Sorting;

import java.util.Arrays;

/**
 * Created by knoma on 10/17/16.
 */
public class MergSort {

    public static void main(String[] args) {
        int[] array = {1,23,3454,5,3,4,12,34};


        mergeSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array, int lowerIndex, int length) {

        if (lowerIndex < length){
            int middle = lowerIndex + (length - length) / 2;
            mergeSort(array,0,middle);
            mergeSort(array,middle + 1, length);
            merge(array, lowerIndex, middle, length);
        }

    }

    private static void merge(int[] array, int lowerIndex, int middle, int length) {

        int[] copy = Arrays.copyOf(array, length);
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j < length){
            if(copy[i] <= copy[j]){
                array[k] = copy[i];
                i++;
            } else {
                array[k] = copy[j];
                j++;
            }
            k++;
        }
        while (i <= middle){
            array[k] = copy[i];
            k++;
            i++;
        }

    }

}
