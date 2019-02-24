package com.company.repin;

import static com.company.repin.UtilClassSort.*;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }
}
