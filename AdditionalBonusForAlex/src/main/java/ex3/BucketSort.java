package ex3;

import java.util.List;

public class BucketSort {


    public static int[] sort(List<Integer> array) {
        int maximum_value = array.get(0);
        for (int a = 1; a < array.size(); a++) {
            if (array.get(a) > maximum_value) {
                maximum_value = array.get(a);
            }
        }

        int[] newbucket = new int[maximum_value + 1];
        int[] sorted_array = new int[array.size()];

        for (int a = 0; a < array.size(); a++) {
            newbucket[array.get(a)]++;
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
