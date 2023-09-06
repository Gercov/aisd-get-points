package ex3;

import java.util.ArrayList;
import java.util.List;

public class Tree {
  private Tree left;
  private Tree right;
  private int key;

  Tree(int inputKey) {
    key = inputKey;
  }

  public void insert(Tree treeToAdd) {
    TreeSortIteration.iteration++;

    if (treeToAdd.key < key) {
      if (left == null)
        left = treeToAdd;
      else
        left.insert(treeToAdd);
    } else {
      if (right != null)
        right.insert(treeToAdd);
      else
        right = treeToAdd;
    }
  }

  private void assembly(List<Integer> resultArray) {
    if (left != null)
      left.assembly(resultArray);

    resultArray.add(key);

    if (right != null)
      right.assembly(resultArray);
  }

  public List<Integer> sort() {
    List<Integer> resultArray = new ArrayList<>();
    assembly(resultArray);

    return resultArray;
  }
}
