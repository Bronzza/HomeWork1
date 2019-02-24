package com.company.repin;

public class SelectionSort {
    public static void selectionSort(int[] numbers) {
        int tempIndex, tempNumb;

        for (int i = 0; i < numbers.length - 1; i++) {
            tempIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[tempIndex])
                    tempIndex = j;
            }
            UtilClassSort.swap(numbers, i, tempIndex);
        }
    }
}
