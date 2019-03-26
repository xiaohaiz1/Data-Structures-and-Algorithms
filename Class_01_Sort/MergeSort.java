package com.sort;

/**
 * 归并排序
 */
public class MergeSort {

    public static void main(String[] args){
        int[] arrs = {7, 1, 3, 2, 5, 4};
        int arrs_length = arrs.length;

        if (arrs_length < 2 || arrs == null) {
            return;
        }

        mergeSort(arrs, 0, arrs_length - 1);

        for (int i = 0; i < arrs_length; i++) {
            System.out.print(arrs[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int L, int R){
        if (L == R) {
            return;
        }

        int mid = (L + ((R - L) >> 1));  //(L + R)/2
        mergeSort(arr, L, mid);  //T(N/2)
        mergeSort(arr, (mid + 1), R);  //T(N/2)
        merge(arr, L, mid, R);  //O(N)
        //  T(N) = 2(N/2) + O(N)    (T(N) = a(N/b) + O(N^d))
    }

    public static void merge(int arr[], int L, int m, int R){
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = m + 1;

        while(p1 <= m && p2 <= R) {
            //arr[p1]与arr[p2]相比确定排序顺序,这里是谁小填谁
            temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        //两个必有且只有一个越界
        while(p1 <= m) {
            temp[i++] = arr[p1++];
        }
        while(p2 <= R) {
            temp[i++] = arr[p2++];
        }

        for (int j = 0; j < temp.length; j++) {
            arr[L + j] = temp[j];
        }
    }
}
