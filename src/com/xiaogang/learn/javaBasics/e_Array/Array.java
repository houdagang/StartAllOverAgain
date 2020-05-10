package com.xiaogang.learn.javaBasics.e_Array;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 数组
 * @创建日期 : 2020/5/8 22:17
 */
public class Array {

    public static void main(String[] args) {
        /**
         * int[] a; 表示声明了一个int数组变量，但不会创建数组
         */
        //创建了一个长度是5的数组，用变量a代替
        int[] a = new int[5];
        //各个位置赋值，超过长度会越界
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        //a[5] = 6;

        //上面的赋值还可以这样
        int[] b = new int[]{1,2,3,4,5};
        int[] c = {1,2,3,4,5};
    }

}
