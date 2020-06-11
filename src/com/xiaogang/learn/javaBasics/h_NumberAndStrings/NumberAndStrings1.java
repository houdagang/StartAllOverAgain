package com.xiaogang.learn.javaBasics.h_NumberAndStrings;

import java.util.Locale;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-05-26 17:15
 */
public class NumberAndStrings1 {

    public static void main(String[] args) {

        /**
         * 数学方法
         */
        float f1 = 5.4f;
        float f2 = 5.5f;
        //5.4四舍五入 为5
        System.out.println(Math.round(f1));
        //5.5四舍五入 为6
        System.out.println(Math.round(f2));

        //得到一个0-1之间的随机浮点数（取不到1）
        System.out.println(Math.random());

        //得到一个0-10之间的随机整数（取不到10）
        System.out.println((int)(Math.random() *10));

        //开方
        System.out.println(Math.sqrt(9));
        //次方(2的4次方)
        System.out.println(Math.pow(2,4));

        //π
        System.out.println(Math.PI);

        //自然常数
        System.out.println(Math.E);

        /**
         * 格式化输出
         * %s 表示字符串
         * %d 表示数字(整形)
         * %n 表示换行
         * 1）在DOS和Windows中，每行结尾是 “\r\n”；
         * 2）Linux系统里，每行结尾只有 “\n”；
         * 3）Mac系统里，每行结尾是只有 "\r"。
         * 为了使得同一个java程序的换行符在所有的操作系统中都有一样的表现，使用%n，就可以做到平台无关的换行
         */
        String name ="盖伦";
        int kill = 8;
        String title="超神";
        //直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
        String sentence = name+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";
        System.out.println(sentence);
        //使用格式化输出
        //%s表示字符串，%d表示数字,%n表示换行
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        System.out.printf(sentenceFormat,name,kill,title);
        System.out.format(sentenceFormat,name,kill,title);


        int year = 2020;
        //总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达

        //直接打印数字
        System.out.format("%d%n",year);
        //总长度是8,默认右对齐
        System.out.format("%8d%n",year);
        //总长度是8,左对齐
        System.out.format("%-8d%n",year);
        //总长度是8,不够补0
        System.out.format("%08d%n",year);
        //千位分隔符
        System.out.format("%,8d%n",year*10000);

        //小数点位数
        System.out.format("%.2f%n",Math.PI);

        //不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);

    }

}
