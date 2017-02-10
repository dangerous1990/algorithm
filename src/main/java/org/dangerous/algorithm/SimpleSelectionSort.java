package org.dangerous.algorithm;

import java.util.Arrays;

/**
 * 简单选择排序，每次查到未排序中最新元素的索引，
 * Created by Administrator on 2017/2/10.
 */
public class SimpleSelectionSort {
    public static void main(String[] args) {
        SimpleSelectionSort sss = new SimpleSelectionSort();
        sss.test();
    }

    public void test() {
        Integer[] nums = {7, 6, 8, 4, 1, 2, 3, 0};
        for (int i = 0; i < nums.length; i++) {
            int min_index = i;//记录最小值位置 默认记录当前位置
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] < nums[min_index]) {
                    min_index = j;
                }
            }
            if (i != min_index) {//如果I位就是最小值，不进行移动
                int temp = nums[min_index];
                nums[min_index] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }


}
