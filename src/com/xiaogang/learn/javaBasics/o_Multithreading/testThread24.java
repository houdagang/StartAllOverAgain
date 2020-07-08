package com.xiaogang.learn.javaBasics.o_Multithreading;

import com.xiaogang.learn.javaBasics.o_Multithreading.entity.Hero;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-28 16:51
 */
public class testThread24 {

    public static void main(String[] args) {

        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 61600;
        gareen.damage = 1;

        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 30000;
        teemo.damage = 1;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 50000;
        bh.damage = 1;

        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 45050;
        leesin.damage = 1;

        Thread t1= new Thread(){
            @Override
            public void run(){
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };

        Thread t2= new Thread(){
            @Override
            public void run(){
                while(!leesin.isDead()){
                    //临时暂停，使得t1可以占用CPU资源
                    /**
                     * 调用Thread.yield()后线程并不一定会立刻停止执行
                     * 方法慎用
                     */
                    Thread.yield();
                    bh.attackHero(leesin);
                }
            }
        };
        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();
    }

}
