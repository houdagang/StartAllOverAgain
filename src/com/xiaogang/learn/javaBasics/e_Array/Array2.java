package com.xiaogang.learn.javaBasics.e_Array;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/10 14:13
 */
public class Array2 {

    public static void main(String[] args) {

        //复制数组
        int a [] = new int[]{18,62,68,82,65,9};
        int b[] = new int[3];//分配了长度是3的空间，但是没有赋值
        //通过数组赋值把，a数组的前3位赋值到b数组
        //方法一： for循环
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        //方法二: System.arraycopy(src, srcPos, dest, destPos, length)
        //src: 源数组
        //srcPos: 从源数组复制数据的起始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度
        System.arraycopy(a, 0, b, 0, 3);

        //把内容打印出来
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }


        //初始化二维数组，
        int[][] a1 = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
        a1[1][2] = 5;  //可以直接访问一维数组，因为已经分配了空间

        //只分配了二维数组
        int[][] b1 = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
        b1[0]  =new int[3]; //必须事先分配长度，才可以访问
        b1[0][2] = 5;

        //指定内容的同时，分配空间
        int[][] c = new int[][]{
                {1,2,4},
                {4,5},
                {6,7,8,9}
        };

    }

}
