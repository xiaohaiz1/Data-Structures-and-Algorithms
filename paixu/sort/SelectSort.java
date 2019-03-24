package com.sort;

/**
 * 选择排序算法
 */
public class SelectSort {

    public static void main(String[] args){
        int[] arrays = {2, 4, 3, 6, 7, 8, 1, 9};
        for (int i = 1; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - i; j++) {
                if (arrays[j] > arrays[j+1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        //输出排序后的数组元素
        for (int i : arrays) {
            System.out.println(i);
        }
    }

}
