package com.xiaogang.learn.javaBasics.h_NumberAndStrings;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 字符
 * @创建日期 : 2020-05-27 13:55
 */
public class NumberAndStrings2 {

    public static void main(String[] args) {

        /**
         * 保存一个字符的时候用char
         */
        char c1 = 'a';
        char c2 = '1';//字符1,而非数字1
        char c3 = '中';//汉字字符
        //char c4 = 'ab'; //只能放一个字符

        Character c = c1; //自动装箱
        c1 = c;//自动拆箱

        System.out.println("使用\\t制表符可以达到对齐的效果");
        System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");

        System.out.println("一个\\t制表符长度是8");
        System.out.println("12345678def");

        System.out.println("换行符 \\n");
        System.out.println("abc\ndef");

        System.out.println("单引号 \\'");
        System.out.println("abc\'def");
        System.out.println("双引号 \\\"");
        System.out.println("abc\"def");
        System.out.println("反斜杠本身 \\");
        System.out.println("abc\\def");

        /**
         * 创建字符串
         * 不可被修改
         */
        //字面值,虚拟机碰到字面值就会创建一个字符串对象
        String garen ="盖伦";
        //创建了两个字符串对象
        String teemo = new String("提莫");
        char[] cs = new char[]{'崔','斯','特'};
        //  通过字符数组创建一个字符串对象
        String hero = new String(cs);
        //  通过+加号进行字符串拼接
        String hero3 = garen + teemo;

        /**
         * 获取字符
         */
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
        char c11 = sentence.charAt(0);
        System.out.println(c11);

        /**
         * 获取对应的字符数组
         */
        char[] cs1 = sentence.toCharArray();
        System.out.println(sentence.length() == cs1.length);

        /**
         * 截取字符串
         */
        //从3开始往后截取
        String subString1 = sentence.substring(3);
        System.out.println(subString1);
        String subString2 = sentence.substring(3,5);
        System.out.println(subString2);

        /**
         * 分割
         */
        String[] subSentences = sentence.split(",");

        /**
         * 去掉首位空格
         */
        System.out.println(sentence.trim());

        /**
         * 大小写转换
         */
        String sentence1 = "Garen";
        //全部变成小写
        System.out.println(sentence1.toLowerCase());
        //全部变成大写
        System.out.println(sentence1.toUpperCase());

        /**
         * 定位
         */
        //字符第一次出现的位置
        System.out.println(sentence.indexOf('8'));
        //字符串第一次出现的位置
        System.out.println(sentence.indexOf("超神"));
        //字符串最后出现的位置
        System.out.println(sentence.lastIndexOf("了"));
        //从位置5开始，出现的第一次,的位置
        System.out.println(sentence.indexOf(',',5));
        //是否包含字符串"击杀"
        System.out.println(sentence.contains("击杀"));

        /**
         * 替换
         */
        //替换所有的
        String temp = sentence.replaceAll("击杀", "被击杀");
        temp = temp.replaceAll("超神", "超鬼");
        System.out.println(temp);
        //只替换第一个
        temp = sentence.replaceFirst(",","");
        System.out.println(temp);

        /**
         * 比较
         */
        String str1 = "the light";
        String str2 = new String(str1);
        String str3 = str1.toUpperCase();
        //==用于判断是否是同一个字符串对象
        System.out.println( str1  ==  str2);
        //完全一样返回true
        System.out.println(str1.equals(str2));
        //大小写不一样，返回false
        System.out.println(str1.equals(str3));
        //忽略大小写的比较，返回true
        System.out.println(str1.equalsIgnoreCase(str3));

        /**
         * 开始结束
         */
        String start = "the";
        String end = "Ight";
        //以...开始
        System.out.println(str1.startsWith(start));
        //以...结束
        System.out.println(str1.endsWith(end));
    }

}
