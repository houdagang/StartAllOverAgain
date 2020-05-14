package com.xiaogang.learn.javaBasics.f_ClassAndObj;

import com.xiaogang.learn.javaBasics.f_ClassAndObj.bean.HeroSingle;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 
 * @创建日期 : 2020/5/14 20:49
 */
public class ClassAndObj4 {
    
    public static void main(String[] args) {
        /**
         * 这个是面试的时候经常会考的点，面试题通常的问法是:
         * 什么是单例模式？
         * 回答的时候，要答到三元素
         * 1. 构造方法私有化
         * 2. 静态属性指向实例
         * 3. public static的 getInstance方法，返回第二步的静态属性
         */
        //报错
        //HeroSingle g = new HeroSingle();
        //只能通过getInstance得到对象
        HeroSingle g1 = HeroSingle.getHeroSingle();
        HeroSingle g2 = HeroSingle.getHeroSingle();
        HeroSingle g3 = HeroSingle.getHeroSingle();

        //都是同一个对象
        System.out.println(g1 == g2);
        System.out.println(g1 == g3);

    }
    
}
