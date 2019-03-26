package com.sort;

/**
 * 递归排序
 */
public class DiGui {

    public static void main(String[] args){
        int[] arr = {2,4,6,7};
        System.out.println(getMax(arr, 0, (arr.length - 1)));
    }

    public static int getMax(int[] arr, int L, int R) {
        if (L == R) {
            return arr[L];
        }
        int mid = (L + R)/2;
        int maxLeft = getMax(arr, L, mid);
        int maxRight = getMax(arr, (mid + 1), R);
        return Math.max(maxLeft, maxRight);
    }

}
