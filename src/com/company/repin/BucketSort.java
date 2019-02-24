package com.company.repin;

public class BucketSort {
    public static void sortBucket(int[] array) {
        int maxElement = getMaxElement(array);
        int[] bucket = new int[maxElement + 1];

        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }

        int counterPosition = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[counterPosition++] = i;
            }
        }
    }

    private static int getMaxElement(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
