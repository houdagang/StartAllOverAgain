package com.xiaogang.learn.javaBasics.i_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-05-27 15:06
 */
public class DateTest1 {

    public static void main(String[] args) {
        /**
         * y 代表年
         * M 代表月
         * d 代表日
         * H 代表24进制的小时
         * h 代表12进制的小时
         * m 代表分钟
         * s 代表秒
         * S 代表毫秒
         */
        //格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String str = sdf.format(new Date());
        System.out.println(str);

        /**
         * 字符串转日期
         * 模式（yyyy/MM/dd HH:mm:ss）需要和字符串格式保持一致，如果不一样就会抛出解析异常ParseException
         */
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str1 = "2016-01-05 12:12:12";
        try {
            Date d = sdf1.parse(str1);
            System.out.printf("字符串 %s 通过格式  yyyy-MM-dd HH:mm:ss %n转换为日期对象: %s",str1,d.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
