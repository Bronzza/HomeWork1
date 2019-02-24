package com.company.repin;
import static com.company.repin.UtilClassSort.*;

public class HeapSort {

    private static int heapSize;

    public static void sort(int[] array) {
        buildHeap(array);
        while (heapSize > 1) {
            UtilClassSort.swap(array, 0, heapSize - 1);
            heapSize--;
            heapify(array, 0);
        }
    }

    private static void buildHeap(int[] arr) {
        heapSize = arr.length;
        for (int i = arr.length / 2; i >= 0; i--) {
            heapify(arr, i);
        }
    }

    private static void heapify(int[] array, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heapSize && array[i] < array[l]) {
            largest = l;
        }
        if (r < heapSize && array[largest] < array [r]) {
            largest = r;
        }
        if (i != largest) {
            swap(array, i, largest);
            heapify(array, largest);
        }
    }

    private static int right(int i) {
        return 2 * i + 1;
    }

    private static int left(int i) {
        return 2 * i + 2;
    }


}
