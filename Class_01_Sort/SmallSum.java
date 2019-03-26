package com.sort;

/**
 * 小和问题
    在一个数组中，每一个数左边比当前数小的数累加起来，叫做这个数组的小和。求一个数组
    的小和。
    例子：
    [1,3,4,2,5]
    1左边比1小的数，没有；
    3左边比3小的数，1；
    4左边比4小的数，1、3；
    2左边比2小的数，1；
    5左边比5小的数，1、3、4、2；
    所以小和为1+1+3+1+1+3+4+2=16
 */
public class SmallSum {

    public static int mergeSort(int arr[], int L, int R){
        if (L == R) {
            return 0;
        }

        int mid = (L + ((R - L) >> 1));
        return mergeSort(arr, L, mid) + mergeSort(arr, mid + 1, R) + merge(arr, L, mid, R);
    }

    public static int merge(int arr[], int L, int m, int R){
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = m + 1;
        int res = 0;

        while (p1 <= m && p2 <= R) {
            res += arr[p1] < arr[p2] ? (R - p2 + 1) * arr[p1] : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1 <= m) {
            help[i++] = arr[p1++];
        }
        while(p2 <= R) {
            help[i++] = arr[p2++];
        }

        for (int j = 0; j < help.length; j++) {
            arr[L + j] = help[j];
        }

        return res;
    }

    public static void main(String[] args){
        int[] arrs = {7, 1, 3, 2, 5, 4};
        int arrs_length = arrs.length;

        if (arrs == null || arrs_length < 2) {
            return ;
        }

        System.out.println(mergeSort(arrs, 0, arrs_length - 1));
    }
}
