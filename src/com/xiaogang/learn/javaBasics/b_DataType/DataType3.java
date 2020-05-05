package com.xiaogang.learn.javaBasics.b_DataType;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/4 22:31
 */
public class DataType3 {

    public void print(final int i) {
        //i = 5;    同样这里也不能赋值了，参数传啥就是啥
        System.out.println(i);
    }

    public static void main(String[] args) {

        /**
         * final
         * 当一个变量被final修饰的时候，该变量只有一次赋值的机会
         */
        final int i = 1;
        //i = 2;    这里会报错，因为已经被付过值了
        final int j;
        j = 1;
        //j = 2;    报错

        /**
         * 什么是表达式?
         * 以;结尾的一段代码就是表达式
         */

        /**
         *以{开始，到}结束，叫块
         */
    }
}
