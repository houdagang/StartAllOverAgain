package com.xiaogang.learn.javaBasics.d_ControlFlow;

import java.util.Map;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 流程控制练习
 * @创建日期 : 2020/5/7 22:01
 */
public class Control2 {

    public static void main(String[] args) {
        /**
         * 黄金分割点
         * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
         * 分母和分子不能同时为偶数
         * 分母和分子 取值范围在[1-20]
         */
        double gold_Point = 0.618;
        double like_gold = 1.0d;
        int gold_fz = 1;
        int gold_fm = 1;
        for (int i = 1; i <= 20; i++) {
            for(int j = 1; j <= 20; j++) {
                double a = (double)i/j - gold_Point;
                double b = like_gold - gold_Point;
                double abs1 = Math.abs(a);
                double abs2 = Math.abs(b);
                if(abs1 < abs2) {
                    like_gold = (i/1.0)/j;
                    gold_fz = i;
                    gold_fm = j;
                    System.out.println("外循环是" + i + ",内循环是" + j +",目前的黄金分割点是" + like_gold);
                }
            }
        }
        System.out.println(gold_fz + "/" + gold_fm + "=" + like_gold);

        /**
         * 发现的问题：1/2 = 0；默认的1和2都是整形，整形计算得出整形。加入浮点型之后，结果得出浮点型。
         */


        /**
         * 水仙花数目
         * 水仙花数定义：
         * 1. 一定是3位数
         * 2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
         * 寻找所有的水仙花数
         */
        for(int i = 100; i <= 999;i++) {
            int a = Integer.parseInt(String.valueOf(i).substring(0,1));
            int b = Integer.parseInt(String.valueOf(i).substring(1,2));
            int c = Integer.parseInt(String.valueOf(i).substring(2,3));
            if(i == a*a*a + b*b*b + c*c*c) {
                System.out.println(i + "=" + a +"*"+ a +"*"+ a + "+"+ b +"*"+b+"*"+b+"+"+c+"*"+c+"*"+c);
            }
        }


    }

}
