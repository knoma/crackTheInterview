package Sorting;

import java.util.Arrays;

import static Sorting.BubbleSort.swap;

/**
 * Created by knoma on 10/17/16.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {121,21,223,3,45,23,1,22,4,2};

        quickSort(array,0, array.length -1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int lowerIndex, int higherIndex) {

        if (array==null || array.length ==0 ) return;

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex + ((higherIndex - lowerIndex )/2)];

        while (i <=j){
            while (array[i] < pivot) i++;
            while (array[j] > pivot) j--;

            if (i<=j){
                swap(array,i,j);
                i++;
                j--;
            }

            if (lowerIndex < j) quickSort(array,lowerIndex,j);
            if (i < higherIndex) quickSort(array,i, higherIndex);
        }
    }

}
