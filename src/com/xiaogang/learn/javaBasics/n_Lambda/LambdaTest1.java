package com.xiaogang.learn.javaBasics.n_Lambda;

import com.xiaogang.learn.javaBasics.n_Lambda.testInterface.HeroChecker;
import com.xiaogang.learn.javaBasics.n_Lambda.testObj.HeBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-24 9:59
 */
public class LambdaTest1 {

    public static void main(String[] args) {

        Random r = new Random();
        List<HeBean> heros = new ArrayList<HeBean>();
        for (int i = 0; i < 5; i++) {
            heros.add(new HeBean("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        HeroChecker c = new HeroChecker() {
            @Override
            public boolean test(HeBean h) {
                return h.hp>100 && h.damage<50;
            }
        };

        System.out.println("使用匿名类过滤");
        filter(heros, c);
        System.out.println("使用Lambda表达式");
        filter(heros, h->h.hp>100 && h.damage<50);
        System.out.println("在Lambda表达式中使用静态方法");
        filter(heros, h -> LambdaTest1.testHero(h) );
        System.out.println("直接引用静态方法");
        filter(heros, LambdaTest1::testHero);

    }

    public static boolean testHero(HeBean h) {
        return h.hp>100 && h.damage<50;
    }

    private static void filter(List<HeBean> heros, HeroChecker checker) {
        for (HeBean hero : heros) {
            if (checker.test(hero)) {
                System.out.print(hero);
            }
        }
    }

}
