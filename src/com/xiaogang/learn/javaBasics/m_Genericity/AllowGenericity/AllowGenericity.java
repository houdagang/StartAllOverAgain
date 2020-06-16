package com.xiaogang.learn.javaBasics.m_Genericity.AllowGenericity;

import com.xiaogang.learn.javaBasics.f_ClassAndObj.bean.Item;

import java.util.LinkedList;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-16 16:42
 */
public class AllowGenericity<T> {

    //在类的声明上加上<T>，表示该类支持泛型
    //T是type的缩写，当然其实<>中可以随便写，但一般约定为T

    LinkedList<T> values = new LinkedList<>();

    public void push(T t) {
        values.addLast(t);
    }

    public T pull() {
        return values.removeLast();
    }

    public T peek() {
        return values.getLast();
    }

    public static void main(String[] args) {
        //在声明这个Stack的时候，使用泛型<Hero>就表示该Stack只能放Hero
        AllowGenericity<Integer> heroStack = new AllowGenericity<>();
        heroStack.push(1);
        //不能放Item
        heroStack.push(2);

        //在声明这个Stack的时候，使用泛型<Item>就表示该Stack只能放Item
        AllowGenericity<Item> itemStack = new AllowGenericity<>();
        itemStack.push(new Item());
        //不能放Integer
        //itemStack.push(3);
    }
}
