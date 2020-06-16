package com.xiaogang.learn.javaBasics.m_Genericity;

import java.util.ArrayList;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 泛型转型
 * @创建日期 : 2020-06-16 17:25
 */
public class TurnGenericity {

    //根据面向对象学习的知识，子类转父类 是一定可以成功的

    ArrayList<Number> numbers = new ArrayList<>();
    ArrayList<Integer> ints = new ArrayList<>();

    //子类泛型转父类泛型
    // numbers = ints;  报错
}
