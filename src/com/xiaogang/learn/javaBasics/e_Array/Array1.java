package com.xiaogang.learn.javaBasics.e_Array;

import java.util.Arrays;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 冒泡排序
 * @创建日期 : 2020/5/10 11:13
 */
public class Array1 {

    public static void main(String[] args) {

        /**
         * 冒泡排序原理：
         * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
         * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样最终最大数被交换到最后的位置
         * 除了最后一个元素以外，针对所有的元素重复以上的步骤
         * 重复步骤1~3，直到排序完成
         */
        int[] list1 = {42,35,47,12,66,23,78,50,4,36};
        for (int i = list1.length;i > 0;i--) {
            for (int j = 0;j < i - 1; j++) {
                if(list1[j] > list1[j + 1]) {
                    list1[j] = list1[j] ^ list1[j + 1];
                    list1[j + 1] = list1[j] ^ list1[j + 1];
                    list1[j] = list1[j] ^ list1[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(list1));


        /**
         * 选择排序
         * 从数组开头遍历，将第一个元素依次与每一个元素比较，记录最小的元素，比较结束后，与第一个元素交换，依次循环
         */
        int[] list2 = {42,35,47,12,66,23,78,50,4,36};
        for (int i = 0; i < list2.length;i++) {
            int min = list2[i];
            int min_index = i;
            int mid;
            for (int j = i+1;j <list2.length;j++) {
                if(min > list2[j]) {
                    min = list2[j];
                    min_index = j;
                }
            }
            mid = list2[i];
            list2[i] = min;
            list2[min_index] = mid;
        }
        System.out.println(Arrays.toString(list2));


        /**
         * 插入排序
         * 插入排序有点类似人类按字母顺序对数据进行排序，就如同你打扑克牌一样，将摸来的扑克按大小放到合适的位置一样。
         * 它的原理就是通过嵌套循环，外循环将数组元素挨个移动，而内循环则对外循环中选中的元素及它后面的元素进行比较；
         * 如果外循环中选中的元素比内循环中选中的元素小，那么数组元素会向右移动，为内循环中的这个元素腾出位置。
         * 实现步骤如下：
         * 从第一个元素开始，该元素默认已经被排序
         * 取出下一个元素，在已经排序的元素序列中从后向前扫描
         * 如果该元素（已排序）大于新元素，将该元素移到下一位置
         * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
         * 将新元素插入到该位置
         * 重复步骤2~5，直到排序完成
         */
        int[] list3 = {42,35,47,12,66,23,78,50,4,36};
        for (int i = 1;i < list3.length;i++) {
            int key = list3[i];
            int j;
            for (j = i - 1;j >= 0 && list3[j] > key;j--) {
                list3[j + 1] = list3[j];
            }
            list3[j + 1] = key;
        }
        System.out.println(Arrays.toString(list3));

    }

}
