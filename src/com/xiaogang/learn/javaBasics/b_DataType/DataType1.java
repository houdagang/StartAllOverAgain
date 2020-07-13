package com.xiaogang.learn.javaBasics.b_DataType;

import com.xiaogang.learn.javaBasics.a_HelloWorld.HelloWorld;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 字面值
 * @创建日期 : 2020/4/27 20:31
 */
public class DataType1 {

    public static String getType(Object o) {   //获取变量类型
        return o.getClass().toString(); //使用int类型的getClass()方法
    }

    int i = 1;

    public void print(int i) {
        //返回该类的i
        System.out.println(this.i);

        //返回参数
        System.out.println(i);
    }

    public static void main(String[] args) {
        long val = 26L; //以L结尾的字面值表示long型
        int decVal = 26; //默认就是int型
        int hexVal = 0x1a; //16进制 0x开头
        int oxVal = 032; //8进制 0开头
        int binVal = 0b11010; //2进制 0b开头
        System.out.println(oxVal);
        System.out.println(binVal);

        //byte的范围
        byte b = 127;
        byte b1 = -128;

        /*---------------强制转换----------------*/
        char c = 'A';
        short s = 80;
        //虽然short和char都是16位的，长度是一样的
        //但是彼此之间，依然需要进行强制转换
        //c = (char) s;
        //System.out.println(c);
        //直接进行转换，会出现编译错误
        s = (short) c;
        System.out.println(s);

        //精度高的数据类型就像容量大的杯子，可以放更大的数据
        //精度低的数据类型就像容量小的杯子，只能放更小的数据
        //byte-->short(char)-->int-->long-->float-->double

        /**
         * 题目 short相加为啥会成为int
         */
        short s1 = 1;
        short s2 = 2;
        System.out.println(s1 + s2);
        System.out.println(getType(s1 + s2));

        System.out.println("--------------打印方法---------------");
        new DataType1().print(5);
    }

}
