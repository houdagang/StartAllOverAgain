package com.xiaogang.learn.javaBasics.m_Genericity;

import java.util.ArrayList;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 集合中的泛型
 * @创建日期 : 2020-06-16 16:21
 */
public class ListTest {

    public static void main(String[] args) {
        /**
         * 泛型的用法是在容器后面添加<Type>
         * Type可以是类，抽象类，接口
         * 泛型表示这种容器，只能存放Integer，其他放不进去
         */
        ArrayList<Integer> numbers = new ArrayList<>();

        /**
         * 假如泛型是Object，那么任何对象的子类都能放进去。
         * 同理：假如泛型是Hero，ADHero和APHero继承了Hero，则ADHero和APHero也能放进去。
         *      其他无关的放不进去
         */

        ArrayList<Number> list = new ArrayList<>();
        list.add(3.14f);
        list.add(1.2);
        list.add(1);
        //泛型规定了类为数字类，加入字符串报错
        //al.add("1");
        System.out.println(list);

    }

}
