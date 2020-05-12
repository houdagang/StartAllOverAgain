package com.xiaogang.learn.javaBasics.f_ClassAndObj;

import com.xiaogang.learn.javaBasics.f_ClassAndObj.bean.Hero;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 传参
 * @创建日期 : 2020/5/11 21:49
 */
public class ClassAndObj2 {

    public static void main(String[] args) {

        Hero hero1 = new Hero("亚索",530);
        System.out.println(hero1);
        Hero hero2 = new Hero("盖伦",650);
        Hero hero3 = new Hero("艾希",470);
        hero1.attack(hero1,30);
        hero1.attack1(hero2,30);
        hero1.attack2(hero3,30);

        //看看方法，先想一想输出结果
        System.out.println(hero1.hp);
        System.out.println(hero2.hp);
        System.out.println(hero3.hp);

        //问题
        Hero teemo =  new Hero("提莫",383);
        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;
        System.out.println(teemo);
        teemo.revive(teemo);
        System.out.println(teemo);
        System.out.println(teemo.hp); //输出多少？ 怎么理解？
        //根据打印发现，对象和方法里new的对象不是指的同一个对象

    }

}
