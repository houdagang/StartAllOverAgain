package com.xiaogang.learn.javaBasics.g_InterfaceAndExtend;

import com.xiaogang.learn.javaBasics.f_ClassAndObj.bean.AdHero;
import com.xiaogang.learn.javaBasics.f_ClassAndObj.bean.Hero;
import com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.bean.AdApHero;
import com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.bean.ApHero;
import com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.interf.AD;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 接口和继承
 * @创建日期 : 2020/5/15 23:08
 */
public class InterfaceAndExtend {

    public static void main(String[] args) {

        /**
         * 子类向父类转型（向上转型）
         */
        Hero hero = new AdHero(1);

        /**
         * 父类向子类转型（向下转型）
         */
        AdHero hero1 = (AdHero) new Hero();

        /**
         * 实现类转换成接口（向上转型）
         */
        AD ad = new com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.bean.AdHero();
        AD ad1 = new AdApHero();

        /**
         * 接口转换成实现类（向下转型）
         */
        AdHero adHero = (AdHero) ad;


        AdHero ad2 = new AdHero(1);
        ApHero ap = new ApHero();

        Hero h1= ad2;

        //判断引用h1指向的对象，是否是ADHero类型
        System.out.println(h1 instanceof AdHero);

        //判断引用h1指向的对象，是否是Hero的子类型
        System.out.println(h1 instanceof Hero);

    }

}
