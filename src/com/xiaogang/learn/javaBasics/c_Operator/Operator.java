package com.xiaogang.learn.javaBasics.c_Operator;

import java.util.Scanner;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 操作符号
 * @创建日期 : 2020/5/4 22:41
 */
public class Operator {

    public static void main(String[] args) {
        /**
         * 基本的加减乘除
         */
        int i = 10;
        int j = 5;
        int a = i + j;
        int b = i - j;
        int c = i * j;
        int d = i / j;
        System.out.println("i+j=" + a + " , i-j=" + b + " , i*j=" + c + " , i/j=" + d);

        /**
         * 输入求和
         */
        {
            Scanner scanner = new Scanner(System.in);
            int a1 = scanner.nextInt();
            System.out.println("第一个整数：" + a1);
            int b1 = scanner.nextInt();
            System.out.println("第二个整数：" + b1);
            System.out.println("两个数的和是：" + String.valueOf((a1 + b1)));
        }

        /**
         * 单位长度超过int
         */
        int e = 5;
        long f = 7l;
        int g = (int)(e + f);
        long h = e + f;
        System.out.println(g);
        System.out.println(h);

        /**
         * 运算的单位长度小于int
         */
        byte a2 = 1;
        byte b2= 2;
        byte c2 = (byte) (a2+b2); //虽然a b都是byte类型，但是运算结果是int类型，需要进行强制转换
        int d2 = a+b;
        System.out.println(c2);
        System.out.println(d2);

        /**
         * 取余，又叫做取模
         */
        int i1 = 5;
        int j1 = 2;
        System.out.println(i1 + "和" + j1 + "取余是" +(5 % 2));

        /**
         * 自增自减
         * i++ 先取值再运算，++i 先运算再取值
         * i-- 先取值再运算，--i 先运算再取值
         */
        int in = 10;
        System.out.println(in + "++ =" + in++);
        System.out.println("++" + in + "=" +(++in));
        System.out.println(in + "-- =" + in--);
        System.out.println("--" + in + "=" + --in);

        /**
         * 题目1
         * int i = 1;
         * int j = ++i + i++ + ++i + ++i + i++;
         */
        int aa = 1;
        int bb = ++aa + aa++ + ++aa + ++aa + aa++;
        System.out.println(bb);

        /**
         * 题目2
         * 使用Scanner收集你的身高体重，并计算出你的BMI值是多少
         * BMI的计算公式是 体重(kg) / (身高*身高)
         * 比如邱阳波的体重是72kg, 身高是1.69，那么这位同学的BMI就是
         * 72 / (1.69*1.69) = ?
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的身高（米）：");
        double sg = scanner.nextDouble();
        System.out.println("身高(米)：" + sg);
        System.out.println("请输入您的体重（公斤）：");
        double tz = scanner.nextDouble();
        System.out.println("体重：" + tz);
        System.out.println("你的BMI值是：" + String.valueOf((tz / (sg*sg))));
    }
}
