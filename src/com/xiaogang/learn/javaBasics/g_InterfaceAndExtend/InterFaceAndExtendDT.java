package com.xiaogang.learn.javaBasics.g_InterfaceAndExtend;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/17 11:15
 */
public class InterFaceAndExtendDT {

    public static void main(String[] args) {

        /**
         * 操作符的多态
         */
        int i = 5;
        int j = 6;
        int k = i+j; //如果+号两侧都是整型，那么+代表 数字相加
        System.out.println(k);

        int a = 5;
        String b = "5";

        String c = a+b; //如果+号两侧，任意一个是字符串，那么+代表字符串连接
        System.out.println(c);


        /**
         * 类的多态主要表现在方法的重写
         */

    }

}
