package com.xiaogang.learn.javaBasics.i_Date;

import java.util.Date;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-05-27 14:58
 */
public class DateTest {

    public static void main(String[] args) {

        /**
         * 时间原点
         * 所有的数据类型，无论是整数，布尔，浮点数还是字符串，最后都需要以数字的形式表现出来。
         * 日期类型也不例外，换句话说，一个日期，比如2020年10月1日，在计算机里，会用一个数字来代替。
         * 那么最特殊的一个数字，就是零. 零这个数字，就代表Java中的时间原点，其对应的日期是1970年1月1日 8点0分0秒 。 (为什么是8点，因为中国的太平洋时区是UTC-8，刚好和格林威治时间差8个小时)
         * 为什么对应1970年呢？ 因为1969年发布了第一个 UNIX 版本：AT&T，综合考虑，当时就把1970年当做了时间原点。
         * 所有的日期，都是以为这个0点为基准，每过一毫秒，就+1。
         */
        // 当前时间
        Date d1 = new Date();
        System.out.println("当前时间:");
        System.out.println(d1);
        System.out.println();
        // 从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
        System.out.println(d2);

        //getTime() 得到一个long型的整数
        //这个整数代表 1970.1.1 08:00:00:000，每经历一毫秒，增加1
        System.out.println("当前时间getTime()返回的值是：" + d1.getTime());

        /**
         * new Date().getTime() 和 System.currentTimeMillis() 是一样的
         * 不过由于机器性能的原因，可能会相差几十毫秒，毕竟每执行一行代码，都是需要时间的
         */
        System.out.println("System.currentTimeMillis() \t返回值: "+System.currentTimeMillis());
    }

}
