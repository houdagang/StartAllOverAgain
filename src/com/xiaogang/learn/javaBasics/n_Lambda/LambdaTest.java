package com.xiaogang.learn.javaBasics.n_Lambda;

import com.xiaogang.learn.javaBasics.k_IO.Test5Bean.Hero;
import com.xiaogang.learn.javaBasics.n_Lambda.testInterface.HeroChecker;
import com.xiaogang.learn.javaBasics.n_Lambda.testObj.HeBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-22 16:58
 */
public class LambdaTest {


    /**
     * Lambda表达式虽然带来了代码的简洁，但是也有其局限性。
     * 1. 可读性差，与啰嗦的但是清晰的匿名类代码结构比较起来，
     *      Lambda表达式一旦变得比较长，就难以理解
     * 2. 不便于调试，很难在Lambda表达式中增加调试信息，比如日志
     * 3. 版本支持，Lambda表达式在JDK8版本中才开始支持，如果系统使用的是以前的版本，
     *      考虑系统的稳定性等原因，而不愿意升级，那么就无法使用。
     * @param args
     */
    public static void main(String[] args) {

        Random r = new Random();
        List<HeBean> heros = new ArrayList<>();
        for(int i = 0;i < 5;i++) {
            heros.add(new HeBean("hero " + i,r.nextInt(1000),r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用匿名类的方式，筛选出 hp>100 && damange<50的英雄");

        HeroChecker checker = new HeroChecker() {
            @Override
            public boolean test(HeBean h) {
                return (h.hp > 100 && h.damage < 50);
            }
        };

        // 把new HeroChcekcer，方法名，方法返回类型信息去掉
        // 只保留方法参数和方法体
        // 参数和方法体之间加上符号 ->
        HeroChecker c2 = (HeBean h) -> {
            return (h.hp > 100 && h.damage < 50);
        };

        // 把return和{}去掉
        HeroChecker c3 = (HeBean h) -> (h.hp > 100 && h.damage < 50);

        // 把 参数类型(当一个参数的时候，可以去掉参数类型)和圆括号去掉
        HeroChecker c4 = h -> (h.hp > 100 && h.damage < 50);

        filter(heros,checker);
    }

    private static void filter(List<HeBean> heros,HeroChecker checker) {
        for(HeBean hero : heros) {
            if(checker.test(hero)) {
                System.out.println(hero);
            }
        }
    }

}
