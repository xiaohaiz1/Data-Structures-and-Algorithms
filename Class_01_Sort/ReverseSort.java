package com.sort;

/**
 * 反转排序
 */
public class ReverseSort {

    public static void main(String[] args){
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8};
        int arrays_length = arrays.length;

        System.out.print("反转排序前：");
        for (int j = 0; j < arrays_length; j++) {
            System.out.print(arrays[j] + " ");
        }

        System.out.println();

        for (int i = 0; i < arrays_length/2; i++) {
            int temp = arrays[i];
            arrays[i] = arrays[arrays_length - i -1];
            arrays[arrays_length - i -1] = temp;
        }
        //输出反转排序后的数组元素
        System.out.print("反转排序后：");
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
