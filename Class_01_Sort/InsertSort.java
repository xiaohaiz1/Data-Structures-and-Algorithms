package com.sort;

/**
 * 插入排序
 * 1、从第一个元素开始，该元素可以认为已经被排序；
 * 2、取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 3、如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 4、重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 5、将新元素插入到该位置后；
 * 6、重复步骤2~5。
 */
public class InsertSort {

    public static void main(String[] args){
        int[] arrays = {2, 4, 3, 6, 7, 8, 1, 9, 5};
        int index = 0;
        int current = 0;

        if (arrays == null || arrays.length < 2) {
            return;
        }

        for (int i = 1; i < arrays.length; i++) {
            index = i - 1;
            current = arrays[i];

            while (index >= 0 && arrays[index] > current) {
                arrays[index + 1] = arrays[index];
                index--;
            }
            arrays[index + 1] = current;
        }

        for (int j = 0; j < arrays.length; j++) {
            System.out.print(arrays[j] + " ");
        }
    }

}
