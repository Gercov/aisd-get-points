package ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(1000);

    for (int i = 0; i < 1000; i++) {
      list.add((int) (Math.random() * Integer.MAX_VALUE));
    }

    TreeSortIteration.sort(list);
    System.out.println(TreeSortIteration.iteration);

    // BucketSort
    int[] array = new int[1000];

    for (int i = 0; i < 1000; i++) {
      array[i] = (int) (Math.random() * 100000);
    }

    int[] sortArray = BucketSortIteration.sort(array);
    System.out.println(BucketSortIteration.iteration);
  }
}
