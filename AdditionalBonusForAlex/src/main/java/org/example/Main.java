package org.example;


import ex3.BucketSortIteration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        /*
        // 1 задание
        int[] array1 = new int[]{1,2,2,2,3,4,5,6,3,3,3};
        int[] array2 = new int[]{1,2,2,3,4,5,6,3};
        Arrays.stream(Ex1.run(array1,array2)).forEach(l-> System.out.print(l+" "));*/


        // 2 задание
        /*int a = 6054;
        int b = 234;
        System.out.println(Ex2.run(a,b));*/


        //3 задание
        //Tree sort
        /*List<Integer> list = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            list.add((int) (Math.random()*Integer.MAX_VALUE));
        }
        TreeSort.sort(list);
        System.out.println(TreeSort.iteration);*/


        //BucketSort
        /*List<Integer> list = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            list.add((int) (Math.random()*100000));
        }
        int[] sortArray = BucketSortIteration.sort(list);
        System.out.println(BucketSortIteration.iteration);*/
    }
}
