package ex3;

import java.util.List;

public class BucketSort {


    public static int[] sort(int[] array) {
        int maximum_value = array[0];
        for (int a = 1; a < array.length; a++) {
            if (array[a] > maximum_value) {
                maximum_value = array[a];
            }
        }

        int[] newbucket = new int[maximum_value + 1];
        int[] sorted_array = new int[array.length];

        for (int a = 0; a < array.length; a++) {
            newbucket[array[a]]++;
        }

        int position = 0;
        for (int b = 0; b < newbucket.length; b++) {
            for (int c = 0; c < newbucket[b]; c++) {
                sorted_array[position++] = b;
                BucketSortIteration.iteration++;
            }
            BucketSortIteration.iteration++;
        }

        return sorted_array;
    }
}
