package com.xiaogang.learn.javaBasics.f_ClassAndObj;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/11 22:32
 */
public class ClassAndObj3 {

    public static void main(String[] args) {
        /**
         * 类和类之间的关系有如下几种:
         * 以Hero为例
         * 自身：指的是Hero自己
         * 同包子类：ADHero这个类是Hero的子类，并且和Hero处于同一个包下
         * 不同包子类：Support这个类是Hero的子类，但是在另一个包下
         * 同包类： GiantDragon 这个类和Hero是同一个包，但是彼此没有继承关系
         * 其他类：Item这个类，在不同包，也没有继承关系的类
         */

        /**
         * default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
         * private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
         * public : 对所有类可见。使用对象：类、接口、变量、方法
         * protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
         */
    }

}
