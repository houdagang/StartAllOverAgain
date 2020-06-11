package com.xiaogang.learn.javaBasics.i_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-05-27 15:12
 */
public class DateTest2 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        //采用单例模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        //通过日历对象得到日期对象
        Date d = c.getTime();
        System.out.println(d);
        Date d2 = new Date(0);
        System.out.println(d2);
        //把这个日历，调成日期 : 1970.1.1 08:00:00
        //c.setTime(d2);
        //System.out.println(c.getTime());

        Date now = c.getTime();
        // 当前日期
        System.out.println("当前日期：\t" + sdf.format(c.getTime()));
        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +sdf.format(c.getTime()));
        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +sdf.format(c.getTime()));
        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +sdf.format(c.getTime()));
    }

}
