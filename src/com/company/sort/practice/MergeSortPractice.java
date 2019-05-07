package com.company.sort.practice;

import java.util.Arrays;

public class MergeSortPractice {


    public static void main(String[] args) {
        int a[] = {51, 46, 20, 18, 65, 97, 82, 30, 77, 50};
        mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }

    public static void mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
        }
        helper(a, low, mid, high);

    }


    public static void helper(int[] a, int low, int mid, int high) {
        int indexLow = low;
        int indexHigh = mid + 1;
        int indexTemp = 0;
        int[] temp = new int[high - low + 1];
        while (indexLow <= mid && indexHigh <= high) {
            if (a[indexLow] < a[indexHigh]) {
                temp[indexTemp++] = a[indexLow++];
            } else {
                temp[indexTemp++] = a[indexHigh++];
            }
        }
        while(indexLow <= mid) {
            temp[indexTemp++] = a[indexLow++];
        }
        while(indexHigh <= high) {
            temp[indexTemp++] = a[indexHigh++];
        }
        for (int i = 0; i < temp.length; i++) {
            a[i+low] = temp[i];
        }
    }

}
