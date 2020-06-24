package com.xiaogang.learn.javaBasics.o_Multithreading.entity;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-24 13:15
 */
public class Battle implements Runnable {

    private Hero h1;
    private Hero h2;

    public Battle(Hero h1,Hero h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    @Override
    public void run() {
        while(!h2.isDead()) {
            h1.attackHero(h2);
        }
    }
}
