package com.company.repin;

import static com.company.repin.UtilClassSort.swap;

public class SelectionSort {
    public static void selectionSort(int[] numbers) {
        int tempIndex;

        for (int i = 0; i < numbers.length - 1; i++) {
            tempIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[tempIndex])
                    tempIndex = j;
            }
            swap(numbers, i, tempIndex);
        }
    }
}
