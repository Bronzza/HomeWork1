package com.company.repin;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int firstIndex, int lastIndex) {

        if (lastIndex <= firstIndex) {
            return;
        }
        int mid = firstIndex + (lastIndex - firstIndex) / 2;
        mergeSort(arr, firstIndex, mid);
        mergeSort(arr, mid + 1, lastIndex);

        int[] buf = Arrays.copyOf(arr, arr.length);

        for (int i = firstIndex; i <= lastIndex; i++){
            buf[i] = arr[i];
        }

        int beginCounter = firstIndex, midCounter = mid + 1;
        for (int j = firstIndex; j <= lastIndex; j++) {
            if (beginCounter > mid) {
                arr[j] = buf[midCounter];
                midCounter++;
            } else if (midCounter > lastIndex) {
                arr[j] = buf[beginCounter];
                beginCounter++;
            } else if (buf[midCounter] < buf[beginCounter]) {
                arr[j] = buf[midCounter];
                midCounter++;
            } else {
                arr[j] = buf[beginCounter];
                beginCounter++;
            }
        }
    }
}
