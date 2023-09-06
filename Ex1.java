import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex1 {
  public static void main(String[] args) throws IOException {
    int[] array1 = new int[] { 1, 2, 2, 2, 3, 4, 5, 6, 3, 3, 3 };
    int[] array2 = new int[] { 1, 2, 2, 3, 4, 5, 6, 3 };

    Arrays.stream(Ex1.run(array1, array2)).forEach(l -> System.out.print(l + " "));
  }

  public static int[] run(int[] array1, int[] array2) {
    if (array1 == null || array2 == null) {
      throw new NullPointerException("array1 or array2 are not initialized");
    } else {
      return ex1(array1, array2);
    }
  }

  private static int[] ex1(int[] array1, int[] array2) {
    Map<Integer, Integer> map1 = new HashMap<>();
    Map<Integer, Integer> map2 = new HashMap<>();

    fillMap(array1, map1);
    fillMap(array2, map2);

    List<Integer> list = new ArrayList<>();

    for (Integer item : array1) {
      if (map1.get(item) != null && map2.get(item) != null) {
        if (map1.get(item) <= map2.get(item)) {
          for (int j = 0; j < map1.get(item); j++) {
            list.add(item);
          }

          map1.remove(item);
        } else {
          for (int j = 0; j < map2.get(item); j++) {
            list.add(item);
          }

          map2.remove(item);
        }
      }
    }

    int[] resultArray = new int[list.size()];

    for (int i = 0; i < list.size(); i++) {
      resultArray[i] = list.get(i);
    }

    return resultArray;
  }

  private static void fillMap(int[] array, Map<Integer, Integer> map) {
    for (Integer item : array) {
      if (map.get(item) == null) {
        map.put(item, 1);
      } else {
        map.put(item, map.get(item) + 1);
      }
    }
  }
}
