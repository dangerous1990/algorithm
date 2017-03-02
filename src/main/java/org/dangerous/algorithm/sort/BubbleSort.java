package org.dangerous.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序原理，利用交换，第一次把最大的值交换到最后
 * Created by Administrator on 2017/2/10.
 */
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort();
    }

    public void bubbleSort() {
        Integer[] nums = {7, 6, 8, 4, 1, 2, 3, 0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
}
