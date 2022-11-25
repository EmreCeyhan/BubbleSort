package com.sparta;

public class Start {

    public void start() {
        BubbleSort b = new BubbleSort();
        int[] array = {10, 5, 3, 1, 24, 12};
        int[] sortedArray;
        int length = array.length;
        sortedArray = b.bubbleSorter(array,length);
        for (int i = 0; i < length; ++i) {
            System.out.print(sortedArray[i] + " ");
        }

    }

}
