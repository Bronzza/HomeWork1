package com.company.repin;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arrray = new  int[100000];

        long bubbleTime = 0, bucketTime = 0, heapTime = 0, mergeTime = 0, radixTime = 0, selectionTime = 0, insertTime = 0;
        Random rnd = new Random();
        for (int i = 0; i < arrray.length; i++) {
            arrray[i] = rnd.nextInt(1100);
        }
        int[] array2 = new int[arrray.length];
        int[] array3 = new int[arrray.length];
        int[] array4 = new int[arrray.length];
        int[] array5 = new int[arrray.length];
        int[] array6 = new int[arrray.length];
        int[] array7 = new int[arrray.length];
        int[] array8 = new int[arrray.length];
        System.arraycopy(arrray, 0, array2, 0, arrray.length);
        System.arraycopy(arrray, 0, array3, 0, arrray.length);
        System.arraycopy(arrray, 0, array4, 0, arrray.length);
        System.arraycopy(arrray, 0, array5, 0, arrray.length);
        System.arraycopy(arrray, 0, array6, 0, arrray.length);
        System.arraycopy(arrray, 0, array7, 0, arrray.length);
        System.arraycopy(arrray, 0, array8, 0, arrray.length);

        long t1 = System.nanoTime();
        MergeSort.mergeSort(array2, 0, array2.length - 1);
        long t2 = System.nanoTime();
        mergeTime = t2 - t1;

        t1 = System.nanoTime();
        HeapSort.sort(array3);
        t2 = System.nanoTime();
        heapTime = t2 - t1;

        t1 = System.nanoTime();
        RadixSort.radixSort(array4);
        t2 = System.nanoTime();
        radixTime = t2 - t1;

        t1 = System.nanoTime();
        InsertSort.insertSort(array5);
        t2 = System.nanoTime();
        insertTime = t2 - t1;

        t1 = System.nanoTime();
        SelectionSort.selectionSort(array6);
        t2 = System.nanoTime();
        selectionTime = t2 - t1;

        t1 = System.nanoTime();
        BucketSort.sortBucket(array7);
        t2 = System.nanoTime();
        bucketTime = t2 - t1;

        t1 = System.nanoTime();
        BubbleSort.bubbleSort(array8);
        t2 = System.nanoTime();
        bubbleTime = t2 - t1;


        System.out.println("BubbleSort time = " + bubbleTime / 1000000 + "\nBucketSort time = " + bucketTime / 1000000 +
                "\nHeapSort time = " + heapTime / 1000000 + "\nMergeSort time = " + mergeTime / 1000000 +
                "\nRadixSord time = " + radixTime / 1000000 + "\nSelectionSort time = "
                + selectionTime / 1000000 + "\nInsertSort time = " + insertTime / 1000000 + "\n*time in milli seconds");
    }
}
