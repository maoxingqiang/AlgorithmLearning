package com.company.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {51, 46, 20, 18, 65, 97, 82, 30, 77, 50};
        quick_sort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }

    static void quick_sort(int[] a, int low, int high) {
        if(low > high)
            return;
        int i = low;
        int j = high;
        int key = a[low];
        while(i < j) {
            while(i < j && a[j] > key)
                j--;
            while(i < j && a[i] <= key)
                i++;
            if(i < j) {
                System.out.println(i);
                System.out.println(j);
                int p = a[i];
                a[i] = a[j];
                a[j] = p;
            }
        }
        int p = a[i];
        a[i] = a[low];
        a[low] = p;
        System.out.println(Arrays.toString(a));
        quick_sort(a,low,i - 1 );
        quick_sort(a,i + 1,high);
    }
}
