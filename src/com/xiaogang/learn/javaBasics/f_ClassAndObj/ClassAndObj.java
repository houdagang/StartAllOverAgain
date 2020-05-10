package com.xiaogang.learn.javaBasics.f_ClassAndObj;

import com.xiaogang.learn.javaBasics.f_ClassAndObj.bean.Hero;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/10 22:23
 */
public class ClassAndObj {

    public static void main(String[] args) {
        Hero h1 = new Hero();
        Hero h2 = h1;
        Hero h3 = h1;
        Hero h4 = h3;
        //指向了同一个目标
        System.out.println(h2 == h3);
        System.out.println(h2 == h4);
        h1 = new Hero();
        System.out.println(h1 == h3);
        System.out.println(h1 == h4);

        Hero hero1 = new Hero();
        Hero hero2 = new Hero();
        Hero hero3;
        Hero hero4;
        hero3 = hero1;
        hero4 = hero3;
        System.out.println(hero4);
        System.out.println(hero2);
        //true
        System.out.println(hero4.getName() == hero2.getName());
    }

}
