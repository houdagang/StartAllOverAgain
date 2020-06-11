package com.xiaogang.learn.javaBasics.h_NumberAndStrings;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-05-27 14:36
 */
public class NumberAndStrings3 {

    public static void main(String[] args) {

        /**
         * StringBuffer是可变长的字符串
         */
        String str1 = "let there";
        //根据str1创建一个StringBuffer对象
        StringBuffer sb = new StringBuffer(str1);
        sb.append(" be light");
        System.out.println(sb);
        sb.delete(4,10);
        System.out.println(sb);
        //在4这个位置插入 there
        sb.insert(4, "there ");
        System.out.println(sb);
        sb.reverse(); //反转
        System.out.println(sb);

        /**
         * 和String内部是一个字符数组一样，StringBuffer也维护了一个字符数组。 但是，这个字符数组，留有冗余长度
         * 比如说new StringBuffer("the")，其内部的字符数组的长度，是19，而不是3，这样调用插入和追加，在现成的数组的基础上就可以完成了。
         * 如果追加的长度超过了19，就会分配一个新的数组，长度比原来多一些，把原来的数据复制到新的数组中，看上去 数组长度就变长了 参考
         */
        //内容长度
        System.out.println(sb.length());
        //总空间(和jdk版本有关)
        System.out.println(sb.capacity());
    }

}
