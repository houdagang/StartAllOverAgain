package com.xiaogang.learn.javaBasics.h_NumberAndStrings;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 数字与字符串
 * @创建日期 : 2020/5/17 23:08
 */
public class NumberAndStrings {

    public static void main(String[] args) {

        /**
         * 封装类
         * Byte,Short,Integer,Long,Float,Double
         * 这些类都是抽象类Number的子类
         */
        //基本类型转换成封装类
        int i = 6;
        Integer it = new Integer(i);
        //自动装箱
        //不需要调用构造方法，通过=符号自动把 基本类型 转换为 类类型 就叫装箱
        Integer i1 = i;
        //封装类型转换成基本类型
        int i2 = it.intValue();
        //自动转换就叫拆箱
        int i3 = it;
        //int的最大值
        System.out.println(Integer.MAX_VALUE);
        //int的最小值
        System.out.println(Integer.MIN_VALUE);

        /**
         * 数字与字符串
         */
        //数字转成字符串
        int a = 5;
        //方法1
        String str = String.valueOf(a);
        //方法2
        Integer a1 = a;
        String str1 = a1.toString();

        //字符串转成数字
        String str2 = "999";
        int b = Integer.parseInt(str2);

    }

}
