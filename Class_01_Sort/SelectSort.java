package com.sort;

/**
 * 选择排序算法
 */
public class SelectSort {

    public static void main(String[] args){
        int[] arrays = {2, 4, 3, 6, 7, 8, 1, 9};
        int arrays_length = arrays.length;

        if (arrays == null || arrays.length < 2) {
            return;
        }

        for (int i = 1; i < arrays_length; i++) {
            int index = 0;
            for (int j = 1; j <= arrays_length - i; j++) {
                if (arrays[index] < arrays[j]) {
                    index = j;
                }
            }
            swap(arrays, index, (arrays_length - i));
        }
        //输出排序后的数组元素
        for (int i = 0; i < arrays_length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }

    public static void swap(int[] arrays, int i, int j) {
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

}
