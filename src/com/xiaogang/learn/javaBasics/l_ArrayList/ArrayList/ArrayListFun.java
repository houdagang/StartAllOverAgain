package com.xiaogang.learn.javaBasics.l_ArrayList.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 常用方法
 * @创建日期 : 2020-06-11 14:31
 */
public class ArrayListFun {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        //增加
        list.add("1");
        list.add("1");
        //判断是否存在(布尔型)
        System.out.println(list.contains("1"));
        //获取指定位置的对象
        System.out.println(list.get(1));
        //获取对象所在的位置(没有返回-1,返回第一个出现的位置)
        System.out.println(list.indexOf("1"));
        //删除（删除第一个出现的）
        list.remove("1");
        //替换
        list.set(0,"2");
        //获取大小
        System.out.println(list.size());
        //转成数组
        System.out.println(list.toArray(new String[]{}).length);
        //把另一个容器的所有的对象加进来
        list.addAll(new ArrayList<>());
        //清空
        list.clear();

        /**
         * 如果list未添加泛型，则可以往里面放任何东西。添加了泛型只能放对应的类型
         */

        /**
         * 遍历list的方法
         * 1.for循环
         * 2.迭代器
         * 3.增强for循环
         */
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it);
        }
    }

}
