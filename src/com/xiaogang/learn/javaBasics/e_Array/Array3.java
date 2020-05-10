package com.xiaogang.learn.javaBasics.e_Array;

import java.util.Arrays;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/10 14:20
 */
public class Array3 {

    public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

        //复制数组
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 3);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        //转成字符串
        String content = Arrays.toString(a);
        System.out.println(content);

        //排序
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));

        /**
         * 搜索，Arrays.binarySearch搜索前，必须先用sort排序
         */
        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));

        /**
         * 比较两个数组的内容是否相同,位置不同也是不同
         */
        int aa[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int bb[] = new int[] { 18, 62, 68, 82, 65, 8 };
        int cc[] = new int[] { 18, 62, 68, 82, 9, 65 };
        System.out.println(Arrays.equals(aa, bb));
        System.out.println(Arrays.equals(aa, cc));

        /**
         * 使用同一个值，填充整个数组
         */
        Arrays.fill(cc,4);
        System.out.println(Arrays.toString(cc));


    }

}
