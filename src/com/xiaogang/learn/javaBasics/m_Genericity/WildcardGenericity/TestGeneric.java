package com.xiaogang.learn.javaBasics.m_Genericity.WildcardGenericity;

import java.util.ArrayList;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-16 17:03
 */
public class TestGeneric {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        //ArrayList <? extends Number> numbers 表示这是一个Number泛型或者其子类泛型
        ArrayList <? extends Number> numbers = intList;

        //? extends Number 表示这是一个Number泛型的子类泛型
        //numbers 的泛型可以是Number
        //numbers 的泛型可以使Integer
        //numbers 的泛型可以使Float
        //可以确凿的是，从numbers取出来的对象，一定是可以转型成Number的

        Number h= numbers.get(0);
        //但是，不能往里面放东西
        //numbers.add(2); //编译错误，因为numbers的泛型 有可能是Float

        //ArrayList<? super Float> floatList表示这是一个Float泛型或者其父类的泛型
        ArrayList<? super Float> floatList = new ArrayList<>();
        //可以往里面插入Float及其子类，但是取出来有风险
        floatList.add(1f);

        //泛型通配符？表示容器内可以是任意泛型
        ArrayList<?> generalList = floatList;

        //?的缺陷1： 既然?代表任意泛型，那么换句话说，你就不知道这个容器里面是什么类型
        //所以只能以Object的形式取出来
        Object o = generalList.get(0);

        //?的缺陷2： 既然?代表任意泛型，那么既有可能是Hero,也有可能是Item
        //所以，放哪种对象进去，都有风险，结果就什么什么类型的对象，都不能放进去
        //generalList.add(1); //编译错误 因为?代表任意泛型，很有可能不是
        //generalList.add(1f); //编译错误 因为?代表任意泛型，很有可能不是
        //generalList.add(0.5); //编译错误  因为?代表任意泛型，很有可能不是

    }

}
