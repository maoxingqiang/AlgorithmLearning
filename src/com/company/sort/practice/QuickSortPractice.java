package com.company.sort.practice;

import java.util.Arrays;

public class QuickSortPractice {
    public static void main(String[] args) {
        int a[] = {51, 46, 20, 18, 65, 97, 82, 30, 77, 50};
        quick_sort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }

    public static void quick_sort(int[] a, int low, int high) {
        if(low > high)
            return;
        System.out.println("low：" +low);
        System.out.println("higj：" +high);
        int leftIndex = low;
        int rightIndex = high;
        int pivot = a[high];

        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && a[leftIndex] < pivot) {
                leftIndex++;
            }
            while (leftIndex < rightIndex && a[rightIndex] >= pivot) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                int temp1 = a[leftIndex];
                a[leftIndex] = a[rightIndex];
                a[rightIndex] = temp1;
            }
        }
        //Where is the pivot
        int temp = a[high];
        System.out.println("a[high]：" +a[high]);
        System.out.println("posistion：" + rightIndex);

        a[high] = a[rightIndex];
        a[rightIndex] = temp;
        quick_sort(a, low, rightIndex -1);
        quick_sort(a, rightIndex + 1, high);
    }

}
