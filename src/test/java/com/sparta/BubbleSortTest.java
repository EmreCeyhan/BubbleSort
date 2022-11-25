package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    @DisplayName("Testing arrays")
    void bubbleSorterTest() {

        int [] arrayToTest = {10, 5, 3, 1, 24, 12};
        int [] result = BubbleSort.bubbleSorter(arrayToTest,arrayToTest.length);
        int[] expected ={1, 3, 5, 10, 12, 24 };
        assertArrayEquals(expected, result);


    }
}