package com.sort;

/**
 * 冒泡排序算法
 */
public class BubbleSort {

    public static void main(String[] args){
        int[] arrays = {2, 4, 3, 6, 7, 8, 1, 9};

        if (arrays == null || arrays.length < 2) {
            return;
        }

        for (int i = 1; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - i; j++) {
                if (arrays[j] > arrays[j+1]) {
                    swap(arrays, j, (j+1));
                }
            }
        }
        //输出排序后的数组元素
        for (int i : arrays) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] arrays, int i, int j) {
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

}
