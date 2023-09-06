package ex3;

import java.util.List;

public class TreeSortIteration {
  public static int iteration = 0;

  public static List<Integer> sort(List<Integer> inputArray) {
    Tree root = new Tree(inputArray.get(0));

    for (int i = 1; i < inputArray.size(); i++) {
      root.insert(new Tree(inputArray.get(i)));
    }

    return root.sort();
  }
}
