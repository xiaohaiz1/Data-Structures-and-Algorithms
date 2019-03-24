package com.sort;

/**
 * 直接排序算法
 */
public class DirectSort {

    public static void main(String[] args){
        int[] arrays = {2, 4, 3, 6, 7, 8, 1, 9};
        int arrays_length = arrays.length;
        for (int i = 1; i < arrays_length; i++) {
            int index = 0;
            for (int j = 1; j <= arrays_length - i; j++) {
                if (arrays[index] < arrays[j]) {
                    index = j;
                }
            }
            int temp = arrays[index];
            arrays[index] = arrays[arrays_length - i];
            arrays[arrays_length - i] = temp;
        }
        //输出排序后的数组元素
        for (int i = 0; i < arrays_length; i++) {
            System.out.println(arrays[i]);
        }
    }

}
