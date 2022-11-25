package com.sparta;

import java.util.Arrays;

public class BubbleSort {
    int[] arrayToSort;
    int arrayLength;

    public static int[] bubbleSorter(int [] arrayToSort, int arrayLength){
        //this.arrayToSort = arrayToSort;
        //this.arrayLength = arrayLength;
        for (int i=0;i<arrayLength-1;++i){

            for(int j=0;j<arrayLength-i-1; ++j){

                if(arrayToSort[j+1]<arrayToSort[j]){
                    System.out.println("field ahead: " + arrayToSort[j+1] + "     current field: " + arrayToSort[j]);

                    int swap = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = swap;
                    System.out.println("field ahead after: " + arrayToSort[j+1] + "     current field after: " + arrayToSort[j]);
                    System.out.println(Arrays.toString(arrayToSort));

                }
            }
        }
        return arrayToSort;
    }


}
